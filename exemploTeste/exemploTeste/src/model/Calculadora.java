package model;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int r = calculadora.somar(3, 4);

    }

    public int somar(int a, int b){
        return a + b;
    }
}