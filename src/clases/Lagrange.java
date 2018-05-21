/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author --..
 */
public class Lagrange {

    public double[][] pOrdenados;
    public List<Polinomio> lx;
    public int grado;
    public List<Polinomio> numeradores;
    public List<Polinomio> denominadores;

    public Lagrange(double[][] vector) {
        this.pOrdenados = vector;
        this.grado = vector[0].length - 1;
        this.lx = new ArrayList<>();
    }

    private Polinomio lindice(int indice) {
        this.numeradores = new ArrayList<>();
        this.denominadores = new ArrayList<>();
        Polinomio resultado = new Polinomio();
        Polinomio numerador;
        Polinomio denominador;
        for (int i = 0; i <= this.grado; i++) {
            if (i != indice) {
                numerador = new Polinomio();
                denominador = new Polinomio();
                numerador.add(1, 1);
                denominador.add(this.pOrdenados[0][indice], 0);
                numerador.add(-this.pOrdenados[0][i], 0);
                denominador.add(-this.pOrdenados[0][i], 0);
                this.numeradores.add(Operaciones.reducir(numerador));
                this.denominadores.add(Operaciones.reducir(denominador));
            }
        }
        if (this.grado >= 2) {
            Polinomio temp1 = new Polinomio();
            Polinomio temp2 = new Polinomio();
            for (int i = 0; i < this.grado; i++) {
                temp1 = Operaciones.reducir(Operaciones.multiplicar(temp1, this.numeradores.get(i)));
                temp2 = Operaciones.reducir(Operaciones.multiplicar(Operaciones.reducir(temp2), this.denominadores.get(i)));
            }
            System.out.println("\nL(" + indice + ")" + temp1.toString() + "  /  " + temp2.getCoeficiente(0));
            resultado = Operaciones.dividirNumero(temp1, temp2.getCoeficiente(0));
        }
        return resultado;
    }

    public Polinomio metodo() {
        Polinomio salida = new Polinomio();
        for (int i = 0; i <= this.grado; i++) {
            salida = Operaciones.reducir(Operaciones.sumar(salida, Operaciones.multiplicarNumero(lindice(i), this.pOrdenados[1][i])));
        }
        System.out.println("\nPolinomio: " + salida.toString() + "\n");
        return salida;
    }

    public double error(int x,double y,double eval,double[][] valores) {
        double er;
        double fact=1;
        double productinho=1;
        x=x+1;
        for (int i =  x; i>1; i--) {
        fact=fact*(i-1);
       
        }
        System.out.println("factorial="+fact);
        System.out.println(eval);
        for (int i = 0; i <x-1; i++) {
            productinho=productinho*(eval- valores[0][i]);
           
        }
      
        System.out.println(y);
        er=(y/fact)*productinho;
            
        
        return er;
    }

}
