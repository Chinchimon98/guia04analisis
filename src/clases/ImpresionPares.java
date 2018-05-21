package clases;

/**
 *
 * @author ...
 */
public class ImpresionPares {


    public ImpresionPares() {
    }


    
    public  String calculinho(int fila, int columna, double [][] pares){


//    double [][] matriz=new double[columna][(columna+1)];

//imprime los valores del ejercicio dado
        double[] x=new double[columna];
        double[] y=new double[columna];
        for (int i = 0; i <columna; i++) {
            x[i]=pares[0][i];
            y[i]=pares[1][i];
        }
String xx="";

         
          for (int i = 0; i <columna; i++) {
            xx=xx+"("+x[i]+"  ,  "+y[i]+");    ";
            
        }


//
//        for (int f = 0; f < matriz.length; f++) {
//            for (int c = 0; c < matriz[f].length; c++) {
//                matriz[f][0] = pares[0][f];
//                matriz[f][1] = pares[1][f];
//
//
//                System.out.print(matriz[f][c] + "  | ");
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//        System.out.println(y[0]);
//
//        double[][] dif;
//        int n = columna, i = 0, m,j;
//        m= n - 1;
//
//        dif = new double[n - 1][ n - 1];
//
//        System.out.println(" ###############");
//
//
//        while (i <= m - 1)
//        {
//            dif[i] [0] = (y[i + 1] - y[i]) / (x[i + 1] - x[i]);
//         System.out.println("  "+dif[i][0]);
//            i = i + 1;
//        }
//        j = 1;
//        while (j <= m - 1)
//        {
//            i = j;
//
//           System.out.println(" ####### ");
//            while (i <= m - 1)
//            {
//                dif[i][ j] = (dif[i][ j - 1] - dif[i - 1][ j - 1]) / (x[i + 1] - x[i - j]);
//                System.out.println("  "+ dif[i][j]);
//                i = i + 1;
//            }
//            j = j + 1;
//        }
//




        return xx;
    }



}





