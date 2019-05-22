package armaduras;

import javax.swing.ImageIcon;

/**
 *
 * @author DANIEL
 */
public class Tunica extends ArmaduraAbstracta{

    public Tunica() {
    super();
        setVida(150);
        setEscudo(200);
        setVelocidadMov(0.95);
        setRegenVida(0.08);
        setImagen(new ImageIcon("/resources/armaduras/tunica.png"));
    }
    
    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setEscudo(int escudo) {
        this.escudo=escudo;
    }

    @Override
    public void setVelocidadMov(double velocidadMov) {
        this.velocidadMov=velocidadMov;
    }

    @Override
    public void setRegenVida(double regenVida) {
        this.regenVida=regenVida;
    }
    @Override
    public void setImagen(ImageIcon imagen) {
        this.imagen= imagen;
    }
    
}
