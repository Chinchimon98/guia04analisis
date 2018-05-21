/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import clases.Funcion;
import clases.ImpresionPares;
import clases.Lagrange;
import clases.Polinomio;
import graficador.myFrame;
import java.awt.Desktop;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.nfunk.jep.JEP;
import javax.swing.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import graficador.Principal;
import graficador.GraficadorClasico;
import graficador.myFrame;
import java.awt.Container;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * para realiar la grafica de interpolacion se hace uso de la s librerias
 * jmathplot y jmatharray
 *
 * @author Kevin Figueroa
 */
public class Principal_frm extends javax.swing.JFrame {

    boolean tercero=false;
    static int i;
    static int n;
    public static double componenteX[];
    public static double componenteY[];
    public static double dj[], cj[], bj[];

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Principal_frm.n = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    /**
     * Creates new form InterpolacionPorSplinesCubicos
     */
    public Principal_frm() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
          jPanelMuestraGrafica.setVisible(false);
       puntoEvaluar.setVisible(false);
        ((JPanel) getContentPane()).setOpaque(false);
      visualizar_grafica.setVisible(false);
//        JLabel fondo = new JLabel();
//        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
    btnGraff.setEnabled(false);
        jX.setVisible(false);
        jY.setVisible(false);
numeroPuntos.setEnabled(false);
        // al inicio del programa se muestran las casillas descativadas
        jX.setEnabled(false);
        jY.setEnabled(false);
        puntoEvaluar.setEnabled(false);
       // jButtonEvaluarPunto.setEnabled(false);
       jButtonEvaluarPunto.setVisible(false);
        jButtonregistrar.setEnabled(true);// se desavilitamos el boton registro de puntos
        visualizar_grafica.setEnabled(false);// se desavilitamos el boton visualizar grafica de puntos
        puntosIngresados.setEnabled(false);
        

    }

    public Principal_frm(int g) {
    }

    
    
    /**
     * toma los valores ya dados en ls problemas
     *
     * @return matriz con los puntos dados
     */
    public double[][] getValores() {
        double[][] valores = null;

        int funcion = cmbProblema.getSelectedIndex() + 1;
        switch (funcion) {
            case 1:
                //datos del problema 1
                valores = new double[2][5];
                valores[0][0] = 1910;    //x0
                valores[0][1] = 1930;    //x1
                valores[0][2] = 1950;    //x2
                valores[0][3] = 1960;    //x1
                valores[0][4] = 1980;

                valores[1][0] = 125350;    //yo
                valores[1][1] = 133420;    //y1
                valores[1][2] = 117183;    //y2
                valores[1][3] = 120323;    //y3
                valores[1][4] = 145311;    //y4
                return valores;

            case 2:
                //datos del problema 2
                valores = new double[2][4];
                valores[0][0] = 0;    //x0
                valores[0][1] = 2;    //x1
                valores[0][2] = 5;    //x2
                valores[0][3] = 6;    //x3

                valores[1][0] = 3;    //yo
                valores[1][1] = 6;    //y1
                valores[1][2] = 10.5; //y2
                valores[1][3] = 24;   //y3

                return valores;
            case 3:
                //datos del problema 3 //Sea f(x)=x^2 cos(5x+2
                valores = new double[2][3];
                valores[0][0] = 0;              //x0
                valores[0][1] = Math.PI / 3;    //x1
                valores[0][2] = Math.PI / 2;    //x2

                valores[1][0] = Math.pow(valores[0][0], 2) * Math.cos(5 * valores[0][0] + 2); //yo
                valores[1][1] = Math.pow(valores[0][1], 2) * Math.cos(5 * valores[0][1] + 2); //y1
                valores[1][2] = Math.pow(valores[0][2], 2) * Math.cos(5 * valores[0][2] + 2); //y2

                return valores;
            case 4:
                //datos del problema 4 //f(x)=senx
                valores = new double[2][3];
                valores[0][0] = 0;              //x0
                valores[0][1] = Math.PI / 4;    //x1
                valores[0][2] = Math.PI / 2;    //x2

                valores[1][0] =  Math.cos(valores[0][0]); //yo
                valores[1][1] =  Math.cos(valores[0][1]); //y1
                valores[1][2] =  Math.sin(valores[0][2]); //y2

                return valores;
                 case 5:
                //datos del problema 4 //f(x)=senx
                valores = new double[2][4];
                valores[0][0] = 0;              //x0
                valores[0][1] =1;    //x1
                valores[0][2] =2;    //x2
                valores[0][3]=3;     //x3
                
                valores[1][0] = -1; //yo
                valores[1][1] = 6; //y1
                valores[1][2] = 31; //y2
                valores[1][3]=98;   //y3
                
                return valores;
                  case 6:
                //datos del problema 4 //f(x)=senx
                valores = new double[2][3];
               /**
                * falta hermite :v
                * 
                * 
                */

                return valores;
                  case 7:
                //datos del problema 4 //f(x)=senx
                valores = new double[2][3];
                valores[0][0] = -1;              //x0
                valores[0][1] = 0;    //x1
                valores[0][2] = 2;    //x2

                valores[1][0] = -6; //yo
                valores[1][1] = 9; //y1
                valores[1][2] = 6; //y2

                return valores;
                
                
                

            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
        return valores;

    }

    public void Ocultarbotones1() {
        btn11.setVisible(false);
        btn12.setVisible(false);
        btn13.setVisible(false);
        btn14.setVisible(false);

    }

    public void MostrarbotonesM() {
        btn11.setVisible(true);
        btn12.setVisible(true);
        btn13.setVisible(true);
        btn14.setVisible(true);

    }

     public String d2(){
          String r="";
         if (tercero==true){
               r="0.4748206017758918*x^2 -0.7458464571561131*x +1.0";
           
         }else{
              r="-3.886694786383628*x^2 +4.676884835802445*x";
         }
        
        return r;
        
    }
    
    
    /**
     * calculo de polinomio de lagrange con su respectivo error teorico y si es
     * necesario evaluar en un punto
     */
    public void Lagranja() {
        double valores[][] = getValores();    
        int colum = 0;
        for (double[] pare : valores) {
            for (int c = 0; c < pare.length; c++) {
                colum = pare.length;
            }
        }
        int fila = valores.length;
        System.out.println();
        ImpresionPares prin = new ImpresionPares();
        String iniciales = prin.calculinho(fila, colum, valores);
        Lagrange lag = new Lagrange(valores);
        Polinomio funci = lag.metodo();

        System.out.println("" + funci);

        txtXY.setText(iniciales);
        txtPolinomio.setText(funci + "");
        
    }

    
/**
     * calcular el error con el valor xo dado calcular la aproximación con el
     * valor dado
     *
     * @return array con el error y la aproximacion.
     */
    public double[] evalErr(double eval) {

        double valores[][] = getValores();

        int colum = 0;
        for (double[] pare : valores) {
            for (int c = 0; c < pare.length; c++) {
                colum = pare.length;
            }
        }
        double ultimo = valores[1][colum-1];
        Lagrange lag = new Lagrange(valores);
        Polinomio funci = lag.metodo();

        double err = lag.error(colum, ultimo, eval, valores);
        System.out.println(colum+"   "+ultimo+"   "+eval);
        String poli = "" + funci;
        Funcion f = new Funcion(poli);

        double evalueshon = f.eval(eval);

        double[] error = {err, evalueshon};
        return error;

    }
    
    
    
    
    
 public void bot(){
     btn2000.setVisible(false);
     btn011.setVisible(false);
      btn03.setVisible(false);
     btn04.setVisible(false);
     txtPE.setVisible(false);
 }
    
 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMuestraGrafica = new javax.swing.JPanel();
        pnelMetodos = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jButtonregistrar = new javax.swing.JButton();
        jX = new javax.swing.JTextField();
        jY = new javax.swing.JTextField();
        numeroPuntos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        txtPE = new javax.swing.JLabel();
        puntoEvaluar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonEvaluarPunto = new javax.swing.JButton();
        jTextField_S_X = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        visualizar_grafica = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        puntosIngresados = new javax.swing.JTextField();
        btn02 = new javax.swing.JButton();
        btn011 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn2000 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtXY = new javax.swing.JTextField();
        txtEval = new javax.swing.JTextField();
        txtErr = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPolinomio = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCalculinho = new javax.swing.JButton();
        btnGraff = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cmbProblema = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMuestraGrafica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel4.setLayout(null);

        jButtonregistrar.setText("Calcular");
        jButtonregistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregistrarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonregistrar);
        jButtonregistrar.setBounds(30, 60, 80, 30);

        jX.setEditable(false);
        jPanel4.add(jX);
        jX.setBounds(30, 60, 60, 30);

        jY.setEditable(false);
        jY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jYActionPerformed(evt);
            }
        });
        jPanel4.add(jY);
        jY.setBounds(110, 60, 60, 30);

        numeroPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPuntosActionPerformed(evt);
            }
        });
        jPanel4.add(numeroPuntos);
        numeroPuntos.setBounds(190, 20, 70, 30);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(10, 100, 0, 2);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(10, 100, 990, 10);

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(30, 240, 560, 78);

        txtPE.setForeground(new java.awt.Color(255, 255, 255));
        txtPE.setText("Punto a evaluar");
        jPanel4.add(txtPE);
        txtPE.setBounds(20, 140, 100, 50);

        puntoEvaluar.setEditable(false);
        puntoEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoEvaluarActionPerformed(evt);
            }
        });
        jPanel4.add(puntoEvaluar);
        puntoEvaluar.setBounds(530, 150, 70, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Puntos ingresados");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(20, 100, 140, 50);

        jButtonEvaluarPunto.setText("Evaluar");
        jButtonEvaluarPunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEvaluarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEvaluarPuntoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonEvaluarPunto);
        jButtonEvaluarPunto.setBounds(380, 60, 70, 30);

        jTextField_S_X.setEditable(false);
        jPanel4.add(jTextField_S_X);
        jTextField_S_X.setBounds(30, 330, 560, 40);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Número de puntos a interpolar ");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 20, 190, 30);

        visualizar_grafica.setText("Visualizar gráfica de interpolación");
        visualizar_grafica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        visualizar_grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizar_graficaActionPerformed(evt);
            }
        });
        jPanel4.add(visualizar_grafica);
        visualizar_grafica.setBounds(350, 210, 230, 30);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Polinomios S (x)");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(70, 210, 100, 30);

        puntosIngresados.setEditable(false);
        jPanel4.add(puntosIngresados);
        puntosIngresados.setBounds(130, 110, 440, 30);

        btn02.setText("limpiar");
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        jPanel4.add(btn02);
        btn02.setBounds(40, 380, 90, 25);

        btn011.setText("1964");
        btn011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn011ActionPerformed(evt);
            }
        });
        jPanel4.add(btn011);
        btn011.setBounds(130, 160, 66, 25);

        btn04.setText("2018");
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });
        jPanel4.add(btn04);
        btn04.setBounds(370, 160, 70, 25);

        btn03.setText("2010");
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });
        jPanel4.add(btn03);
        btn03.setBounds(280, 160, 80, 25);

        btn2000.setText("2000");
        btn2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2000ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2000);
        btn2000.setBounds(200, 160, 80, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0b2f4a0bc3878bb0b64fe35e7ea6eb9f.jpg"))); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(1, 0, 630, 420);

        pnelMetodos.addTab("Trazador", jPanel4);
        jPanel4.getAccessibleContext().setAccessibleName("Autor : KF  ");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtXY.setText("                     ");
        txtXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXYActionPerformed(evt);
            }
        });
        jPanel1.add(txtXY, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 520, 40));

        txtEval.setText("            ");
        jPanel1.add(txtEval, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 360, 41));

        txtErr.setText("                 ");
        jPanel1.add(txtErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 328, 40));

        txtPolinomio.setColumns(20);
        txtPolinomio.setRows(5);
        jScrollPane2.setViewportView(txtPolinomio);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 510, 60));

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono CJK JP Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Polinomio de Lagrange");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono CJK JP Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(X,Y)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans Mono CJK JP Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Evaluar:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        btn11.setText("1964");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btn12.setText("2000");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        btn13.setText("2010");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        jPanel1.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        btn14.setText("2018");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel1.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        btn2.setText("4");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        btn4.setText("Pi/6");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Noto Sans Mono CJK JP Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Error");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        btnCalculinho.setText(" Calcular Polinomio");
        btnCalculinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculinhoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalculinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        btnGraff.setText("Ver Gráfico");
        btnGraff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraffActionPerformed(evt);
            }
        });
        jPanel1.add(btnGraff, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0b2f4a0bc3878bb0b64fe35e7ea6eb9f.jpg"))); // NOI18N
        jLabel4.setText("         ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnelMetodos.addTab("Lagrange", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pnelMetodos.addTab("Diferencias Divididas", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pnelMetodos.addTab("Newton", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Calcular Polinomio");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnelMetodos.addTab("Hermite", jPanel5);

        cmbProblema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Problema 1", "Problema 2", "Problema 3", "Problema 4", "Problema 5", "Problema 6", "problema 7" }));

        btnSalir.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cmbProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(pnelMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 328, Short.MAX_VALUE)
                    .addComponent(jPanelMuestraGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 327, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(pnelMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 265, Short.MAX_VALUE)
                    .addComponent(jPanelMuestraGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 265, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizar_graficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizar_graficaActionPerformed
       
    }//GEN-LAST:event_visualizar_graficaActionPerformed

    public static double[] getComponenteX() {
        return componenteX;
    }

    public static void setComponenteX(double[] componenteX) {
        Principal_frm.componenteX = componenteX;
    }

    public static double[] getComponenteY() {
        return componenteY;
    }

    public static void setComponenteY(double[] componenteY) {
        Principal_frm.componenteY = componenteY;
    }

    public static double[] getDj() {
        return dj;
    }

    public static void setDj(double[] dj) {
        Principal_frm.dj = dj;
    }

    public static double[] getCj() {
        return cj;
    }

    public static void setCj(double[] cj) {
        Principal_frm.cj = cj;
    }

    public static double[] getBj() {
        return bj;
    }

    public static void setBj(double[] bj) {
        Principal_frm.bj = bj;
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void puntoEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoEvaluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puntoEvaluarActionPerformed

    private void numeroPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPuntosActionPerformed

    private void jYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jYActionPerformed

    private void jButtonregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregistrarActionPerformed

        
        visualizar_grafica.setVisible(false);
        double valores[][]=getValores();
         int colum=0;
        for (double[] pare : valores) {
            for (int c = 0; c < pare.length; c++) {
                colum = pare.length;
            }
        }
        numeroPuntos.setText(colum+"");
        
      
            Principal_frm.setN(Integer.parseInt(numeroPuntos.getText()));
            numeroPuntos.setEnabled(false);// desavilita la edicion del campo en donde se ingresa el numero de puntos
            Principal_frm.componenteX = new double[n];
            Principal_frm.componenteY = new double[n];

            jTextArea.setText("");

        
        
        
        
// double valores[][]=getValores();
//         int colum=0;
//        for (double[] pare : valores) {
//            for (int c = 0; c < pare.length; c++) {
//                colum = pare.length;
//            }
//        }
//        numeroPuntos.setText(colum+"");
        
        for(int k=0;k<colum;k++){
            jX.setText(valores[0][k]+"");
            jY.setText(valores[1][k]+"");
        
        
        try {
            Principal_frm m = new Principal_frm(0);
            int n = Principal_frm.getN();

            if (m.getI() < n) {// si los punts ingresados son menores que n  permite el ingreso de otro punto
                JEP b1 = new JEP();
                b1.addStandardFunctions(); // adiciona las funciones matem´aticas
                b1.addStandardConstants();
                b1.parseExpression(jX.getText()); // paso de la expresi´on a evaluar
                componenteX[m.getI()] = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x

                b1.parseExpression(jY.getText()); // paso de la expresi´on a evaluar
                componenteY[m.getI()] = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en y

                String puntos = " ( " + jX.getText() + " , " + jY.getText() + " ) ";// variable usada para mostratr en pantala el punto regitrado
                String coma = ",";
                if (m.getI() + 1 == n) {
                    coma = "";
                }

                puntosIngresados.setText(puntosIngresados.getText() + puntos + coma);//muestra en pantalla los puntos registrados
                jX.setText("");// limpia la casilla de la componente en x del punto ngresado
                jY.setText("");// limpia la casilla de la componente en y del punto ngresado

                if (m.getI() + 1 == n) {// si ya se ingreso el numero de puntos establecidos se bloquea el boton  Registrar

                    this.splines(n);
                    jButtonregistrar.setEnabled(false);
                    // acontinuacion desabilitamos las casillas de ingreso de puntos
                    jX.setEnabled(false);
                    jY.setEnabled(false);
                    visualizar_grafica.setEnabled(true);// avilitamos el boton visualizar grafica de puntos
                }

                m.setI(m.getI() + 1);//aumenta el contador de ingreso de puntos
            }

        }// fin try// fin try// fin try// fin try
        catch (Exception e) {
            jTextArea.setText("error en el ingreso de los puntos");
        }
        
        }//cierre de ciclo for
        puntosIngresados.setEnabled(true);
    }//GEN-LAST:event_jButtonregistrarActionPerformed

    private void txtXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXYActionPerformed

    private void btnCalculinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculinhoActionPerformed
          
        txtErr.setText("");
         txtEval.setText("");
        int funcion = cmbProblema.getSelectedIndex() + 1;
        switch (funcion) {
            case 1:
              MostrarbotonesM();
                btn2.setVisible(false);
                Lagranja();
                btn4.setVisible(false);
       btnGraff.setEnabled(false);
                break;
             
            case 2:
                Ocultarbotones1();
                btn4.setVisible(false);
                btn2.setVisible(true);
             bot();
              btnGraff.setEnabled(false);
                break;
            case 3:
                  Lagranja();
                Ocultarbotones1();
                btn4.setVisible(false);
                btn2.setVisible(false);
                 tercero=true;
                  btnGraff.setEnabled(true);
                  bot();
                break;
            case 4:
                  Lagranja();
                Ocultarbotones1();
                btn2.setVisible(false);
                btn4.setVisible(true);
                 tercero=false;
      btnGraff.setEnabled(true);
                  bot();
                break;
                   case 5:
                Ocultarbotones1();
                btn2.setVisible(false);
                btn4.setVisible(false);
                btnGraff.setEnabled(false);
           bot();
                break;
                  case 6:
                Ocultarbotones1();
                btn2.setVisible(false);
                btn4.setVisible(false);
             bot();
                break;
                  case 7:
                Ocultarbotones1();
                btn2.setVisible(false);
                btn4.setVisible(false);
             bot();
                break;

        }

    }//GEN-LAST:event_btnCalculinhoActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
 double eval;
        String val = btn11.getText();
        eval = Double.parseDouble(val);
        double[] err = evalErr(eval);
        txtErr.setText("");
         txtEval.setText("");
        txtErr.setText(err[0] + "");
       
        txtEval.setText(err[1] + "");        // TODO add your handling code here:
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
 double eval;
        String val = btn12.getText();
        eval = Double.parseDouble(val);
        double[] err = evalErr(eval);
        txtErr.setText("");
         txtEval.setText("");
        txtErr.setText(err[0] + "");
       
        txtEval.setText(err[1] + "");        // TODO add your handling code here:
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
 double eval;
        String val = btn13.getText();
        eval = Double.parseDouble(val);
        double[] err = evalErr(eval);
        txtErr.setText("");
         txtEval.setText("");
        txtErr.setText(err[0] + "");
       
        txtEval.setText(err[1] + "");        // TODO add your handling code here:
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
 double eval;
        String val = btn14.getText();
        eval = Double.parseDouble(val);
        double[] err = evalErr(eval);
        txtErr.setText("");
         txtEval.setText("");
        txtErr.setText(err[0] + "");
       
        txtEval.setText(err[1] + "");        // TODO add your handling code here:
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
    double eval=Math.PI/6;
        double[] err = evalErr(eval);
        txtErr.setText("");
        txtErr.setText(err[0] + "");
        txtEval.setText("");
        txtEval.setText(err[1] + "");        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
 double eval;
        String val = btn2.getText();
        eval = Double.parseDouble(val);
        double[] err = evalErr(eval);
        txtErr.setText("");
        txtErr.setText(err[0] + "");
        txtEval.setText("");
        txtEval.setText(err[1] + "");        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
  jButtonEvaluarPunto.setVisible(false);
        numeroPuntos.setEnabled(false);        
        puntosIngresados.setText("");
        Principal_frm m = new Principal_frm(0);
        m.setI(0);
        Principal_frm.n = 0;
        Principal_frm.componenteX = null;
        Principal_frm.componenteY = null;
        Principal_frm.bj = null;
        Principal_frm.cj = null;
        Principal_frm.dj = null;
        numeroPuntos.setText("");
       
      
        jX.setEnabled(false);
        jY.setEnabled(false);
        puntoEvaluar.setText("");
        jTextArea.setText("");
        jTextField_S_X.setText("");
        puntoEvaluar.setEnabled(false);
        jButtonregistrar.setEnabled(true);//
        visualizar_grafica.setEnabled(false);// se desavilitamos el boton visualizar grafica de punto
        //jPanelMuestraGrafica.setVisible(false);
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn011ActionPerformed

puntoEvaluar.setText(btn011.getText());
        try {
            boolean mensaje = false;
            JEP b1 = new JEP();
            b1.addStandardFunctions(); // adiciona las funciones matem´aticas
            b1.addStandardConstants();
            b1.parseExpression(puntoEvaluar.getText()); // paso de la expresi´on a evaluar
            double x_evaluar = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x
            double sx;// variable que almacena el valor del polinomio en el punto ingresado
            for (int i = 0; i < Principal_frm.getN() - 1; i++) {
                if (x_evaluar >= componenteX[i] && x_evaluar <= componenteX[i + 1]) {// si el punto ingresado es elemento del intervale [Xi,Xi+1]
                    // se evalua e punto ingresado en el polinomio Sj
                    sx = componenteY[i] + (bj[i] * (x_evaluar - componenteX[i])) + (cj[i] * Math.pow(x_evaluar - componenteX[i], 2)) + (dj[i] * Math.pow(x_evaluar - componenteX[i], 3));
                    jTextField_S_X.setText("valor  aproximado S(" + x_evaluar + ")= " + sx);//  inprime el resultado de la evluacion anterior
                    mensaje = true;

                }

            }// fin bucle i
            if (mensaje == false) {// si el punto ingresado no esta en el intervalo [x0,xn]
                jTextField_S_X.setText("punto a evaluar no está en el intervalo [ " + Double.toString(componenteX[0]) + " , " + Double.toString(componenteX[componenteX.length - 1]) + " ]");
            }
        } catch (Exception e) {
            jTextField_S_X.setText("error el el ingreso del punto a evaluar");
        }      
        
        
        
    }//GEN-LAST:event_btn011ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
       
puntoEvaluar.setText(btn03.getText());
        try {
            boolean mensaje = false;
            JEP b1 = new JEP();
            b1.addStandardFunctions(); // adiciona las funciones matem´aticas
            b1.addStandardConstants();
            b1.parseExpression(puntoEvaluar.getText()); // paso de la expresi´on a evaluar
            double x_evaluar = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x
            double sx;// variable que almacena el valor del polinomio en el punto ingresado
            for (int i = 0; i < Principal_frm.getN() - 1; i++) {
                if (x_evaluar >= componenteX[i] && x_evaluar <= componenteX[i + 1]) {// si el punto ingresado es elemento del intervale [Xi,Xi+1]
                    // se evalua e punto ingresado en el polinomio Sj
                    sx = componenteY[i] + (bj[i] * (x_evaluar - componenteX[i])) + (cj[i] * Math.pow(x_evaluar - componenteX[i], 2)) + (dj[i] * Math.pow(x_evaluar - componenteX[i], 3));
                    jTextField_S_X.setText("valor  aproximado S(" + x_evaluar + ")= " + sx);//  inprime el resultado de la evluacion anterior
                    mensaje = true;

                }

            }// fin bucle i
            if (mensaje == false) {// si el punto ingresado no esta en el intervalo [x0,xn]
                jTextField_S_X.setText("punto a evaluar no está en el intervalo [ " + Double.toString(componenteX[0]) + " , " + Double.toString(componenteX[componenteX.length - 1]) + " ]");
            }
        } catch (Exception e) {
            jTextField_S_X.setText("error el el ingreso del punto a evaluar");
        }      
        
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed

puntoEvaluar.setText(btn04.getText());
        try {
            boolean mensaje = false;
            JEP b1 = new JEP();
            b1.addStandardFunctions(); // adiciona las funciones matem´aticas
            b1.addStandardConstants();
            b1.parseExpression(puntoEvaluar.getText()); // paso de la expresi´on a evaluar
            double x_evaluar = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x
            double sx;// variable que almacena el valor del polinomio en el punto ingresado
            for (int i = 0; i < Principal_frm.getN() - 1; i++) {
                if (x_evaluar >= componenteX[i] && x_evaluar <= componenteX[i + 1]) {// si el punto ingresado es elemento del intervale [Xi,Xi+1]
                    // se evalua e punto ingresado en el polinomio Sj
                    sx = componenteY[i] + (bj[i] * (x_evaluar - componenteX[i])) + (cj[i] * Math.pow(x_evaluar - componenteX[i], 2)) + (dj[i] * Math.pow(x_evaluar - componenteX[i], 3));
                    jTextField_S_X.setText("valor  aproximado S(" + x_evaluar + ")= " + sx);//  inprime el resultado de la evluacion anterior
                    mensaje = true;

                }

            }// fin bucle i
            if (mensaje == false) {// si el punto ingresado no esta en el intervalo [x0,xn]
                jTextField_S_X.setText("punto a evaluar no está en el intervalo [ " + Double.toString(componenteX[0]) + " , " + Double.toString(componenteX[componenteX.length - 1]) + " ]");
            }
        } catch (Exception e) {
            jTextField_S_X.setText("error el el ingreso del punto a evaluar");
        }      
                // TODO add your handling code here:
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2000ActionPerformed

puntoEvaluar.setText(btn2000.getText());
        try {
            boolean mensaje = false;
            JEP b1 = new JEP();
            b1.addStandardFunctions(); // adiciona las funciones matem´aticas
            b1.addStandardConstants();
            b1.parseExpression(puntoEvaluar.getText()); // paso de la expresi´on a evaluar
            double x_evaluar = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x
            double sx;// variable que almacena el valor del polinomio en el punto ingresado
            for (int i = 0; i < Principal_frm.getN() - 1; i++) {
                if (x_evaluar >= componenteX[i] && x_evaluar <= componenteX[i + 1]) {// si el punto ingresado es elemento del intervale [Xi,Xi+1]
                    // se evalua e punto ingresado en el polinomio Sj
                    sx = componenteY[i] + (bj[i] * (x_evaluar - componenteX[i])) + (cj[i] * Math.pow(x_evaluar - componenteX[i], 2)) + (dj[i] * Math.pow(x_evaluar - componenteX[i], 3));
                    jTextField_S_X.setText("valor  aproximado S(" + x_evaluar + ")= " + sx);//  inprime el resultado de la evluacion anterior
                    mensaje = true;

                }

            }// fin bucle i
            if (mensaje == false) {// si el punto ingresado no esta en el intervalo [x0,xn]
                jTextField_S_X.setText("punto a evaluar no está en el intervalo [ " + Double.toString(componenteX[0]) + " , " + Double.toString(componenteX[componenteX.length - 1]) + " ]");
            }
        } catch (Exception e) {
            jTextField_S_X.setText("error el el ingreso del punto a evaluar");
        }      
                // TODO add your handling code here:
    }//GEN-LAST:event_btn2000ActionPerformed

    private void jButtonEvaluarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluarPuntoActionPerformed
        // TODO add your handling code here:
        puntoEvaluar.setText("");
        try {
            boolean mensaje = false;
            JEP b1 = new JEP();
            b1.addStandardFunctions(); // adiciona las funciones matem´aticas
            b1.addStandardConstants();
            b1.parseExpression(puntoEvaluar.getText()); // paso de la expresi´on a evaluar
            double x_evaluar = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x
            double sx;// variable que almacena el valor del polinomio en el punto ingresado
            for (int i = 0; i < Principal_frm.getN() - 1; i++) {
                if (x_evaluar >= componenteX[i] && x_evaluar <= componenteX[i + 1]) {// si el punto ingresado es elemento del intervale [Xi,Xi+1]
                    // se evalua e punto ingresado en el polinomio Sj
                    sx = componenteY[i] + (bj[i] * (x_evaluar - componenteX[i])) + (cj[i] * Math.pow(x_evaluar - componenteX[i], 2)) + (dj[i] * Math.pow(x_evaluar - componenteX[i], 3));
                    jTextField_S_X.setText("valor  aproximado S(" + x_evaluar + ")= " + sx);//  inprime el resultado de la evluacion anterior
                    mensaje = true;

                }

            }// fin bucle i
            if (mensaje == false) {// si el punto ingresado no esta en el intervalo [x0,xn]
                jTextField_S_X.setText("punto a evaluar no está en el intervalo [ " + Double.toString(componenteX[0]) + " , " + Double.toString(componenteX[componenteX.length - 1]) + " ]");
            }
        } catch (Exception e) {
            jTextField_S_X.setText("error el el ingreso del punto a evaluar");
        }
    }//GEN-LAST:event_jButtonEvaluarPuntoActionPerformed

    private void btnGraffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraffActionPerformed

        pnelMetodos.setVisible(false);
        btnSalir.setVisible(true);
       cmbProblema.setVisible(false);
         
            setSize(900,690);//500,350
            setTitle("interfaz grafica");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
     
            Container Contenedor = getContentPane();
          
            GraficadorClasico mipanel = new GraficadorClasico(Contenedor);
           
            this.add(mipanel);
   
            setVisible(true);
       
        
    }//GEN-LAST:event_btnGraffActionPerformed

    public void splines(int n1) {
        boolean mensaje = false;
        try {
            int puntos = n1;
            String puntosSr[] = new String[puntos];
            String punto;
            double x[] = componenteX;// arreglo que almacena las componentes x de los puntos ingresados
            double y[] = componenteY;// arreglo que almacena las componentes Y de los puntos ingresados

            // AC=b
            double h[] = new double[puntos];




            for (int i = 0; i < puntos - 1; i++) {
                h[i] = x[i + 1] - x[i];
            }



            double b[] = new double[puntos];



            /**
             * paso a cargar la matriz b 
             * |-                                           -|
             * |         0                                   |
             * | 3(x2-x1)/h1 - 3(x1-x0)/h0                   |
             * |       .                                     | 
             * |       .                                     |
             * |       .                                     | =b, con i=0,...,n-1 | . |
             * | 3(Xn - Xn-1)/(hn-1) - 3(Xn-1 - Xn-2)/(hn-2) |
             * |          0                                  |
             * |-                                           -|(n+1)x1
             */
            b[0] = 0;
            b[puntos - 1] = 0;
            for (int i = 1; i < puntos - 1; i++) {
                b[i] = ((3 / h[i]) * (y[i + 1] - y[i])) - ((3 / h[i - 1]) * (y[i] - y[i - 1]));

            }// fin cargar matriz b







            // 
            double matrizA[][] = new double[puntos][puntos];// de orden nxn, con i=0,...,n-1
            /**
             * |-                                                  -|
             * | 1            0 ................................. 0 | 
             * | h0      2(h0+h1)    h1 ................          0 | 
             * | 0          h1   2(h1+h2)     h2 ................ 0 |
             * | 0           0  .....................  .  0       1 |
             * | 0           0             hn-2  2(hn-2 +hn-1) hn-1 |
             * |-                                                  -| (n+1)x(n+1)
                 
                 * A=matrizA, con i=0,...,n-1  
             
             */
            matrizA[0][0] = 1;
            matrizA[puntos - 1][puntos - 1] = 1;

            for (int i = 1; i < puntos; i++) {
                matrizA[0][i] = 0;
            }
            for (int i = 0; i < puntos - 1; i++) {
                matrizA[puntos - 1][i] = 0;
            }



            // paso a cargar la matrizA  desde la fila i asta la fila n,  con  i=1,...n


            for (int i = 1; i < puntos; i++) {
                for (int j = 1; j < puntos - 1; j++) {

                    if (i == j) {
                        matrizA[i][j - 1] = h[j - 1];
                        matrizA[i][j] = 2 * (h[j - 1] + h[j]);
                        matrizA[i][j + 1] = h[j];
                    }

                }// fin buqle j

            }// fin bucle i
            // fin cargar la matirzA 




            /**
             * la matrizA1 es de dimension (puntos-2)x(puntos-2), usada para
             * resolver el sistema de e uaciones para en contrar las incognitas
             * cj de la matriz C Note que por las condiciones de frotera las
             * componentes Cjo=0 y Cjn=0
             */
            double matrizA1[][] = new double[puntos - 2][puntos - 2];
            for (int i = 0; i < puntos - 2; i++) {
                for (int j = 0; j < puntos - 2; j++) {
                    matrizA1[i][j] = matrizA[i + 1][j + 1];
                }// fin buqle j
            }// bucle i







            int n = puntos - 2;
            double r[] = new double[n];// carreglo que almacenara los valores de Cji  desde i=1,...,n-2
            for (int l = 0; l < n; l++) {
                r[l] = b[l + 1];

            }




            /**
             * acontinuacion usamos el metodo de caus jordan para encontar los
             * valores de Cji desde i=1,...,n-2
             */
            double d, c1;
            for (int i = 0; i <= n - 1; i++) {
                d = matrizA1[i][i];
                for (int s = 0; s <= n - 1; s++) {
                    matrizA1[i][s] = ((matrizA1[i][s]) / d);
                }
                r[i] = ((r[i]) / d);
                for (int x1 = 0; x1 <= n - 1; x1++) {
                    if (i != x1) {
                        c1 = matrizA1[x1][i];
                        for (int y1 = 0; y1 <= n - 1; y1++) {
                            matrizA1[x1][y1] = matrizA1[x1][y1] - c1 * matrizA1[i][y1];
                        }
                        r[x1] = r[x1] - c1 * r[i];
                    }// fin if
                }/// buble x1
            }// fin bucle i





            /**
             * nesitamos que la matriz C sea de la forma
             *
             * |- -| 
             * | 0 |
             * | 1 |
             * | 1 |
             * | . |
             * | . | =C
             * | . |
             * | . |
             * | 1 |
             * | 0 |
             * |- -|(n+1)x1 Note que por las condiciones de frotera las componentes
             * Cjo=0 y Cjn=0
             */
            double cj[] = new double[puntos];
            cj[0] = 0;
            cj[puntos - 1] = 0;
            for (int i = 1; i < puntos - 1; i++) {
                cj[i] = r[i - 1];
            }



            /**
             * los polinomios de Splin cubicos esta dadas por la siguiente
             * expresion Sj(X)=aj+bj(x-xj)+cj(x-xj)^2 +dj(x-xj)^3, donde las
             * aj=y[j]
             */
            double bj[] = new double[puntos - 1];
            double dj[] = new double[puntos - 1];
            for (int i = 0; i < puntos - 1; i++) {
                bj[i] = ((y[i + 1] - y[i]) / h[i]) - ((h[i] * (2 * cj[i] + cj[i + 1])) / 3);
                dj[i] = (cj[i + 1] - cj[i]) / (3 * h[i]);
            }



            for (int j = 0; j < puntos - 1; j++) {
                String signo = "-";
                if (x[j] < 0) {
                    signo = "";
               
                }
               String cadena=y[j] + " + (" + bj[j] + ")(x" + j + signo + x[j] + ")  +  (" + cj[j] + ")(x" + j + signo + x[j] + ")^2 + ( " + dj[j] + ")(x" + j + signo + x[j] + ")^3";

                String salida="S" + j + "(x)= " + y[j] + " + (" + bj[j] + ")(x" + j + signo + x[j] + ")  +  (" + cj[j] + ")(x" + j + signo + x[j] + ")^2 + ( " + dj[j] + ")(x" + j + signo + x[j] + ")^3\n";
                System.out.println(salida);

                jTextArea.append(salida);
            }




            Principal_frm.cj = cj;
            Principal_frm.bj = bj;
            Principal_frm.dj = dj;

            puntoEvaluar.setEnabled(true);
            puntoEvaluar.setEditable(true);
            jButtonEvaluarPunto.setEnabled(true);

        } // try // try // try // try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error lectura de datos");
        }


    }// fin del metodo splines

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_frm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn011;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn2000;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnCalculinho;
    private javax.swing.JButton btnGraff;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbProblema;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEvaluarPunto;
    private javax.swing.JButton jButtonregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelMuestraGrafica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextField_S_X;
    private javax.swing.JTextField jX;
    private javax.swing.JTextField jY;
    private javax.swing.JTextField numeroPuntos;
    private javax.swing.JTabbedPane pnelMetodos;
    private javax.swing.JTextField puntoEvaluar;
    private javax.swing.JTextField puntosIngresados;
    private javax.swing.JTextField txtErr;
    private javax.swing.JTextField txtEval;
    private javax.swing.JLabel txtPE;
    private javax.swing.JTextArea txtPolinomio;
    private javax.swing.JTextField txtXY;
    private javax.swing.JButton visualizar_grafica;
    // End of variables declaration//GEN-END:variables
}
