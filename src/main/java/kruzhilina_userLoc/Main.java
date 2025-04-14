package kruzhilina_userLoc;

public class Main {
    public static void main(String[] args) {
        Control control = new DamageControl();
        //создаем имитацию событий дважды повышение damage и одно понижение
        int finalDamage = new IncreasedControlDecorator(new DecreaseControlDamage(new IncreasedControlDecorator(control))).getDamage();
        System.out.println(finalDamage);
        //не изменяя основную реализацию DamageControl мы изменили результат через обёртки
    }
}