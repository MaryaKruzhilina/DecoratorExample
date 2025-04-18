package kruzhilina_userLoc;

public class DecreaseControlDamageDecorator extends ControlDecorator{
    public DecreaseControlDamageDecorator(Control control) {
        super(control);
    }

    @Override
    public int getDamage() {
        return control.getDamage() - 50;
    }
}
