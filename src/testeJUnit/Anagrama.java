/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeJUnit;

import java.util.Arrays;

/**
 *
 * @author lady
 */
public class Anagrama {
    
    public Boolean isAnagramas(String a,String b){
    
    if ( a.length() != b.length() ) {
        return false;
    }
    
    char[] p1 = a.toCharArray();
    char[] p2 = b.toCharArray();
    
    Arrays.sort(p1);
    Arrays.sort(p2);
    
    String ap1 = new String(p1);
    String bp2 = new String(p2);
    return ap1.equals(bp2);
    }
    
    public Boolean mesmoTamanho(String a, String b){
        return a.length() == b.length();
    }
    
    
    
}
