package edu.about;

import javax.swing.JPanel;

/**
 *
 * @author franciscodavid
 */
public class PanelInfoAbout extends JPanel {

 
    public PanelInfoAbout() {
        initComponents();
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        JBuptc = new javax.swing.JButton();
        JBname = new javax.swing.JButton();
        JBteacher = new javax.swing.JButton();
        JBengineering = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setEnabled(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(400, 365));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uptc.jpg"))); // NOI18N
        jLabelIcon.setToolTipText("");

        JBuptc.setBackground(new java.awt.Color(0, 0, 0));
        JBuptc.setText("UNIVERSIDAD PEDAGÓGICA Y TECNOLÓGICA DE COLOMBIA");
        JBuptc.setEnabled(false);
        JBuptc.setFocusPainted(false);
        JBuptc.setVerifyInputWhenFocusTarget(false);

        JBname.setBackground(new java.awt.Color(0, 0, 0));
        JBname.setText("Realizado Por: FRANCISCO DAVID PARRA MEDINA");
        JBname.setEnabled(false);

        JBteacher.setBackground(new java.awt.Color(0, 0, 0));
        JBteacher.setText("Presentado al ING:");
        JBteacher.setEnabled(false);

        JBengineering.setBackground(new java.awt.Color(0, 0, 0));
        JBengineering.setText("INGENIRÍA DE SISTEMAS Y COMPUTACIÓN");
        JBengineering.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBuptc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(JBname, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBteacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBengineering, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBuptc, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelIcon)
                .addGap(18, 18, 18)
                .addComponent(JBteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBengineering, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBengineering;
    private javax.swing.JButton JBname;
    private javax.swing.JButton JBteacher;
    private javax.swing.JButton JBuptc;
    private javax.swing.JLabel jLabelIcon;
    // End of variables declaration//GEN-END:variables
}
