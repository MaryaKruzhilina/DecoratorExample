package kruzhilina_userLoc;

public class DamageControl implements Control {
    private final static int DEFOLT_DAMAGE = 100;

    @Override
    public int getDamage() {
        return DEFOLT_DAMAGE;
    }
}
