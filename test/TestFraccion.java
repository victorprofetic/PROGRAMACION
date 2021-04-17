/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Víctor
 */
public class TestFraccion {
    
    public TestFraccion() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Fraccion f1 = new Fraccion(1, 4); 
        Fraccion f2 = new Fraccion(1, 2);
        Fraccion producto = f1.multiplicar(f2);
        assertEquals(1, producto.getNum());
        assertEquals(8, producto.getDen());        
    }
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Fraccion f1 = new Fraccion(1, 4); 
        Fraccion f2 = new Fraccion(1, 2);
        Fraccion division = f1.dividir(f2);
        assertEquals(2,division.getNum());
        assertEquals(4,division.getDen());        
    }


}
