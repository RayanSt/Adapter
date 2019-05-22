
package armaduras;

import javax.swing.ImageIcon;

/**
 *
 * @author DANIEL
 */
public class Ligera extends ArmaduraAbstracta{

    public Ligera(){
        super();
        setVida(250);
        setEscudo(350);
        setVelocidadMov(0.85);
        setRegenVida(0.15);
        setImagen(new ImageIcon("/resources/armaduras/ligera.png"));
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
