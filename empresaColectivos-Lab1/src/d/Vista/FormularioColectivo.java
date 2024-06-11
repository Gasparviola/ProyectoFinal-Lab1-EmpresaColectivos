package d.Vista;

import b.Entidades.Colectivo;
import c.Data.ColectivoData;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormularioColectivo extends javax.swing.JInternalFrame {

    private ColectivoData coleData;
    
    /**
     * Creates new form GestionColectivo
     */
    public FormularioColectivo(ColectivoData coleData) {
        initComponents();
        this.coleData = coleData;
    }

    private void limpiar(){
            txtMatricula.setText("");
            txtMarca.setText("");
            txtModelo.setText("");
            txtCapacidad.setText("");
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
        titleMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Estado1 = new javax.swing.JCheckBox();
        Buscarbtn = new javax.swing.JButton();
        Limpiarbtn = new javax.swing.JButton();
        Registrarbtn = new javax.swing.JButton();
        Salirbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario colectivo");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("Colectivo");

        titleMatricula.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        titleMatricula.setText("Matricula:");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setText("Capacidad:");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel5.setText("Estado:");

        Estado1.setText("jCheckBox1");

        Buscarbtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Buscarbtn.setText("Buscar");
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });

        Limpiarbtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Limpiarbtn.setText("Limpiar");
        Limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarbtnActionPerformed(evt);
            }
        });

        Registrarbtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Registrarbtn.setText("Registrar");
        Registrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarbtnActionPerformed(evt);
            }
        });

        Salirbtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Salirbtn.setText("Salir");
        Salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setText("Marca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleMatricula)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricula)
                            .addComponent(txtMarca)
                            .addComponent(txtModelo))
                        .addGap(18, 18, 18)
                        .addComponent(Buscarbtn)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCapacidad)
                                .addGap(117, 117, 117))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addGap(0, 218, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Limpiarbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Registrarbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salirbtn)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleMatricula)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscarbtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estado1)
                            .addComponent(jLabel5))
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Limpiarbtn)
                            .addComponent(Registrarbtn)
                            .addComponent(Salirbtn))
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        // TODO add your handling code here:
//        
         //Validar Matricula
        String matricula;      
            
        matricula = txtMatricula.getText();
                                               
        Colectivo cole = coleData.buscarColectivoPorMatricula(matricula);
        if(cole == null){
            txtMatricula.setText("");
            txtMarca.setText("");
            txtModelo.setText("");
            txtCapacidad.setText("");
            Estado1.setSelected(false);
            JOptionPane.showMessageDialog(null, "Colectivo no encontrado" );
        }else{
            txtMatricula.setText(cole.getMatricula());
            txtMarca.setText(cole.getMarca());
            txtModelo.setText(cole.getModelo());
            txtCapacidad.setText(Integer.toString(cole.getCapacidad()));
            Estado1.setSelected(cole.isEstado());           
        }

    }//GEN-LAST:event_BuscarbtnActionPerformed

    private void LimpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarbtnActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_LimpiarbtnActionPerformed

    private void RegistrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarbtnActionPerformed
        // TODO add your handling code here:

        String matricula =   txtMatricula.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String capacidad = txtCapacidad.getText();
        boolean estado = Estado1.isSelected();
       System.out.println(estado);
       
       if(matricula.isBlank() || marca.isBlank() || modelo.isBlank() || capacidad.isBlank()){           
           JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos" );
           return;
       }
       
       int capac = Integer.parseInt(capacidad);

       
       Colectivo cole = coleData.buscarColectivoPorMatricula(matricula);
       
       boolean resultado;
       if(cole == null){
           cole = new Colectivo(matricula,marca,modelo,capac,estado);
           coleData.añadirColectivo(cole);           
           resultado=true;
       }else{
           cole.setMatricula(matricula);
           cole.setMarca(marca);
           cole.setModelo(modelo);
           cole.setCapacidad(capac);
           cole.setEstado(estado);
           coleData.modificarColectivo(cole);
           resultado=true;
       }
       
       //imprimir resultado
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Colectivo guardado o modificado");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo guardar el colectivo");
        }
    }//GEN-LAST:event_RegistrarbtnActionPerformed

    private void SalirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirbtnActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_SalirbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JCheckBox Estado1;
    private javax.swing.JButton Limpiarbtn;
    private javax.swing.JButton Registrarbtn;
    private javax.swing.JButton Salirbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel titleMatricula;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}