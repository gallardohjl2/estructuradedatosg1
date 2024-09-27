package edu.mx.uttt.iterativo_recursivo;

public class OperacionesBasicas {

    private int n;
    private int base;
    private int exp;

    public OperacionesBasicas (){
        this.base = 1;
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>=1)?n:1;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base =( base>0)?base:1;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = (exp>=0)?exp:0;
    }

    public int sumar(int n){
        // Caso Base
//        if(n==1){
//            return 1;
//        }else{
//            //Caso General
//            return n + sumar(n-1);
//        }
        return (n==1)?1:n + sumar(n-1);
    }

    public int sumar(){
        int acumulador = 0;
        int i =1;
        while(i<=this.n){
            acumulador+=i;
            i++;
        }
        return acumulador;
    }
}
