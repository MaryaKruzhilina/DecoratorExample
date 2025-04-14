package kruzhilina_userLoc;

public abstract class ControlDecorator implements Control {

    Control control;

    public ControlDecorator(Control control) {
        this.control = control;
    }

}
