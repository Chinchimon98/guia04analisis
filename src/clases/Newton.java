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
public class Newton {
    Funcion newton = new Funcion("x+1");
    
    public double[] calcularDifDiv(double[] x, double[] y){
        double[] coeficientesB = new double[x.length];
        double[][] matriz = newton.crearMatriz(x, y);
       
        for (int i = 2, k = 1; i <= x.length+1; i++, k++) {
            for (int j = i-1 ; j < x.length; j++) {
                matriz[j][i] = (matriz[j][i-1] - matriz[j-1][i-1])/(matriz[j][0] - matriz[j-k][0]);
            }
        }
        
        for (int i = 0; i < x.length; i++) {
            coeficientesB[i] = matriz[i][i+1];
        }
        System.out.println(Arrays.toString(coeficientesB));
        newton.imprimirMatriz(matriz, x.length);
    return coeficientesB;
    }
    
     public String getPolinomio(double[] x, double[] y){
            String factor = "(x-$)";
            String polinomio = "";
            double[] bn = calcularDifDiv(x, y);

            for (int i = 0; i < x.length; i++) {
                if (bn[i] < 0) {
                    polinomio += " " + bn[i];
                } else {
                    polinomio += " +" + bn[i];
                }

                for (int j = 0; j < i; j++) {
                    if (bn[i] != 0) {
                        polinomio += factor.replace("$", String.valueOf(x[j]));
                    }
                }
            }
            System.out.println(polinomio);
    return polinomio;
    }
}
