package Clase13.ejercicio1;

public class Circulo extends Figura{

    private String colorDeFondo;
    private double radio;

    public Circulo(String colorDeFondo, double radio) {
        this.colorDeFondo = colorDeFondo;
        this.radio = radio;
    }

    public Circulo(){}

    public String getColorDeFondo() {
        return colorDeFondo;
    }

    public void setColorDeFondo(String colorDeFondo) {
        this.colorDeFondo = colorDeFondo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * (radio * radio) ;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

}


