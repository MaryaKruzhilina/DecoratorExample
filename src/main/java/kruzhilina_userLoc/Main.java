package kruzhilina_userLoc;

public class Main {
    public static void main(String[] args) {
        Control control = new DamageControl();
        //создаем имитацию событий дважды повышение damage(+50) и одно понижение(-50) ожидаемый результат 150
        int finalDamage = new IncreasedControlDamageDecorator(new DecreaseControlDamageDecorator(new IncreasedControlDamageDecorator(control))).getDamage();
        System.out.println(finalDamage);
        //не изменяя основную реализацию DamageControl мы изменили результат через обёртки
    }
}