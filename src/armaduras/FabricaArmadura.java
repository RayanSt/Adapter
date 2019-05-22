package armaduras;

/**
 *
 * @author DANIEL
 */
public class FabricaArmadura {

    public ArmaduraAbstracta getArmadura(int ref) {
        switch (ref) {
            case 1:
                return new Pesada();
            case 2:
                return new Ligera();
            default:
                return new Tunica();
        }
    }
}
