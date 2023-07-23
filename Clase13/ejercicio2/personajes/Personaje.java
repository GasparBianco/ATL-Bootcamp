package Clase13.ejercicio2.personajes;

public abstract class Personaje {
    protected int puntosDeVida;
    protected int velocidad;
    protected int agilidad;
    protected int fuerza;
    protected int inteligencia;

    public Personaje(int puntosDeVida, int velocidad, int agilidad, int fuerza, int inteligencia) {
        this.puntosDeVida = puntosDeVida;
        this.velocidad = velocidad;
        this.agilidad = agilidad;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }
    public void checkeoHabilidadEspecial(){
        if (Math.random()<=inteligencia){
            habilidadEspecial();
        }
    }

    protected abstract void habilidadEspecial();

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}
