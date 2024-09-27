package edu.mx.uttt.recursividad;

public class Test {

    public static void main(String[] args) {
        Potencias pot = new Potencias();

        pot.setExp(3);
        int expo = pot.getExp();
        int resultado = pot.potencia(expo);
        System.out.println(resultado);


    }
}
