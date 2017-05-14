package edu.controller;

import edu.about.WindowAbout;
import edu.user.WindowUser;
import edu.view.WindowMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import persistence.ConnectionBD;

/**
 * @author franciscodavid
 */
public class ControllerListener implements ActionListener {

    private WindowMain windowMain = null;
    private WindowAbout windowAbout = null;
    private WindowUser windowUser = null;
    private ConnectionBD connectionBD;

    public ControllerListener() {
        this.connectionBD = new ConnectionBD();
    }

    /**
     * abrir dialogos.....
     */
    public void openWindowAbout() {
        if (windowAbout == null) {
            windowAbout = new WindowAbout(windowMain, this);
        }
        windowAbout.setVisible(true);

    }

    public void openWindowMain() {
        if (windowMain == null) {
            windowMain = new WindowMain(this);
        }
        windowMain.setVisible(true);
    }

    public void openWindowUser() {
        if (windowUser == null) {
            windowUser = new WindowUser(windowMain, this);
        }
        windowUser.setVisible(true);
    }

    /**
     * cerrar dialogos...
     */
    public void exitAbout() {
        windowAbout.dispose();
    }

    /**
     * metodos de usuario..
     */
    public void loginUser() {
        if (windowUser.validations()) {
            if (connectionBD.identifyUser(windowUser.getJtfNameUser().getText(),windowUser.getJtfPassword().getPassword())) {
                System.out.println("autenticado");
            } else {
                JOptionPane.showMessageDialog(windowUser, "Usuario_o_contraseña_incorrecta", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                windowUser.getJtfNameUser().setText("");
                windowUser.getJtfPassword().setText("");

            }
        } else {
            JOptionPane.showMessageDialog(windowUser, "Debe completar Campos", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * eventos botones...
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            //salir..
            case Constants.OP_EXIT:
                System.exit(0);
                break;
            case Constants.OP_ABOUT:
                openWindowAbout();
                break;
            case Constants.BUTTON_EXIT_ABOUT:
                exitAbout();
                break;
            //Usuario..
            case Constants.BUTTON_LOGIN_USER:
                loginUser();

                break;

            default:
                break;

        }

    }

}
