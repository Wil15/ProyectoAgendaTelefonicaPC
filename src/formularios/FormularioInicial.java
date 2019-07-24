package formularios;

import com.sun.glass.events.KeyEvent;
import controlador.CrudPersona;
import controlador.CrudTelefono;
import entidades.Persona;
import entidades.Telefono;
//import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wilkince Mauricio
 */
public class FormularioInicial extends javax.swing.JFrame {

    /**
     * Creates new form FormularioInicia
     */
    public FormularioInicial() {
        initComponents();
        listarContactos();
    }
    
    //Metodo encargado de listar los datos en "listDatos"
    private void listarContactos(){

        CrudPersona crear = new CrudPersona();
        DefaultListModel<Persona> modelo = new DefaultListModel<>();
        ArrayList<Persona> datos =  crear.buscarPersonas();
        
        for(int indice = 0; indice < datos.size(); indice++){
            modelo.addElement(datos.get(indice));
        }
        this.listDatos.setModel(modelo);
        this.listDatos.setSelectedIndex(0);
        this.listDatos.grabFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDatos = new javax.swing.JList<>();
        panelNombre = new javax.swing.JPanel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelDireccion = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNumerosTelefonicos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda Telefonica");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONTACTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(263, 263, 263))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        listDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listDatosMousePressed(evt);
            }
        });
        listDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listDatosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(listDatos);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelNombreLayout = new javax.swing.GroupLayout(panelNombre);
        panelNombre.setLayout(panelNombreLayout);
        panelNombreLayout.setHorizontalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres)
                    .addComponent(lblApellidos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNombreLayout.setVerticalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblApellidos)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sign-add.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pencil.png"))); // NOI18N

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sign-delete.png"))); // NOI18N

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/off_logout_17916.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnEditar)
                            .addComponent(btnAgregar))))
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAgregar)
                .addGap(29, 29, 29)
                .addComponent(btnEditar)
                .addGap(32, 32, 32)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDireccion.setEnabled(false);

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        javax.swing.GroupLayout panelDireccionLayout = new javax.swing.GroupLayout(panelDireccion);
        panelDireccion.setLayout(panelDireccionLayout);
        panelDireccionLayout.setHorizontalGroup(
            panelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDireccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDireccionLayout.setVerticalGroup(
            panelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDireccion)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tblNumerosTelefonicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNumerosTelefonicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblNumerosTelefonicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento correspondiente a listDatos
    private void listDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDatosMousePressed

        Persona persona = this.listDatos.getSelectedValue();
        if(persona != null){
            listarInformacionContacto();
            listarDireccion();
        }
    
    }//GEN-LAST:event_listDatosMousePressed
    //Evento correspondiente a listDatos
    private void listDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listDatosKeyPressed

        int codigo = evt.getKeyCode();
        if(codigo == KeyEvent.VK_DOWN  || codigo == KeyEvent.VK_UP){
            this.listDatosMousePressed(null);
        }
        
    }//GEN-LAST:event_listDatosKeyPressed
    
    //evento del botón "btnAgregar"
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        RegistroDatos datos = new RegistroDatos();
        datos.setLocationRelativeTo(null);
        datos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed
    //evento del botón "btnSalir"
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

//    private void saludar(){
//        JOptionPane.showMessageDialog(this, "Hola, aca figurando aprovechando que he terminado de hacer las modificaciones respectivas. Saludos :)", "Saludo de mi parte.", JOptionPane.INFORMATION_MESSAGE);
//    }
    
    //Método que muestra el nombre del contacto
    private void listarInformacionContacto(){
        Persona persona = this.listDatos.getSelectedValue();
        this.lblNombres.setText(persona.getPrimerNombre() + " " + persona.getSegundoNombre());
        this.lblApellidos.setText(persona.getPrimerApellido()+" "+persona.getSegundoApellido());
        listarNumerosTelefonicos(persona);
    }
    //método que muestra la direccion del contacto
    private void listarDireccion(){
        Persona persona = this.listDatos.getSelectedValue();
        this.lblDireccion.setText(persona.getDireccion());
    }
    //Método que muestra o lista los números de telefono junto al tipo.
    private void listarNumerosTelefonicos(Persona persona){
        CrudTelefono crudTelefono = new CrudTelefono();
        ArrayList<Telefono> telefonos = crudTelefono.buscarTelefonos(persona);
        if(telefonos != null && !telefonos.isEmpty()){
            limpiarTablaTelefonos();
            DefaultTableModel modelo = (DefaultTableModel) this.tblNumerosTelefonicos.getModel();
            for(int indice = 0; indice < telefonos.size(); indice++){
                Telefono telefono = telefonos.get(indice);
                Object[] fila = new Object[]{telefono, telefono.getTipo()};
                modelo.addRow(fila);
            }
            this.tblNumerosTelefonicos.setModel(modelo);
        }
    }
    //Método que limpia la tabla antes de mostrar un contaco seleccionado
    private void limpiarTablaTelefonos(){
        DefaultTableModel modelo = (DefaultTableModel) this.tblNumerosTelefonicos.getModel();
        int filas = modelo.getRowCount();
        for(int fila = filas - 1; fila >= 0; fila--){
            modelo.removeRow(fila);
        }        
        this.tblNumerosTelefonicos.setModel(modelo);
    }
    
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
            java.util.logging.Logger.getLogger(FormularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JList<Persona> listDatos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDireccion;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JTable tblNumerosTelefonicos;
    // End of variables declaration//GEN-END:variables
}
