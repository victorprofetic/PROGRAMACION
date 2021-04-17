/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Víctor
 */
public class Fraccion {
    
    private int num;
    private int den;

    public Fraccion() {
        this.num = 0;
        this.den = 1;
    }

    public Fraccion(int num, int den) {
        this.num = num;
        if(den==0){
            den = 1;
        }
        this.den = den;
     }
   
    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //multiplicar fracciones
    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.num;
        aux.den = this.den * f.den;
        return aux;
    }

    //dividir fracciones
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        return aux;
    }
  
} //Fin de la clase Fraccion

    

