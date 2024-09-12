package edu.mx.uttt.iterativo_recursivo;

import javax.swing.*;

public class Factorial {
    private int n;

    public Factorial() {
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public long calcularIterativo(String opcion){
        long resp =0;
        switch(opcion){
            case "1":
                resp = factorialFor();
                break;
            case "2":
                resp = factorialWhile();
                break;
            case "3":
                resp = factorialDoWhile();
                break;
            default:
                JOptionPane
                        .showMessageDialog(null, "Opción no valida");
        }
        return 0;
    }

    private long factorialFor(){
        long fact = 1;
        for (int i = 1; i <=this.n; i++) {
            fact*=i;  // fact = fact * i
        }
        return fact;
    }

    private long factorialWhile(){
        long fact = 1;
        int i=1;
        while(i<=this.n){
            fact*=i;
            i++;
        }
        return fact;
    }

    private long factorialDoWhile(){
        long fact = 1;
        int i=1;
        do{
            fact*=i;
            i++;
        }while(i<=this.n);

        return fact;
    }

    public long calcularR(int n){
        //Caso Base
        if(n==1){
            return n;
        }else{
            //Caso General
            return calcularR(n-1)* n;
        }
    }
}
