/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uttt.programasciclos;

/**
 *
 * @author jlgallardoadmon
 */
public class Serie {
    private int n;
    
    public Serie (){
        this.n =1;
    }
    
    public Serie (int n){
        //this.n = (n>0)?n:1;
        if(n>0){
            this.n = n;
        }else{
            this.n = 1;
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
          if(n>0){
            this.n = n;
        }else{
            this.n = 1;
        }
    }
    
    
    
}
