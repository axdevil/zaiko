/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author jorge
 */
public class inventory extends javax.swing.JPanel {

    /**
     * Creates new form inventory
     */
    public inventory() {
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

        tabbedPane = new javax.swing.JTabbedPane();
        casePanel = new javax.swing.JPanel();
        caseTableScroll = new javax.swing.JScrollPane();
        caseTable = new javax.swing.JTable();
        micaPanel = new javax.swing.JPanel();
        propPanel = new javax.swing.JPanel();
        phonePanel = new javax.swing.JPanel();

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        caseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        caseTableScroll.setViewportView(caseTable);

        javax.swing.GroupLayout casePanelLayout = new javax.swing.GroupLayout(casePanel);
        casePanel.setLayout(casePanelLayout);
        casePanelLayout.setHorizontalGroup(
            casePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, casePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caseTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
        );
        casePanelLayout.setVerticalGroup(
            casePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(caseTableScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Protectores", casePanel);

        javax.swing.GroupLayout micaPanelLayout = new javax.swing.GroupLayout(micaPanel);
        micaPanel.setLayout(micaPanelLayout);
        micaPanelLayout.setHorizontalGroup(
            micaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        micaPanelLayout.setVerticalGroup(
            micaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Micas", micaPanel);

        javax.swing.GroupLayout propPanelLayout = new javax.swing.GroupLayout(propPanel);
        propPanel.setLayout(propPanelLayout);
        propPanelLayout.setHorizontalGroup(
            propPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        propPanelLayout.setVerticalGroup(
            propPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Accesorios", propPanel);

        javax.swing.GroupLayout phonePanelLayout = new javax.swing.GroupLayout(phonePanel);
        phonePanel.setLayout(phonePanelLayout);
        phonePanelLayout.setHorizontalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        phonePanelLayout.setVerticalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Telefonos", phonePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel casePanel;
    private javax.swing.JTable caseTable;
    private javax.swing.JScrollPane caseTableScroll;
    private javax.swing.JPanel micaPanel;
    private javax.swing.JPanel phonePanel;
    private javax.swing.JPanel propPanel;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
