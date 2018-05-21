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
public class Hermite {
   Funcion hermite = new Funcion("x+1");

   public double[][] calcularTablitaChidori(double[] x, double[] y, double[] dx){
        double[][] matriz = hermite.crearMatriz(x, y);
        int contadorDx=0;
       
        for (int i = 2, k = 1; i <= x.length+1; i++, k++) {
            for (int j = i-1 ; j < x.length; j++) {
                    if ((matriz[j][0] - matriz[j-1][0]) == 0 && i == 2) {
                        matriz[j][i] = dx[contadorDx];
                        contadorDx++;
                        
                    }  else{
                        matriz[j][i] = (matriz[j][i-1] - matriz[j-1][i-1])/(matriz[j][0] - matriz[j-k][0]);
                     }
            }
        }
        hermite.imprimirMatriz(matriz, x.length);
    return matriz;
    }
   
    public double[] calcularCoe(double[][] matriz, int size){
         double[] coeficienteB = new double[size];
         for (int i = 0; i < size; i++) {
            coeficienteB[i] = matriz[i][i+1];
        }
          System.out.println(Arrays.toString(coeficienteB));
        return coeficienteB;
    }
   
    public String getPolinomio(double[] x, double[] y, double[] dx){
            String factor = "(x-$)";
            String polinomio = "";
            double[] bn = calcularCoe(calcularTablitaChidori(x, y, dx), x.length);

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

    public Funcion getHermite() {
        return hermite;
    }

    public void setHermite(Funcion hermite) {
        this.hermite = hermite;
    }
    
   
}
