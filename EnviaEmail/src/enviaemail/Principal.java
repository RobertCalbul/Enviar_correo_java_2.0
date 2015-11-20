/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enviaemail;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author robert
 */
public class Principal extends javax.swing.JFrame {

    private Archivo_Class[] lista_adjunto = null;   //#Lista de adjuntos

    public Principal() {
        initComponents();
        panel_txt_adjunto.setVisible(false);//#panel de adjuntos inicialmente oculto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_para = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_asunto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_desde = new javax.swing.JTextField();
        panel_inferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_contenido = new javax.swing.JTextArea();
        btn_adjuntar = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();
        panel_txt_adjunto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea_adjuntos = new javax.swing.JTextArea();
        btn_borrar_adj = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cc = new javax.swing.JTextField();
        txt_cco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Para:");

        jLabel2.setText("Asunto:");

        jLabel3.setText("Desde:");

        textArea_contenido.setColumns(20);
        textArea_contenido.setRows(5);
        jScrollPane1.setViewportView(textArea_contenido);

        btn_adjuntar.setText("Adjuntar");
        btn_adjuntar.setToolTipText("");
        btn_adjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adjuntarActionPerformed(evt);
            }
        });

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        panel_txt_adjunto.setFocusable(false);

        textArea_adjuntos.setColumns(20);
        textArea_adjuntos.setRows(5);
        textArea_adjuntos.setToolTipText("");
        textArea_adjuntos.setEnabled(false);
        jScrollPane2.setViewportView(textArea_adjuntos);

        btn_borrar_adj.setText("X");
        btn_borrar_adj.setToolTipText("");
        btn_borrar_adj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_adjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_txt_adjuntoLayout = new javax.swing.GroupLayout(panel_txt_adjunto);
        panel_txt_adjunto.setLayout(panel_txt_adjuntoLayout);
        panel_txt_adjuntoLayout.setHorizontalGroup(
            panel_txt_adjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_txt_adjuntoLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_borrar_adj)
                .addContainerGap())
        );
        panel_txt_adjuntoLayout.setVerticalGroup(
            panel_txt_adjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_txt_adjuntoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btn_borrar_adj)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_inferiorLayout = new javax.swing.GroupLayout(panel_inferior);
        panel_inferior.setLayout(panel_inferiorLayout);
        panel_inferiorLayout.setHorizontalGroup(
            panel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inferiorLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_adjuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel_txt_adjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_inferiorLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_inferiorLayout.setVerticalGroup(
            panel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inferiorLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_txt_adjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adjuntar)
                    .addComponent(btn_enviar)))
        );

        jLabel4.setText("Hecho por Robert Calbul - codigosimportantes.blogspot.com");

        jLabel5.setText("CC");

        jLabel6.setText("CCO");

        txt_cco.setToolTipText("");

        jLabel7.setText("Enviar Email");

        lbl_estado.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_cco)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_cc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                                    .addComponent(txt_para)))))
                                    .addComponent(panel_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_asunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(lbl_estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_para, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        lbl_estado.setForeground(Color.black);
        JTextField Jpassword = new JPasswordField();    //#Crea un elemento de contraseña
        Object[] ob = {Jpassword};                      //#Obtiene la contraseña

        List<String> destinatatios = Arrays.asList(txt_para.getText().split(","));  //#Agrega los destinararios
        List<String> CC = Arrays.asList(txt_cc.getText().split(","));               //#Agrega los destinatarios con COPIA
        List<String> CCO = Arrays.asList(txt_cco.getText().split(","));             //#Agrega los destinatarios con COPIA OCULTA

        destinatatios = destinatatios.get(0).length() > 0 ? destinatatios : null;   //#Si existen destinatarios dejarlo intacto
                                                                                    //#de lo contrario dejarl la lista en nulo
        CC = CC.get(0).length() > 0 ? CC : null;        //#Si existen destinatarios con copia dejarlo intacto de lo contrario
                                                        //dejar la lista nula
        CCO = CCO.get(0).length() > 0 ? CCO : null;     //#Si existen destinatario con copia oculta dejarlo intacto de lo
                                                        //#contrario dejar la lista nula

        List<List<String>> contactos = new ArrayList<List<String>>();//#Dejar todos los destinatarios en una sola lista
        contactos.add(destinatatios);   
        contactos.add(CC);
        contactos.add(CCO);

        if (contactos.get(0) != null) { //#Si existe al menos un destinatario
            int result = JOptionPane.showConfirmDialog(null,
                    ob, "Ingrese su contraseña",
                    JOptionPane.OK_CANCEL_OPTION);//#Agre interfaz para contraseña

            if (result == JOptionPane.OK_OPTION) {  //#Si se ingreso una contraseña
                lbl_estado.setText("Estado: Enviando... "); //#Cambia estado

                EnviaEmail email = new EnviaEmail();        //#Instancea la clase EnviaEmail
                email.origen = txt_desde.getText().trim();  //#Setea el origen del correo
                email.psswd = Jpassword.getText().trim();   //#Setea la contraseña del correo
                email.destino = contactos;                  //#Añade la lista de destinatarios, CC y CCO
                email.asunto = txt_asunto.getText().trim(); //#Setea el asunto del mensaje
                email.cuerpo = textArea_contenido.getText().trim();//#Setea el contenido textual del mensaje
                email.adjunto = lista_adjunto;              //#Setea lista de adjuntos

                if (email.enviar()) {                       //#Si se envio correctamente el correo
                    lbl_estado.setForeground(Color.green);  //#Cambiar color estado
                    lbl_estado.setText("Estado: Enviado."); //#Cambia el estado
                } else {                                    //#De lo contrario      
                    lbl_estado.setForeground(Color.red);    //#Cambia color a rojo
                    lbl_estado.setText("Estado: Ocurrio un error al enviar.");//#Cambia estado
                }
            }
        } else { //#Si no existen destinatarios
            lbl_estado.setForeground(Color.black);
            //#Muestra mensaje de advertencia
            JOptionPane.showMessageDialog(null, "NO existen destinatarios.");
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_adjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adjuntarActionPerformed
        JFileChooser fileChooser = new JFileChooser();      //#Instancie un componente grafico
        fileChooser.setCurrentDirectory(
                new File(System.getProperty("user.home"))
        );//#Setea una ruta de inicio
        fileChooser.setMultiSelectionEnabled(true);         //#Se habilita la multiseleccion de archivos

        int result = fileChooser.showOpenDialog(this);      //#Agre el componente grafico

        if (result == JFileChooser.APPROVE_OPTION) {    //#Si se selecciono algo y se apreto en abrir
            File[] selectedFile = fileChooser.getSelectedFiles();   //#Obtiene una lista de archivos
            lista_adjunto = new Archivo_Class[selectedFile.length]; //#Crea un arreglo del tamaño de los archivos seleccionado
            String datos = "";  //#Resetea nombres de archivos

            for (int i = 0; i < selectedFile.length; i++) { //#Recorre arreglo de archuivos
                Archivo_Class archivos = new Archivo_Class(selectedFile[i].getName(),
                        selectedFile[i].getAbsolutePath());//#Crea un objeto tipo Archivo Class donde se 
                                                            //#pasa como paramteo nombre archivo y ruta
                lista_adjunto[i] = archivos;            //#Añade archivos a la lista
                datos += lista_adjunto[i].nombre + "\n";//#Agrega los adatos
            }//#Fin for
            textArea_adjuntos.setText(datos);           //#Muestra el nombre de los adjuntos
            panel_txt_adjunto.setVisible(true);         //#Panel de adjuntos visible
        }
    }//GEN-LAST:event_btn_adjuntarActionPerformed

    private void btn_borrar_adjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_adjActionPerformed
        lista_adjunto = null;               //#Resetea la lista de adjuntos
        textArea_adjuntos.setText("");      //#Resetea el mensaje
        panel_txt_adjunto.setVisible(false);//#Panel de adjuntos se oculta
    }//GEN-LAST:event_btn_borrar_adjActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adjuntar;
    private javax.swing.JButton btn_borrar_adj;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JPanel panel_inferior;
    private javax.swing.JPanel panel_txt_adjunto;
    private javax.swing.JTextArea textArea_adjuntos;
    private javax.swing.JTextArea textArea_contenido;
    private javax.swing.JTextField txt_asunto;
    private javax.swing.JTextField txt_cc;
    private javax.swing.JTextField txt_cco;
    private javax.swing.JTextField txt_desde;
    private javax.swing.JTextField txt_para;
    // End of variables declaration//GEN-END:variables
}
