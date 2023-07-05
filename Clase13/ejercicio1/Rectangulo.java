package Clase13.ejercicio1;

public class Rectangulo extends PoligonoRegular{


    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public Rectangulo(){
        super();
    }

    public double calcularArea() {
        return base*altura;
    }
    public double calcularPerimetro() {
        return 2*base + 2*altura;
    }
}

