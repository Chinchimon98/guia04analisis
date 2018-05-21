/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class GuiaAnalisis04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double x[] = {1910.0, 1910.0, 1930.0, 1930.0, 1950.0, 1950.0, 1960.0, 1960.0, 1980.0, 1980.0}, 
           y[] = {125350.0, 125350.0, 133420.0, 133420.0, 117183.0, 117183.0, 120323.0, 120323.0, 145311.0, 145311.0},
           dx[] = {125963,147852,258963,159357,248539},
           xn[] = {1910.0, 1930.0, 1950.0, 1960.0, 1980.0}, 
           yn[] = {125350.0, 133420.0, 117183.0, 120323.0, 145311.0};
         
//         Hermite hermite = new Hermite();
//         Funcion funcion = new Funcion( hermite.getPolinomio(x, y, dx));
//         System.out.println(funcion.evaluarFuncion(1964.0,hermite.getPolinomio(x, y, dx)));
         Newton newton = new Newton();
         System.out.println(Arrays.toString(newton.calcularDifDiv(xn, yn)));
    }
    
}
