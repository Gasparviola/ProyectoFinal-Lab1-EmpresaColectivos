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
    
    public static boolean soloLetra(String nombre) {
        if (nombre == null || nombre.length() > 15) {
            return false;
        }
        String regex = "^^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$";
        return nombre.matches(regex);
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
        jPanel1 = new javax.swing.JPanel();
        titleMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        Buscarbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Estado1 = new javax.swing.JCheckBox();
        Limpiarbtn = new javax.swing.JButton();
        Registrarbtn = new javax.swing.JButton();
        Salirbtn = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario colectivo");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("Formulario Colectivo");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titleMatricula.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        titleMatricula.setText("Matricula:");

        Buscarbtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Buscarbtn.setText("Comprobar");
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setText("Capacidad:");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel5.setText("Estado:");

        Estado1.setText("jCheckBox1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMatricula)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapacidad)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Buscarbtn))
                            .addComponent(txtMarca)
                            .addComponent(txtModelo))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscarbtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Estado1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Limpiarbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Registrarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salirbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiarbtn)
                    .addComponent(Registrarbtn)
                    .addComponent(Salirbtn))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        // TODO add your handling code here:       
         //Validar Matricula
        String matricula;      
            
        matricula = txtMatricula.getText();
        if (matricula.length() > 7) {
            JOptionPane.showMessageDialog(this, "Matricula no se puede guardar si pasa de los 7 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            System.out.println("El string es válido: " + matricula);
        }
        if(matricula.isBlank()){           
           JOptionPane.showMessageDialog(this, "Por favor ingrese una Matricula.", "Comprobar", JOptionPane.ERROR_MESSAGE);
           return;
       }
                                               
        Colectivo cole = coleData.buscarColectivoPorMatricula(matricula);
        if(cole == null ){
            JOptionPane.showMessageDialog(this, "Se puede ingresar la Matricula.", "Comprobar", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No se puede ingresar la misma Matricula.", "Error", JOptionPane.WARNING_MESSAGE); 
            limpiar();
        }
    }//GEN-LAST:event_BuscarbtnActionPerformed

    private void LimpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarbtnActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_LimpiarbtnActionPerformed

    private void RegistrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarbtnActionPerformed
        // TODO add your handling code here:
        String matricula = txtMatricula.getText();
        if (matricula.length() > 7) {
            JOptionPane.showMessageDialog(this, "Matricula no se puede guardar si pasa de los 7 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("El string es válido: " + matricula);
        }
        String marca = txtMarca.getText();
        if (soloLetra(marca)==false) {
            JOptionPane.showMessageDialog(this, "Ingrese solo letras en la Marca.", "Error", JOptionPane.ERROR_MESSAGE);
            txtMarca.setText("");
            return;
        }
        String modelo = txtModelo.getText();
        String capacidad = txtCapacidad.getText();
        boolean estado = Estado1.isSelected();
       System.out.println(estado);
       
       if(matricula.isBlank() || marca.isBlank() || modelo.isBlank() || capacidad.isBlank()){           
           JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos" );
           return;
       }
       int capac;
       try{
           capac= Integer.parseInt(capacidad);
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Solo se puede ingresar numeros", "Error", JOptionPane.ERROR_MESSAGE);
           txtCapacidad.setText("");
           return;
       }
       Colectivo cole = new Colectivo(matricula, marca, modelo, capac, estado);
        if (coleData.añadirColectivo(cole)) {
            JOptionPane.showMessageDialog(this, "Colectivo guardado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo guardar el Colectivo.\nQuizás ya haya un Colectivo guardado con esta matricula.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiar(); 
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleMatricula;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
