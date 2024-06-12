
package d.Vista;

import b.Entidades.Colectivo;
import b.Entidades.Pasaje;
import b.Entidades.Pasajero;
import b.Entidades.Ruta;
import c.Data.ColectivoData;
import c.Data.HorariosData;
import c.Data.PasajeData;
import c.Data.PasajerosData;
import c.Data.RutaData;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormularioVentas extends javax.swing.JInternalFrame {
    private ColectivoData colectivoData;
    private PasajerosData pasajeroData;
    private RutaData rutaData;
    private PasajeData pasajeData;
    public FormularioVentas(PasajerosData pasajeroData,ColectivoData colectivoData,RutaData rutaData,PasajeData pasajeData) {
        initComponents();
        this.pasajeroData = pasajeroData;
        this.colectivoData = colectivoData;
        this.rutaData = rutaData;
        this.pasajeData = pasajeData;
    }
    
    private void limpiar(){
//            Fecha;
            DniTxt.setText("");
            ConboRuta.setSelectedIndex(-1);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        DniTxt = new javax.swing.JTextField();
        Buscarbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ConboRuta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Comprarbtn = new javax.swing.JButton();
        DatosPersona = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCColectivo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTHoraViaje = new javax.swing.JTextField();
        jTAsientos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTNroPasaje = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(" Gestion de Ventas");
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

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("Ventas");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setText("DNI:");

        Buscarbtn.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Buscarbtn.setText("Buscar");
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setText("Ruta:");

        ConboRuta.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel5.setText("Hora de viaje:");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel6.setText("Asientos:");

        jTable2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patente", "Marca", "Capacidad"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        Comprarbtn.setText("Comprar");
        Comprarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarbtnActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Colectivo:");

        jLabel8.setText("Precio:");

        jLabel9.setText("Nro Pasaje:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jCColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ConboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTAsientos)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTHoraViaje)
                                    .addComponent(jTPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(184, 184, 184))
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(DniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(44, 44, 44)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTNroPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Comprarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(Buscarbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(DatosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTNroPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Buscarbtn))
                .addGap(18, 18, 18)
                .addComponent(DatosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ConboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTHoraViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprarbtn)
                    .addComponent(jButton1))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        String Dni;       
        Dni = DniTxt.getText();                                 
        Pasajero pasajero = pasajeroData.buscarPasajeroPorDni(Dni);
        if(pasajero == null){
            DniTxt.setText("");
            DatosPersona.setText("");
            JOptionPane.showMessageDialog(null, "Pasajero no encontrado" );
        }else{
            DniTxt.setText(pasajero.getDNI());
            DatosPersona.setText(pasajero.toString());
        }
    }//GEN-LAST:event_BuscarbtnActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        ConboRuta.removeAllItems();
        List<Ruta> rutas = rutaData.listarRutas();
        for (Ruta rut : rutas) {
            ConboRuta.addItem(rut);
        }
        ConboRuta.setSelectedIndex(-1);
        
        jCColectivo.removeAllItems();
        List<Colectivo> colectivo = colectivoData.listarColectivos();
        for (Colectivo col : colectivo) {
            jCColectivo.addItem(col);
        }
        jCColectivo.setSelectedIndex(-1);
    }//GEN-LAST:event_formInternalFrameActivated

    private void ComprarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarbtnActionPerformed
        // TODO add your handling code here:
        String nroPasaje =(jTNroPasaje.getText());
        String Dni = DniTxt.getText();
        String Datos = DatosPersona.getText();
        String HoraViaje = jTHoraViaje.getText();
        String FechaViaje = Fecha.getDateFormatString();
        String Asiento = jTAsientos.getText();
        String Precio = jTPrecio.getText();
       
       if(Dni.isBlank() || Datos.isBlank() || HoraViaje.isBlank() || Asiento.isBlank() || Precio.isBlank() || nroPasaje.isBlank()){           
           JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos" );
           return;
       }
       int nroPasajes = Integer.parseInt(nroPasaje);
       Pasaje pasaje = pasajeData.buscarPasaje(nroPasajes);
       Pasajero pasajero = pasajeroData.buscarPasajeroPorDni(Dni);
       Ruta ruta = (Ruta) ConboRuta.getSelectedItem();
       Colectivo colectivo = (Colectivo) jCColectivo.getSelectedItem();
       LocalDate fechViaje = LocalDate.parse(FechaViaje);
       LocalTime horViaje = LocalTime.parse(HoraViaje);
       int Asien = Integer.parseInt(Asiento);
       double Prec = Double.parseDouble(Precio);
       boolean resultado;
       if(pasaje == null){
           pasaje = new Pasaje(pasajero,ruta,colectivo,horViaje,fechViaje,Asien,Prec);
           pasajeData.guardarPasaje(pasaje);           
           resultado=true;
       }else{
           pasaje.setPasajero(pasajero);
           pasaje.setColectivo(colectivo);
           pasaje.setRuta(ruta);
           pasaje.setHora_Viaje(horViaje);
           pasaje.setFecha_Viaje(fechViaje);
           pasaje.setAsiento(Asien);
           pasaje.setPrecio(Prec);
           pasajeData.modificarPasaje(pasaje);
           resultado=true;
       }
       
       //imprimir resultado
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Colectivo guardado o modificado");
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo guardar el colectivo");
        }
    }//GEN-LAST:event_ComprarbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JButton Comprarbtn;
    private javax.swing.JComboBox<Ruta> ConboRuta;
    private javax.swing.JTextField DatosPersona;
    private javax.swing.JTextField DniTxt;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Colectivo> jCColectivo;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTAsientos;
    private javax.swing.JTextField jTHoraViaje;
    private javax.swing.JTextField jTNroPasaje;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
