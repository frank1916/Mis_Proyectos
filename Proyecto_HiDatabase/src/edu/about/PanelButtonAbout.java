package edu.about;

import edu.controller.ControllerListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import edu.controller.Constants;
import java.awt.BorderLayout;

/**
 *
 * @author franciscodavid
 */
public class PanelButtonAbout extends JPanel {

    private ControllerListener listener;
    private JButton jButtonExit;

    public PanelButtonAbout(ControllerListener listener) {
        this.listener = listener;
        this.setLayout(new BorderLayout());
        addJButtonExit();
    }

    public void addJButtonExit() {
        jButtonExit = new JButton("Salir");
        jButtonExit.addActionListener(listener);
        jButtonExit.setActionCommand(Constants.BUTTON_EXIT_ABOUT);
        this.add(jButtonExit, BorderLayout.SOUTH);
    }

}
