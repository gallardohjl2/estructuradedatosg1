package edu.mx.uttt.recursividad;

public class Potencias {

    private int exp;
    private int base;


    public Potencias (){
        this.base = 1;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
//        this.exp = (exp>=0)?exp:1;
        if(exp>=0)
            this.exp=exp;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base>=0)
            this.base=base;
    }

    public int potencia(int exp ){
        //Caso base
        if(exp == 0){
            return 1;
        }else{
            // Caso General
            return 2 * potencia(exp - 1);
        }
    }

    public int potencia(int base, int exp){
        //return (exp==0)?1: base * potencia(base, exp-1);
        if(exp==0){
            return 1;
        }else{
            return base * potencia(base, exp -1);
        }
    }
}

