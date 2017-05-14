package edu.about;

import edu.controller.ControllerListener;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author franciscodavid
 */
public class WindowAbout extends JDialog{
   
    private ControllerListener listener;
    private PanelButtonAbout panelAbout;
    private PanelInfoAbout panelInfoAbout;
    
    public WindowAbout(JFrame partner, ControllerListener listener){
        super (partner,true);
        this.setSize(400, 420);
        this.setResizable(false);
        this.listener = listener;
        this.setLocationRelativeTo(partner);
        this.setLayout(new BorderLayout());
        addPanelInfoAbout();
        addPanelAbout();
    }
    
    public void addPanelInfoAbout (){
        panelInfoAbout = new PanelInfoAbout();
        panelInfoAbout.setVisible(true);
        this.add(panelInfoAbout, BorderLayout.NORTH);
    }
    
    public void addPanelAbout (){
        panelAbout = new PanelButtonAbout(listener);
        panelAbout.setVisible(true);
        this.add(panelAbout, BorderLayout.SOUTH);
    }
    
}
