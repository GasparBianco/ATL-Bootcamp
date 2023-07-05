package Clase13.ejercicio1;

public class Triangulo extends PoligonoRegular{


    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public Triangulo(){
        super();
    }

    public double calcularArea() {
        return base*altura/2;
    }
    public double calcularPerimetro() {
        return 2*base + 2*altura;
    }
}