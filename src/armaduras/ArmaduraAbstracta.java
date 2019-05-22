/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaduras;

import javax.swing.ImageIcon;

/**
 *
 * @author DANIEL
 */
public abstract class ArmaduraAbstracta {
    int vida, escudo;
    double velocidadMov,regenVida;
    ImageIcon imagen;

    public abstract void setVida(int vida);

    public abstract void setEscudo(int escudo);

    public abstract void setVelocidadMov(double velocidadMov);

    public abstract void setRegenVida(double regenVida);

    public abstract void setImagen(ImageIcon imagen);

    public int getVida() {
        return vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public double getVelocidadMov() {
        return velocidadMov;
    }

    public double getRegenVida() {
        return regenVida;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
    
    

    public ArmaduraAbstracta() {
        
    }
    
}
