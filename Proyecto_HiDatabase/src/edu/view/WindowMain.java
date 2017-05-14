package edu.view;

import edu.controller.Constants;
import edu.controller.ControllerListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class WindowMain extends JFrame {

    private ControllerListener listener;
    private JMenuBar jMenuBar;
    private JMenu JMfile;
    private JMenuItem JMIexit;
    private JMenu JMoptions;
    private JMenuItem JMIDesigQuestion;
    private JMenu JMabout;
    private JMenuItem JMIabout;

    public WindowMain(ControllerListener listener) {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.listener = listener;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initializeComponent();
    }

    public void initializeComponent() {
        addMenu();
    }

    public void addMenu() {
        this.jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);
        addJMfile();
        addJMIExit();
        addJMOptions();
        addJMIQuestion();
        addJMAbout();
        addJMIabout();
    }

    public void addJMfile() {
        this.JMfile = new JMenu("Archivo");
        this.jMenuBar.add(JMfile);
    }

    public void addJMIExit() {
        this.JMIexit = new JMenuItem("Salir");
        JMIexit.addActionListener(listener);
        JMIexit.setActionCommand(Constants.OP_EXIT);
        this.JMfile.add(JMIexit);
    }

    public void addJMOptions() {
        this.JMoptions = new JMenu("Opciones");
        this.jMenuBar.add(JMoptions);
    }
    
    public void addJMIQuestion() {
        this.JMIDesigQuestion= new JMenuItem("Diseñar_Cuestionario");
        this.JMoptions.add(JMIDesigQuestion);
    }

    public void addJMAbout() {
        this.JMabout = new JMenu("Acerca De");
        this.jMenuBar.add(JMabout);
    }

    public void addJMIabout() {
        this.JMIabout = new JMenuItem("Créditos");
        JMIabout.addActionListener(listener);
        JMIabout.setActionCommand(Constants.OP_ABOUT);
        this.JMabout.add(JMIabout);

    }

}
