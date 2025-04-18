package kruzhilina_userLoc;

public class IncreasedControlDamageDecorator extends ControlDecorator {
    public IncreasedControlDamageDecorator(Control control) {
        super(control);
    }

    @Override
    public int getDamage() {
        return control.getDamage() + 50;
    }
}
