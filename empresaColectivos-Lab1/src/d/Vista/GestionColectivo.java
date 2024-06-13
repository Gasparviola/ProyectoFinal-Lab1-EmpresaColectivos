package d.Vista;

import b.Entidades.Colectivo;
import c.Data.ColectivoData;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahue
 */
public class GestionColectivo extends javax.swing.JInternalFrame {

    private ColectivoData coleData;
    /**
     * Creates new form FormularioColectivo
     */
    public GestionColectivo(ColectivoData coleData) {
        initComponents();
        this.coleData= coleData;
    }

    private void limpiar(){
            jComboColectivo.setSelectedItem(-1);
            jTcapacidad.setText("");
            jTmarca.setText("");
            jTmodelo.setText("");
            jTmatricula.setText("");
            jCestado.setSelected(false);
    }
    
    private void setColectivo(boolean icol) {
        jTmatricula.setEnabled(icol);
        jTmarca.setEnabled(icol);
        jTmodelo.setEnabled(icol);
        jTcapacidad.setEnabled(icol);        
        jCestado.setEnabled(icol);         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboColectivo = new javax.swing.JComboBox<>();
        jTmatricula = new javax.swing.JTextField();
        jTmodelo = new javax.swing.JTextField();
        jTcapacidad = new javax.swing.JTextField();
        jBeditar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jCestado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTmarca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Colectivo");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel2.setText("Colectivo:");

        jLabel3.setText("Matricula:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Capacidad:");

        jLabel6.setText("Estado:");

        jComboColectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboColectivoActionPerformed(evt);
            }
        });

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Marca:");

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel8.setText("Colectivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(235, 235, 235))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jBeditar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jBeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBsalir)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jComboColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(55, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)
                                .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(58, 58, 58)
                                    .addComponent(jTmodelo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(39, 39, 39))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(58, 58, 58)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCestado)
                                            .addGap(0, 341, Short.MAX_VALUE))
                                        .addComponent(jTcapacidad)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCestado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeditar)
                    .addComponent(jBeliminar)
                    .addComponent(jBsalir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboColectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboColectivoActionPerformed
        // TODO add your handling code here:
        setColectivo(true);
        Colectivo colectivoSeleccionado = (Colectivo) jComboColectivo.getSelectedItem();
        if (colectivoSeleccionado != null) {
            jTmatricula.setText(colectivoSeleccionado.getMatricula());
            jTmarca.setText(colectivoSeleccionado.getMarca());
            jTmodelo.setText(colectivoSeleccionado.getModelo());
            jTcapacidad.setText(Integer.toString(colectivoSeleccionado.getCapacidad()));           
            jCestado.setSelected(colectivoSeleccionado.isEstado());
        } else {
            limpiar();
            jBeditar.setEnabled(true);
            jBeliminar.setEnabled(true);
            if (jComboColectivo.getItemCount() == 0) {
                jComboColectivo.setEnabled(false);
            } else {
                jComboColectivo.setEnabled(true);
            }
        }                                       
    }//GEN-LAST:event_jComboColectivoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        //Validar matricula
        String matricula;            
        matricula = jTmatricula.getText();        
        //buscar colectivo
        Colectivo cole = coleData.buscarColectivoPorMatricula(matricula);
        if(cole==null){
            JOptionPane.showMessageDialog(null, "No se encontro el colectivo vinculado a la matricula");
            return;
        }else{
            if(cole.isEstado()==false){
                JOptionPane.showMessageDialog(null, "El colectivo esta dado de baja");
                return;
            }
        }
        // Eliminar colectivos y limpiar campos (excepto matricula)
        if (coleData.eliminarColectivo(cole.getID_Colectivo())){           
            jTmatricula.setText("");
            jTmodelo.setText("");
            jTcapacidad.setText("");
            jCestado.setSelected(false);
            JOptionPane.showMessageDialog(this, "Colectivo dado de baja.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Por alguna razon no se pudo eliminar
            JOptionPane.showMessageDialog(this, "No se pudo dar de baja al colectivo.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        // TODO add your handling code here:

        String matricula = jTmatricula.getText();
        String marca = jTmarca.getText();
        String modelo = jTmarca.getText();
        int capacidad;
        try{
           capacidad= Integer.parseInt(jTcapacidad.getText());
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Erro: Ingrese un numero por favor.");
           return;
       }
        boolean estado = jCestado.isSelected();
        System.out.println(estado);
        
        Colectivo cole = coleData.buscarColectivoPorMatricula(matricula);
        boolean resultado;
        if(cole != null){
           cole.setMatricula(matricula);
           cole.setMarca(marca);
           cole.setModelo(modelo);
           cole.setCapacidad(capacidad);
           cole.setEstado(estado);
           coleData.modificarColectivo(cole);
           resultado=true;
        }else{
           System.out.println("No existe el colectivo");
           resultado=false;
        }
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Colectivo modificado.");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo modificar el colectivo");
        }
        
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        jComboColectivo.removeAllItems();
        List<Colectivo> colectivo = coleData.listarColectivos();
        for (Colectivo colectivos : colectivo) {
            jComboColectivo.addItem(colectivos);
        }
        jComboColectivo.setSelectedIndex(-1);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JCheckBox jCestado;
    private javax.swing.JComboBox<Colectivo> jComboColectivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTcapacidad;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTmatricula;
    private javax.swing.JTextField jTmodelo;
    // End of variables declaration//GEN-END:variables
}
