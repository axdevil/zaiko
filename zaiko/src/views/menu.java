package views;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jorge
 */
public class menu extends javax.swing.JFrame {
    
    static boolean panelAddVisible = false;
    static boolean panelMenuVisible = false;
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        
        hideAddPanel(false);
        hidePanelMenu(false);
        
        changeContent(new inventory(), null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        menuBtn = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        cases = new javax.swing.JLabel();
        props = new javax.swing.JLabel();
        mica = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        changeInventory = new javax.swing.JLabel();
        sell = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        menu.setBackground(new java.awt.Color(38, 121, 219));

        add.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("+");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
        });

        menuBtn.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        menuBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuBtn.setText("|||");
        menuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(add)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(menuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelAdd.setBackground(new java.awt.Color(38, 121, 219));

        cases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cases.setText("Protector");
        cases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casesMousePressed(evt);
            }
        });

        props.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        props.setText("Accesorio");
        props.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        props.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                propsMousePressed(evt);
            }
        });

        mica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mica.setText("Mica");
        mica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                micaMousePressed(evt);
            }
        });

        phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phone.setText("Telefono");
        phone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                phoneMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(cases, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mica, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(props, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cases)
                    .addComponent(props)
                    .addComponent(mica)
                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu.setBackground(new java.awt.Color(38, 121, 219));

        changeInventory.setText("Ajustar inventario");
        changeInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                changeInventoryMousePressed(evt);
            }
        });

        sell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sell.setText("Vender/Rebajar");
        sell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeInventory)
                .addGap(18, 18, 18)
                .addComponent(sell)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeInventory)
                    .addComponent(sell))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        content.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                contentComponentResized(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contentComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_contentComponentResized
        resizeContent();
    }//GEN-LAST:event_contentComponentResized

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        resizeContent();
    }//GEN-LAST:event_formWindowStateChanged

    private void casesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casesMousePressed
        cases w = new cases(null);
        changeContent(w,w.code);
    }//GEN-LAST:event_casesMousePressed

    private void phoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMousePressed
        phone w = new phone(null);
        changeContent(w,w.code);
    }//GEN-LAST:event_phoneMousePressed

    private void propsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propsMousePressed
        hideAddPanel(false);
        prop w = new prop(null);
        changeContent(w,w.code);
    }//GEN-LAST:event_propsMousePressed

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        if(panelAddVisible){
            hideAddPanel(false);
        }else{
            hidePanelMenu(false);
            hideAddPanel(true);
        }
    }//GEN-LAST:event_addMousePressed

    private void micaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_micaMousePressed
        mica w = new mica(null);
        changeContent(w,w.code);
    }//GEN-LAST:event_micaMousePressed

    private void menuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMousePressed
        if(panelMenuVisible){
            hidePanelMenu(false);
        }else{
            hideAddPanel(false);
            hidePanelMenu(true);
        }
    }//GEN-LAST:event_menuBtnMousePressed

    private void changeInventoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeInventoryMousePressed
        changeInventory w = new changeInventory();
        changeContent(w,w.code);
    }//GEN-LAST:event_changeInventoryMousePressed

    private void sellMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellMousePressed
        sell w = new sell();
        changeContent(w,w.code);
    }//GEN-LAST:event_sellMousePressed
    
    public static void changeContent(JPanel newContent, JTextField focus){
        hideAddPanel(false);
        hidePanelMenu(false);
        
        newContent.setSize(content.getSize().width,content.getSize().height);
             
        content.removeAll();
        content.add(newContent);
        content.repaint();
        content.revalidate();
        
        try{
            focus.requestFocusInWindow();
        }catch(Exception e){
            System.out.println("No se agrego un JTextField al cual enfocar");
        }
    }
    
    public void resizeContent(){
        try{
            content.getComponent(0).setSize(content.getSize().width,content.getSize().height);
            content.revalidate();
        }catch(Exception e){
            System.out.println("No se encontro un JPanel cargado: " + e);
        }
    }
    
    private static void hideAddPanel(boolean visible){
        panelAddVisible = visible;
        panelAdd.setVisible(panelAddVisible);
    }
    private static void hidePanelMenu(boolean visible){
        panelMenuVisible = visible;
        panelMenu.setVisible(panelMenuVisible);
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel cases;
    private javax.swing.JLabel changeInventory;
    private static javax.swing.JPanel content;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menuBtn;
    private javax.swing.JLabel mica;
    private static javax.swing.JPanel panelAdd;
    private static javax.swing.JPanel panelMenu;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel props;
    private javax.swing.JLabel sell;
    // End of variables declaration//GEN-END:variables
}
