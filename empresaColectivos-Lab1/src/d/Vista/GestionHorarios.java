/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package d.Vista;

import b.Entidades.Horario;
import b.Entidades.Ruta;
import c.Data.HorariosData;
import c.Data.RutaData;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GestionHorarios extends javax.swing.JInternalFrame {

    RutaData rutaData;
    HorariosData horaData;
    /**
     * Creates new form GestionHorarios
     */
    public GestionHorarios(RutaData rutaData, HorariosData horaData) {
        initComponents();
        this.rutaData = rutaData;
        this.horaData = horaData;
    }

    private void limpiar(){
            txtAsignar.setText("");
            txtHoraSalida.setText("");
            txtHoraLlegada.setText("");          
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
        txtHoraSalida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Estado1 = new javax.swing.JCheckBox();
        GuardarBTN = new javax.swing.JButton();
        LimpiarBTN = new javax.swing.JButton();
        EliminarBTN = new javax.swing.JButton();
        SalirBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHoraLlegada = new javax.swing.JTextField();
        txtAsignar = new javax.swing.JTextField();
        BuscarBTN = new javax.swing.JButton();
        ModificarBTN = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("Gestion Horarios");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setText("Horario Salida:");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setText("Horario Llegada:");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setText("Estado:");

        Estado1.setText("jCheckBox1");

        GuardarBTN.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        GuardarBTN.setText("Registrar");
        GuardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTNActionPerformed(evt);
            }
        });

        LimpiarBTN.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        LimpiarBTN.setText("Limpiar");
        LimpiarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarBTNActionPerformed(evt);
            }
        });

        EliminarBTN.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        EliminarBTN.setText("Eliminar");
        EliminarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBTNActionPerformed(evt);
            }
        });

        SalirBTN.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        SalirBTN.setText("Salir");
        SalirBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel5.setText("Ruta  a Asignar:");

        BuscarBTN.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        BuscarBTN.setText("Buscar");

        ModificarBTN.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        ModificarBTN.setText("Modificar");
        ModificarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LimpiarBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarBTN)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoraSalida)
                            .addComponent(txtHoraLlegada)
                            .addComponent(txtAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarBTN)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModificarBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarBTN)
                        .addGap(35, 35, 35)
                        .addComponent(SalirBTN)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BuscarBTN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado1)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimpiarBTN)
                    .addComponent(GuardarBTN)
                    .addComponent(EliminarBTN)
                    .addComponent(SalirBTN)
                    .addComponent(ModificarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarBTNActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_LimpiarBTNActionPerformed

    private void GuardarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTNActionPerformed
        // TODO add your handling code here:
        
          String id  = txtAsignar.getText();
          String horaSalida = txtHoraSalida.getText();
          String horaLlegada = txtHoraLlegada.getText();        
          boolean estado = Estado1.isSelected();     
          System.out.println(estado);
       
       if( id.isBlank() || horaSalida.isBlank() || horaLlegada.isBlank()){           
           JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos" );
           return;
       }
       
       //Validar el id de la ruta
       int idRuta;
       
        try{
            
            idRuta = Integer.parseInt(txtAsignar.getText());
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ID Incorrecto" );
            return;
        }
       
       
       LocalTime hrSalida = LocalTime.parse(horaSalida);
       LocalTime hrLlegada = LocalTime.parse(horaLlegada);
       
       
       Ruta rut = rutaData.buscarRutasPorID(idRuta);
       
       boolean resultado;
       if(rut != null){
           Horario hr = new Horario(rut,hrSalida,hrLlegada,estado); 
           horaData.añadirHorario(hr);
           resultado=true;
       }else{  
           resultado=false;
       }
       
       //imprimir resultado
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Horario guardado");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo guardar el horario, no existe la ruta.");
        }
        
        
    }//GEN-LAST:event_GuardarBTNActionPerformed

    private void SalirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBTNActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_SalirBTNActionPerformed

    private void EliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBTNActionPerformed
        // TODO add your handling code here:
        
        //Validar ID
         LocalTime horaSalida;
       
        horaSalida =  LocalTime.parse(txtHoraSalida.getText());
        
        //buscar Horario por hora de salida
        Horario hora = horaData.buscarHorarioPorHoraSalida(horaSalida);
        if(hora==null){
            JOptionPane.showMessageDialog(null, "No se encontro el Horario vinculado a la hora de salida asignada");
            return;
        }else{
            if(hora.isEstado()==false){
                JOptionPane.showMessageDialog(null, "El horario esta dado de baja");
                return;
            }
        }
        
        // Eliminar Horario y limpiar campos(excepto la hora de salida)
        if (horaData.eliminarHorario(hora.getID_Horario())){           
            txtAsignar.setText("");
            txtHoraLlegada.setText("");
            Estado1.setSelected(false);
            JOptionPane.showMessageDialog(this, "Horario dado de baja.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Por alguna razon no se pudo eliminar
            JOptionPane.showMessageDialog(this, "No se pudo dar de baja el horario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_EliminarBTNActionPerformed

    private void ModificarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBTNActionPerformed
        // TODO add your handling code here:
        

          String id  = txtAsignar.getText();
          String horaSalida = txtHoraSalida.getText();
          String horaLlegada = txtHoraLlegada.getText();        
          boolean estado = Estado1.isSelected();     
          System.out.println(estado);
       
          if( id.isBlank() || horaSalida.isBlank() || horaLlegada.isBlank()){           
           JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos" );
           return;
       }
        
          
        int idRuta;
       
        try{
            
            idRuta = Integer.parseInt(txtAsignar.getText());
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ID Incorrecto" );
            return;
        }
        
        Ruta rut = rutaData.buscarRutasPorID(idRuta);
        
        LocalTime hrSalida;       
        hrSalida =  LocalTime.parse(txtHoraSalida.getText());
        LocalTime hrLlegada;
        hrLlegada = LocalTime.parse(txtHoraLlegada.getText());
        
        
        Horario hora = horaData.buscarHorarioPorHoraSalida(hrSalida);
        
       boolean resultado;
       if(hora != null){
           hora.setRuta(rut);
           hora.setHora_Salida(hrSalida);
           hora.setHora_Llegada(hrLlegada);
           hora.setEstado(estado);        
           horaData.modificarHorario(hora);                 
           resultado=true;
       }else{
           System.out.println("No existe el Horario");
           resultado=false;
       }
        
       if (resultado) {
            JOptionPane.showMessageDialog(this, "Horario modificado.");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo modificar el horario");
        }

        
    }//GEN-LAST:event_ModificarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JButton EliminarBTN;
    private javax.swing.JCheckBox Estado1;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JButton LimpiarBTN;
    private javax.swing.JButton ModificarBTN;
    private javax.swing.JButton SalirBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAsignar;
    private javax.swing.JTextField txtHoraLlegada;
    private javax.swing.JTextField txtHoraSalida;
    // End of variables declaration//GEN-END:variables
}