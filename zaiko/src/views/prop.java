package views;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import database.articleDB;
import database.propDB;
/**
 *
 * @author jorge
 */
public class prop extends javax.swing.JPanel {

    /**
     * Creates new form prop
     */
    public prop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        titleCode = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        cleanBrand = new javax.swing.JLabel();
        titleBrand = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        titleDescription = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        titleLot = new javax.swing.JLabel();
        lot = new javax.swing.JSpinner();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        saveLot = new javax.swing.JCheckBox();

        title.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Agregar accesorios");

        titleCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleCode.setText("Codigo:");

        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeKeyPressed(evt);
            }
        });

        cleanBrand.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cleanBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleanBrand.setText("x");
        cleanBrand.setToolTipText("Borrar marca");
        cleanBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cleanBrandMousePressed(evt);
            }
        });

        titleBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleBrand.setText("Marca:");

        titleDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleDescription.setText("Descripcion:");

        titleLot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleLot.setText("Cantidad:");

        lot.setToolTipText("");
        lot.setValue(1);

        cancel.setText("Volver");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        saveLot.setToolTipText("Mantener cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(titleLot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lot))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveLot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cleanBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleCode)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleBrand))
                    .addComponent(cleanBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLot)
                    .addComponent(saveLot, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(save))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
        if(evt.getKeyCode() == 10){
            brand.requestFocusInWindow();
        }
    }//GEN-LAST:event_codeKeyPressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(validateData()){
            try {
                articleDB.add(code.getText(), Integer.parseInt(lot.getValue().toString()));
                propDB.add(brand.getText(), description.getText());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El codigo " + code.getText() + " ya fue registrado.", "Codigo ya existente", 1);
            }
            
            code.setText("");
            description.setText("");
            if(!saveLot.isSelected()){
                lot.setValue(1);
            }
            code.requestFocusInWindow();            
        }else{
            JOptionPane.showMessageDialog(null, "Rellena todos los campos", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        menu.changeContent(new inventory(), null);
    }//GEN-LAST:event_cancelActionPerformed

    private void cleanBrandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBrandMousePressed
        brand.setText("");
        brand.requestFocusInWindow();
    }//GEN-LAST:event_cleanBrandMousePressed
    
    private boolean validateData(){
        boolean ok;
        
        ok = !(code.getText().isBlank() || brand.getText().isBlank() || description.getText().isBlank());
        
        if(Integer.parseInt(lot.getValue().toString()) < 0){
            ok = false;
        }
        
        return ok;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel cleanBrand;
    public javax.swing.JTextField code;
    private javax.swing.JTextField description;
    private javax.swing.JSpinner lot;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox saveLot;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleBrand;
    private javax.swing.JLabel titleCode;
    private javax.swing.JLabel titleDescription;
    private javax.swing.JLabel titleLot;
    // End of variables declaration//GEN-END:variables
}
