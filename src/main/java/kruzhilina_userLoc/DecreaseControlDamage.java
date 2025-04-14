package kruzhilina_userLoc;

public class DecreaseControlDamage extends ControlDecorator{
    public DecreaseControlDamage(Control control) {
        super(control);
    }

    @Override
    public int getDamage() {
        return control.getDamage() - 50;
    }
}
