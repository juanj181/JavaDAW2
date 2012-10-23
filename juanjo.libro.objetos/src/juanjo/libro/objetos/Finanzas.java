/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juanjo.libro.objetos;

/**
 *
 * @author alumno
 */
public class Finanzas {
    
    
    public static double dolarToEuro(double money){
        return (1.36)*money;
    }
    
    
    public static double euroToDolar(double money){
        return money/1.36;
        
        
    }
}
