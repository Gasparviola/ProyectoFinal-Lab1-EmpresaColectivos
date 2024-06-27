package d.Vista;

import b.Entidades.Colectivo;
import c.Data.ColectivoData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nahue
 */
public class GestionColectivo extends javax.swing.JInternalFrame {
    
    private DefaultTableModel tablaCol = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fil, int col) {
            return false;
        }
    };
    private ColectivoData coleData;
    /**
     * Creates new form FormularioColectivo
     */
    public GestionColectivo(ColectivoData coleData) {
        initComponents();
        this.coleData= coleData;
        this.tablaCol = (DefaultTableModel) jtTabla.getModel();
//        armarCabecera();
        adminConsu();
    }

    private void limpiar(){
            jTcapacidad.setText("");
            jTmarca.setText("");
            jTmodelo.setText("");
            jTmatricula.setText("");
            jCestado.setSelected(false);
    }

    private void adminConsu(){
        tablaCol.setRowCount(0);
        List<Colectivo> colectivo = coleData.listarColectivos();
        for(Colectivo cole : colectivo){
        tablaCol.addRow(new Object[]{cole.getMatricula(),cole.getMarca(),cole.getModelo(),cole.getCapacidad(),cole.isEstado()});
        }
        jtTabla.setModel(tablaCol);
    }
    
    public void ActualizarTableRow(Colectivo cole) {
    DefaultTableModel model = (DefaultTableModel) jtTabla.getModel();
    // Busca la fila del colectivo por su matrícula
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(cole.getMatricula())) {
                model.setValueAt(cole.getMarca(), i, 1);
                model.setValueAt(cole.getModelo(), i, 2);
                model.setValueAt(cole.getCapacidad(), i, 3);
                model.setValueAt(cole.isEstado(), i, 4);
                return;
            }
        }
    }
    
    public void ActualizarTableRowEstado(String matricula, boolean estado) {
    DefaultTableModel model = (DefaultTableModel) jtTabla.getModel();
    // Busca la fila del colectivo por su matrícula y actualiza el estado
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(matricula)) {
                model.setValueAt(estado, i, 4);
                return;
            }
        }
    }

    
    private void setColectivo(boolean icol) {
        jTmatricula.setEnabled(icol);
        jTmarca.setEnabled(icol);
        jTmodelo.setEnabled(icol);
        jTcapacidad.setEnabled(icol);        
        jCestado.setEnabled(icol);         
    }
    
    public static boolean soloLetra(String nombre) {
        if (nombre == null || nombre.length() > 15) {
            return false;
        }
        String regex = "^^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$";
        return nombre.matches(regex);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTmatricula = new javax.swing.JTextField();
        jTmarca = new javax.swing.JTextField();
        jTmodelo = new javax.swing.JTextField();
        jTcapacidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCestado = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jBeditar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Colectivo");

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel8.setText("Gestion Colectivo");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Marca", "Modelo", "Capacidad", "Estado"
            }
        ));
        jtTabla.setToolTipText("");
        jtTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Capacidad:");

        jLabel6.setText("Estado:");

        jLabel3.setText("Matricula:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCestado)
                        .addComponent(jTmodelo, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                        .addComponent(jTcapacidad)
                        .addComponent(jTmarca))
                    .addComponent(jTmatricula))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jCestado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        Actualizar.setText("Actualizar tabla");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBeditar)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(149, 149, 149)
                                .addComponent(Actualizar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeditar)
                    .addComponent(jBeliminar)
                    .addComponent(jBsalir))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked
        // TODO add your handling code here:
        setColectivo(true);
        int fila =jtTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "no hay ninguna fila");

        } else {
            String matricula = (String)jtTabla.getValueAt(fila, 0);
            String marca = (String)jtTabla.getValueAt(fila, 1);
            String modelo = (String)jtTabla.getValueAt(fila, 2);
            int capacidad = (Integer)jtTabla.getValueAt(fila, 3);
            boolean estado = ((Boolean)jtTabla.getValueAt(fila, 4));
            jTmatricula.setText(matricula);
            jTmarca.setText(marca);
            jTmodelo.setText(modelo);
            jTcapacidad.setText(String.valueOf(capacidad));          
            jCestado.setSelected(estado);
            jTmatricula.setEnabled(false);
        } 
    }//GEN-LAST:event_jtTablaMouseClicked

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        //Validar matricula
        String matricula;
        matricula = jTmatricula.getText();
        //buscar colectivo
        Colectivo cole = coleData.buscarColectivoPorMatricula(matricula);
        if(cole==null){
            JOptionPane.showMessageDialog(this, "No se encontro el Colectivo vinculado a la Matricula.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            if(cole.isEstado()==false){
                JOptionPane.showMessageDialog(null, "El Colectivo esta dado de baja.");
                return;
            }
        }
        // Eliminar colectivos y limpiar campos (excepto matricula)
        if (coleData.eliminarColectivo(cole.getID_Colectivo())){
            ActualizarTableRowEstado(matricula,false);
            limpiar();
            JOptionPane.showMessageDialog(this, "Colectivo dado de baja.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Por alguna razon no se pudo eliminar
            JOptionPane.showMessageDialog(this, "No se pudo dar de baja al Colectivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        // TODO add your handling code here:
        String matricula = jTmatricula.getText();
        if (matricula.length() > 7) {//revisar para que tenga 3 letras y 3 numeros
            JOptionPane.showMessageDialog(this, "Matricula no se puede guardar si pasa de los 7 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("El string es válido: " + matricula);
        }
        String marca = jTmarca.getText();
        if (soloLetra(marca)==false) {
            JOptionPane.showMessageDialog(this, "Ingrese solo letras en la marca.", "Error", JOptionPane.ERROR_MESSAGE);
            jTmarca.setText("");
            return;
        }
        String modelo = jTmodelo.getText();
        int capacidad;
        try{
            capacidad= Integer.parseInt(jTcapacidad.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Solo se puede ingresar numeros.", "Error", JOptionPane.ERROR_MESSAGE);
            jTcapacidad.setText("");
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
            ActualizarTableRow(cole);
            limpiar();
            resultado=true;
        }else{
            System.out.println("No existe el colectivo");
            resultado=false;
        }
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Colectivo modificado.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo modificar el colectivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jBeditarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        adminConsu();
    }//GEN-LAST:event_ActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JCheckBox jCestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcapacidad;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTmatricula;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
