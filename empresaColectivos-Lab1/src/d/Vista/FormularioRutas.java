package d.Vista;

import b.Entidades.Ruta;
import c.Data.RutaData;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormularioRutas extends javax.swing.JInternalFrame {

    RutaData rutaData;
    
    /**
     * Creates new form GestionDeRutas
     */
    public FormularioRutas(RutaData rutaData) {
        initComponents();
        this.rutaData = rutaData;
    }

     private void limpiar(){
            txtOrigen.setText("");
            txtDestino.setText("");
            txtDuracion.setText("");          
            Estado1.setSelected(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Estado1 = new javax.swing.JCheckBox();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        Limpiarbtn = new javax.swing.JButton();
        Buscarbtn = new javax.swing.JButton();
        Registrarbtn = new javax.swing.JButton();
        Eliminarbtn = new javax.swing.JButton();
        Modificarbtn = new javax.swing.JButton();
        Salirbtn = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FormularioRutas");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("Rutas ");

        jLabel2.setText("Origen:");

        jLabel3.setText("Destino:");

        jLabel4.setText("Duracion:");

        jLabel5.setText("Estado:");

        Limpiarbtn.setText("Limpiar");
        Limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarbtnActionPerformed(evt);
            }
        });

        Buscarbtn.setText("Buscar");
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });

        Registrarbtn.setText("Registrar");
        Registrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarbtnActionPerformed(evt);
            }
        });

        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });

        Modificarbtn.setText("Modificar");

        Salirbtn.setText("Salir");
        Salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Limpiarbtn)
                        .addGap(34, 34, 34)
                        .addComponent(Registrarbtn)
                        .addGap(39, 39, 39)
                        .addComponent(Modificarbtn)
                        .addGap(35, 35, 35)
                        .addComponent(Eliminarbtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Estado1)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salirbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Buscarbtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Buscarbtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Limpiarbtn)
                            .addComponent(Registrarbtn)
                            .addComponent(Modificarbtn)
                            .addComponent(Eliminarbtn)
                            .addComponent(Salirbtn)))
                    .addComponent(Estado1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        // TODO add your handling code here:
        
        //Validar Matricula
        String origen;      
            
        origen = txtOrigen.getText();
                                               
        Ruta rut = rutaData.buscarRutaPorOrigen(origen);
        if(rut == null){          
            txtOrigen.setText("");
            txtDestino.setText("");
            txtDuracion.setText("");          
            Estado1.setSelected(false);
            JOptionPane.showMessageDialog(null, "Ruta no encontrada");
        }else{
            txtOrigen.setText(rut.getOrigen());
            txtDestino.setText(rut.getDestino());
            txtDuracion.setText(rut.getDuracion_Estimada().toString());                
            Estado1.setSelected(rut.isEstado());           
        }
        
    }//GEN-LAST:event_BuscarbtnActionPerformed

    private void SalirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirbtnActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_SalirbtnActionPerformed

    private void LimpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarbtnActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_LimpiarbtnActionPerformed

    private void RegistrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarbtnActionPerformed
        // TODO add your handling code here:
        
           String origen =  txtOrigen.getText();
           String destino =  txtDestino.getText();
            String duracion = txtDuracion.getText();          
            boolean estado = Estado1.isSelected();        
            System.out.println(estado);
       
       if(origen.isBlank() || destino.isBlank() || duracion.isBlank()){           
           JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos" );
           return;
       }
       
       
       LocalTime durac = LocalTime.parse(duracion);
       
       Ruta rut = rutaData.buscarRutaPorOrigen(origen);
       
       boolean resultado;
       if(rut == null){
           rut = new Ruta(origen,destino,durac,estado);
           rutaData.añadirRuta(rut);           
           resultado=true;
       }else{
           rut.setOrigen(origen);
           rut.setDestino(destino);
           rut.setDuracion_Estimada(durac);
           rut.setEstado(estado);
           rutaData.modificaRuta(rut);
           resultado=true;
       }
       
       //imprimir resultado
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Ruta guardada o modificada");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo guardar la ruta");
        }
        
        
    }//GEN-LAST:event_RegistrarbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed
        // TODO add your handling code here:
        
        //Validar matricula
        String origen;      
            
        origen = txtOrigen.getText();        
        
        //buscar colectivo
        Ruta rut = rutaData.buscarRutaPorOrigen(origen);
        if(rut==null){
            JOptionPane.showMessageDialog(null, "No se encontro la ruta vinculado al origen");
            return;
        }else{
            if(rut.isEstado()==false){
                JOptionPane.showMessageDialog(null, "La ruta esta dada de baja");
                return;
            }
        }
        
        // Eliminar rutas y limpiar campos (excepto origen)
        if (rutaData.eliminarRuta(rut.getID_Ruta())){           
            txtDestino.setText("");
            txtDuracion.setText("");
            Estado1.setSelected(false);
            JOptionPane.showMessageDialog(this, "Ruta dada de baja.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Por alguna razon no se pudo eliminar
            JOptionPane.showMessageDialog(this, "No se pudo dar de baja la ruta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_EliminarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JButton Eliminarbtn;
    private javax.swing.JCheckBox Estado1;
    private javax.swing.JButton Limpiarbtn;
    private javax.swing.JButton Modificarbtn;
    private javax.swing.JButton Registrarbtn;
    private javax.swing.JButton Salirbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
