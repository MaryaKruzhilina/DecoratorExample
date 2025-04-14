package kruzhilina_userLoc;

public class IncreasedControlDecorator extends ControlDecorator {
    public IncreasedControlDecorator(Control control) {
        super(control);
    }

    @Override
    public int getDamage() {
        return control.getDamage() + 50;
    }
}
