/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Víctor
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraccion f1 = new Fraccion(1, 4); 
        Fraccion f2 = new Fraccion(1, 2);
        Fraccion f3 = new Fraccion(2, 3);
        Fraccion producto = f1.multiplicar(f2);

    }
    
}
