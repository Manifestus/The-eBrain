/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark_travel;

/**
 *
 * @author Romero
 */
public class Adyacencia {
    private Constelacion cosntelacion;
    private Estrella estrella;
    private int peso;

    public Adyacencia(Constelacion cosntelacion, int peso) {
        this.cosntelacion = cosntelacion;
        this.peso = peso;
    }

    public Adyacencia(Estrella estrella, int peso) {
        this.estrella = estrella;
        this.peso = peso;
    }

    public Adyacencia() {
    }

    public Constelacion getCosntelacion() {
        return cosntelacion;
    }

    public void setCosntelacion(Constelacion cosntelacion) {
        this.cosntelacion = cosntelacion;
    }

    public Estrella getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Adyacencia{" + "cosntelacion=" + cosntelacion + ", estrella=" + estrella + ", peso=" + peso + '}';
    }
    
    
}
