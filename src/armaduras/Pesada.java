
package armaduras;

import javax.swing.ImageIcon;

/**
 *
 * @author DANIEL
 */
public class Pesada extends ArmaduraAbstracta{

    public Pesada() {
    super();
        setVida(400);
        setEscudo(600);
        setVelocidadMov(0.70);
        setRegenVida(0.2);
        setImagen(new ImageIcon("/resources/armaduras/pesada.png"));
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
