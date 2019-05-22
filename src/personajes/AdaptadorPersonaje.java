/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import Adaptable.Director;
import Adaptable.Personaje;
import Adaptable.PersonajeBuilder;
import Adaptable.PersonajeMagoBuilder;
import armaduras.ArmaduraAbstracta;
import armas.ArmaAbstracta;
import java.util.Set;

/**
 *
 * @author Brayan
 */
public class AdaptadorPersonaje extends PersonajeAbstracto {

    public AdaptadorPersonaje() {
        super();
        setVida(1000);
        setEscudo(0);
        setAtaque(105);
        setCadencia(0);
        setVelocidadMov(470);
        setregenVida(0);
        setDistancia_ataque(0);
        setRaza("mago");
        construir();
    }

    Personaje personaje;
    Director director = new Director();
    

    PersonajeBuilder personaje_mago = new PersonajeMagoBuilder();

    public void construir() {
        String nom_raza = "Elfo";
        String nom_arma = "hechizos";
        
        director.personajeBuilder(personaje_mago);
        director.construirPersonaje(nom_raza, nom_arma);
        personaje = director.getPersonaje();
        String img;
        img = "011" + ".jpg";   
        this.img=img;        
    }

    
    

    @Override
    public void setArmadura(ArmaduraAbstracta armadura1) {
        super.setArmadura(armadura1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setArma(ArmaAbstracta arma1) {
        super.setArma(arma1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArmaduraAbstracta getArmadura() {
        return super.getArmadura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArmaAbstracta getArma() {
        return super.getArma(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDistancia_atq() {
        return super.getDistancia_atq(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRegenVida() {
        return super.getRegenVida(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getVelocidadMov() {
        return super.getVelocidadMov(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCadencia() {
        return super.getCadencia(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAtaque() {
        return super.getAtaque(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEscudo() {
        return super.getEscudo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVida() {
        return super.getVida(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRaza() {
        return super.getRaza(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setVida(int nuevaVida) {
        this.vida = nuevaVida; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setEscudo(int nuevoEscudo) {
        this.escudo = nuevoEscudo;
    }

    @Override
    void setAtaque(int nuevoAtaque) {
        this.ataque = nuevoAtaque;
    }

    @Override
    void setCadencia(double cadencia) {
        this.cadencia = cadencia;
    }

    @Override
    void setVelocidadMov(double nuevaVelocidad) {
        this.velocidadMov = nuevaVelocidad;
    }

    @Override
    void setregenVida(double regenvida) {
        this.regenVida = regenvida;
    }

    @Override
    void setDistancia_ataque(double distancia_ataque) {
        this.distancia_atq = distancia_ataque;
    }

    @Override
    void setRaza(String raza) {
        this.raza = raza;
    }

}
