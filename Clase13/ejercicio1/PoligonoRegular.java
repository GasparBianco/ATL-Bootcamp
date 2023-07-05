package Clase13.ejercicio1;

public abstract class PoligonoRegular extends Figura {

    protected double base;
    protected double altura;
    public PoligonoRegular(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public PoligonoRegular() {

    }

    public double getBase(){
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
