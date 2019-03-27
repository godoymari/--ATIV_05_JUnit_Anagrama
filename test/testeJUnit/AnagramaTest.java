/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeJUnit;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author lady
 */
public class AnagramaTest {
    
    private Anagrama an;
    
    @Before
    public void setup(){
        
    an = new Anagrama();
    }
    
    public AnagramaTest() {
    }   

    /**
     * Test of isAnagramas method, of class Anagrama.
     */
    @Test
    public void testIsAnagramas() { 
        
        Boolean esperado = true;
        Boolean resultado = an.isAnagramas("ROMA","AMOR");
       
        assertEquals(esperado,resultado);
       
    }
    
    @Test
    public void testMesmoTamanho(){
        //true
        assertTrue(an.mesmoTamanho("Moça", "Maço"));
        //false
        //assertTrue(an.mesmoTamanho("Moça", "Moção"));
    }
    
}
