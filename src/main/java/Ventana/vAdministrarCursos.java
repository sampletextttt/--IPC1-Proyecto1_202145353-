/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

//import Administrador.ActualizarCurso;
import static Ventana.vAdminProfesores.contadorProfesores;
import static Ventana.vAdminProfesores.profesores;
import Ventana.vLogin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author William
 */
public class vAdministrarCursos extends javax.swing.JFrame {

    public static Curso[] cursos = new Curso[100];
    public static int contadorCursos;
    Curso[] copiaArreglo = cursos.clone();

    // Para actualizar curso
    public static int fila1;

    public static String codigo;
    public static String nombre;
    public static String creditos;
    public static String alumnos;
    public static String profesor;


    /**
     * Creates new form AdministradorCursos
     */
    public vAdministrarCursos() {
        initComponents();
        actualizarListadoCursos();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CrearProfBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoCursos = new javax.swing.JTable();
        EliminarBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        CargaMBtn = new javax.swing.JButton();
        ExportarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTop3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Listado Cursos");

        CrearProfBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CrearProfBtn.setText("Crear Curso");
        CrearProfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfBtnActionPerformed(evt);
            }
        });

        ListadoCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Creditos", "Alumno", "Profesor"
            }
        ));
        jScrollPane1.setViewportView(ListadoCursos);

        EliminarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });

        ActualizarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });

        CargaMBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn.setText("Carga Masiva");
        CargaMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtnActionPerformed(evt);
            }
        });

        ExportarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ExportarBtn.setText("Exportar Listado HTML");
        ExportarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarBtnActionPerformed(evt);
            }
        });

        tablaTop3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Puesto", "Curso", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tablaTop3);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Profesores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CrearProfBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(EliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CargaMBtn)
                                    .addComponent(ActualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ExportarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CrearProfBtn)
                            .addComponent(ActualizarBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CargaMBtn)
                            .addComponent(EliminarBtn))
                        .addGap(35, 35, 35)
                        .addComponent(ExportarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearProfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        vCrearCurso cp = new vCrearCurso();
        cp.setVisible(true);
    }//GEN-LAST:event_CrearProfBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        // TODO add your handling code here:
        
        fila1 = ListadoCursos.getSelectedRow();

        for (int i = fila1; i < contadorCursos - 1; i++) {
            cursos[i] = cursos[i + 1];
        }
        // se reduce en 1 la cantidad de cursos
        contadorCursos--;

        /*
        DefaultTableModel modeloListado = (DefaultTableModel) ListadoCursos.getModel();
        modeloListado.setRowCount(contadorCursos);
         */
        actualizarListadoCursos();

    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        fila1 = ListadoCursos.getSelectedRow();

        codigo = ListadoCursos.getModel().getValueAt(fila1, 0).toString();
        nombre = ListadoCursos.getModel().getValueAt(fila1, 1).toString();
        creditos = ListadoCursos.getModel().getValueAt(fila1, 2).toString();
        alumnos = ListadoCursos.getModel().getValueAt(fila1, 3).toString();
        profesor = ListadoCursos.getModel().getValueAt(fila1, 4).toString();
        alumnos= "0";


        this.setVisible(false);
        vActualizarCurso ap = new vActualizarCurso();
        ap.setVisible(true);
         
    }//GEN-LAST:event_ActualizarBtnActionPerformed

    private void CargaMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("holaa");

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        String filePath = fc.getSelectedFile().getAbsolutePath();
        System.out.println(filePath);

        BufferedReader reader = null;
        String line = "";

        contadorCursos = 0;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = reader.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");

                    int cantAlumnos = (int) Math.floor(Math.random() * (80 - 0) + 0);
                    Curso curso = new Curso(columnas[0], columnas[1],
                            columnas[2], String.valueOf(cantAlumnos), columnas[3]);

                    cursos[contadorFila - 1] = curso;

                }
                contadorFila++;

            }
            contadorCursos = contadorFila - 1;
            System.out.println(Arrays.toString(cursos));
            actualizarListadoCursos();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CargaMBtnActionPerformed

    private void ExportarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBtnActionPerformed
        // TODO add your handling code here:
        // codigo nombre creditos alumnos profesor
        if(contadorCursos<1){
            JOptionPane.showMessageDialog(null, "No hay cursos ingresados." , "Aviso" , JOptionPane.INFORMATION_MESSAGE);
        }else{
                int i=0;
                BufferedWriter ficheroSalida;
        File file=null;
        try
        {
            file=new File("Reporte de Cursos.html");
            ficheroSalida= new BufferedWriter(new FileWriter(file));
            Curso oCurso;

            ficheroSalida.write("<HTML><HEAD><TITLE> Reporte de Cursos </TITLE></HEAD><BODY><TABLE BORDER>");


            ficheroSalida.write("<TR><TH>CODIGO</TH><TH>NOMBRE</TH><TH>CREDITOS</TH><TH>ALUMNOS</TH><TH>PROFESOR</TH></TR>");
            while (i<contadorCursos) {
                ficheroSalida.write("<TR><TD>" + cursos[i].codigo +"</TH><TH>" + cursos[i].nombre + "</TH><TH>" + cursos[i].creditos + "</TH><TH>" + cursos[i].alumnos + "</TH><TH>" + cursos[i].profesor + "</TD></TR>");
                    i++;
        }


            //while(it.hasNext()) {
              //  oProfesor= it.next(); 
                //ficheroSalida.write("<TR><TD>"+oProfesor.getcodigo()+"</TD><TD>"+oArticulo.getNombre()+"</TH><TH>"+oArticulo.getProveedor()+"</TH><TH>"+oArticulo.getPrecio()+"</TH><TH>"+oArticulo.getcantidad()+"</TD></TR>");
            //}
            ficheroSalida.write("</TABLE></BODY></HTML>");

            ficheroSalida.close();
        }

        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }

        abrirReporte(file);
    }   
        
    }//GEN-LAST:event_ExportarBtnActionPerformed
    
    private void abrirReporte(File file)
   {
        Runtime rTime = Runtime.getRuntime();
        String browser = "C:/Program Files/Internet Explorer/iexplore.exe ";
        
        Process pc = null;
        
   }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        vLogin lg = new vLogin();
        lg.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        vAdminProfesores ac = new vAdminProfesores();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void actualizarListadoCursos(){
        if (contadorCursos > 0) {

            // actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoCursos.getModel();
            modeloListado.setRowCount(contadorCursos);

            for (int i = 0; i < contadorCursos; i++) {
                modeloListado.setValueAt(cursos[i].codigo, i, 0);
                modeloListado.setValueAt(cursos[i].nombre, i, 1);
                modeloListado.setValueAt(cursos[i].creditos, i, 2);
                modeloListado.setValueAt(cursos[i].alumnos, i, 3);
                modeloListado.setValueAt(cursos[i].profesor, i, 4);
            }

            // hacer top 3
            Curso[] arregloCopia = cursos.clone();

            // burbuja
            for (int comprobacion = 0; comprobacion < contadorCursos; comprobacion++) {
                System.out.println("Iniciando comprobacion");

                // ciclo para recorrer los elementos del arreglo
                for (int elementoArreglo = 0; elementoArreglo < contadorCursos - 1; elementoArreglo++) {
                    Curso elementoActual = arregloCopia[elementoArreglo];
                    Curso elementoSiguiente = arregloCopia[elementoArreglo + 1];

                    // si el actual es mayor al siguiente
                    if (Integer.valueOf(elementoActual.alumnos)
                            < Integer.valueOf(elementoSiguiente.alumnos)) {
                        // Se hace el intercambio
                        arregloCopia[elementoArreglo] = elementoSiguiente;
                        arregloCopia[elementoArreglo + 1] = elementoActual;

                    }
                }
            }

            System.out.println("entra aquii");
            // actualizar listado
            DefaultTableModel modeloTop3 = (DefaultTableModel) tablaTop3.getModel();

            modeloTop3.setValueAt("1", 0, 0);
            modeloTop3.setValueAt("2", 1, 0);
            modeloTop3.setValueAt("3", 2, 0);

            for (int i = 0; i < 3; i++) {
                // puesto, nombre, cantidad
                modeloTop3.setValueAt(arregloCopia[i].nombre, i, 1);
                modeloTop3.setValueAt(arregloCopia[i].alumnos, i, 2);
            }

        }    }   

    /**
     * @param args the command line arguments
     */



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton CargaMBtn;
    private javax.swing.JButton CrearProfBtn;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JButton ExportarBtn;
    private javax.swing.JTable ListadoCursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaTop3;
    // End of variables declaration//GEN-END:variables
}
