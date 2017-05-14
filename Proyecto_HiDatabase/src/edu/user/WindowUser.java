package edu.user;

import edu.controller.Constants;
import edu.controller.ControllerListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author franciscodavid
 */
public class WindowUser extends JDialog {

    private ControllerListener listener;
    

    public WindowUser(JFrame partner, ControllerListener ln) {
        super(partner, true);
        this.listener = ln;
        initComponents();
        buttonConection();
    }

    public boolean validations() {
        if (jtfNameUser.getText().isEmpty() || jtfPassword.getPassword().length==0) {
            return false;
        }
        return true;
    }
    
    public void buttonConection(){
        jbuttonConnection.addActionListener(listener);
        jbuttonConnection.setActionCommand(Constants.BUTTON_LOGIN_USER);
    }

    public JTextField getJtfNameUser() {
        return jtfNameUser;
    }

    public JPasswordField getJtfPassword() {
        return jtfPassword;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNameUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbuttonConnection = new javax.swing.JButton();
        jtfPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 80, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Usuario Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, 30));

        jtfNameUser.setPreferredSize(new java.awt.Dimension(7, 20));
        jtfNameUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNameUserKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 20, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLogin.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 196, 30, -1));

        jbuttonConnection.setText("Iniciar Sesión");
        getContentPane().add(jbuttonConnection, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));
        getContentPane().add(jtfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, -1));

        jLabel6.setText("Nombre Usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, -1));

        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoUser.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNameUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNameUserKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNameUserKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbuttonConnection;
    private javax.swing.JTextField jtfNameUser;
    private javax.swing.JPasswordField jtfPassword;
    // End of variables declaration//GEN-END:variables
}
