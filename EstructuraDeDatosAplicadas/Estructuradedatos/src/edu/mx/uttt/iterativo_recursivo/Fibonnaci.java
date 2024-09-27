package edu.mx.uttt.iterativo_recursivo;

public class Fibonnaci {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>=0)?n:0;
    }

    // Método recursivo de Fibonnaci
    public int fib(int n){
        //Caso Base
        if(n<=1){
           return 1;
        }else{
            //Caso General
            return fib(n-1) +fib(n-2);
        }
    }

    @Override
    public String toString() {
        return "Fibonnaci{" +
                "n=" + n +
                '}';
    }
}
