package Assignment1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridBagLayout;

import javax.swing.JFileChooser;
import java.io.File;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class SimpleMenuEx extends JFrame {
	
    JLabel label1 = new JLabel("Status1");
    JFrame frame = new JFrame("Simple Menu");
    //Container skeleton = frame.getContentPane();
    public SimpleMenuEx() {
        add(label1,BorderLayout.PAGE_END);
        initUI();
    }
    
    public static void main(String[] args) {

        //EventQueue.invokeLater(() -> {
            SimpleMenuEx ex = new SimpleMenuEx();
            ex.setVisible(true);
            
       // });
    }

    private void initUI() {
        //GUI initialization
        JLabel label1 = new JLabel("Status1");
        JFrame frame = new JFrame("Simple Menu");
        //Container skeleton = frame.getContentPane();
        createMenuBar(frame.getContentPane());
        createToolBar();
        setTitle("Simple menu");
        setSize(860, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createStatusLabel(){
    	 
        //Create JLabel

        
        
    }
    private void createMenuBar(Container contain) {

        JMenuBar menubar = new JMenuBar();



        menubar.add(createMenuFile());
        menubar.add(createMenuView());
        
        contain.add(menubar);
        setJMenuBar(menubar);
    }
    
    private JMenu createMenuView(){

    	
    	
    	
        JMenu view = new JMenu("View");
        view.setMnemonic(KeyEvent.VK_V);
        
        
        JRadioButtonMenuItem viewMenu1 = new JRadioButtonMenuItem("Photo viewer");
        JRadioButtonMenuItem viewMenu2 = new JRadioButtonMenuItem("Browser");
        JRadioButtonMenuItem viewMenu3 = new JRadioButtonMenuItem("Split Mode");
        
        view.add(viewMenu1);
        view.add(viewMenu2);
        view.add(viewMenu3);

       
    	
        viewMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				setLabelStatus(label1,"Photo viewer");
			}
		});
        
        viewMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				setLabelStatus(label1,"Browser");
			}
		});
        
        viewMenu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				setLabelStatus(label1,"Split Mode");
			}
		});
    	
    	return view;
    }
    
    private void setLabelStatus(JLabel label, String status){
    	label.setText(status);
    	
    }
    
    private JMenu createMenuFile(){
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
    	
        ImageIcon icon = new ImageIcon("exit.png");
        JMenuItem fileMenu1 = new JMenuItem("Import", icon);
        JMenuItem fileMenu2 = new JMenuItem("Delete", icon);
        JMenuItem fileMenu3 = new JMenuItem("Quit", icon);
        
		fileMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
		        JFileChooser viewFileChooser = new JFileChooser();
		        viewFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		        int result = viewFileChooser.showOpenDialog(fileMenu2);//what does this actually do?
		        if (result == JFileChooser.APPROVE_OPTION) {
		            // user selects a file
		        }
		        File selectedFile = viewFileChooser.getSelectedFile();
			}
		});
		
        //Set Keys for menuitems
        
        fileMenu1.setMnemonic(KeyEvent.VK_I);
        fileMenu2.setMnemonic(KeyEvent.VK_D);
        fileMenu3.setMnemonic(KeyEvent.VK_Q);
        fileMenu3.setToolTipText("Exit application");
        fileMenu3.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        
        //Add menuitems to menu
        file.add(fileMenu1);
        file.add(fileMenu2);
        file.add(fileMenu3);
        return file;
    }
    
    private void createMainPanel(Container contain){
        //Create JPanel
        
        JPanel panel1 = new JPanel();
        //panel1.setLayout(new GridBagLayout());
        add(panel1,BorderLayout.CENTER);
        JButton mainscreen = new JButton("Main Screen");
        panel1.add(mainscreen);
        contain.add(panel1);
        contain.add(mainscreen,BorderLayout.CENTER);

    	
    }
    
    private void createToolBar(){
    	
        JPanel panel2 = new JPanel();
        add(panel2,BorderLayout.NORTH);
        
        JLabel toolBarLabel = new JLabel("Filter by Category:");
        
        //Create Toolbar
        JToolBar toolbar = new JToolBar();
        //toolbar.setRollover(true);
        
        toolbar.add(toolBarLabel);
        
        JToggleButton JTbutton1 = new JToggleButton("Family");
        JToggleButton JTbutton2 = new JToggleButton("Vacation");
        JToggleButton JTbutton3 = new JToggleButton("School");
        
        JTbutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				setLabelStatus(label1,"Filtering by Family");
			}
		});
        
        JTbutton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				setLabelStatus(label1,"Filtering by Vacation");
			}
		});
        
        JTbutton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				setLabelStatus(label1,"Filtering by School");
			}
		});
        
        toolbar.add(JTbutton1);
        toolbar.add(JTbutton2);
        toolbar.add(JTbutton3);
        
        //toolbar.addSeparator();
//        JComboBox JCbox = new JComboBox(new String[]{"Family","Vacation","School"});
//        
//        toolbar.add(JCbox);
        
//        JCbox.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e){
//				setLabelStatus(label1,"Browser");
//			}
//		});
//        

        
        panel2.add(toolbar,BorderLayout.NORTH);
    	
    }
    
    


    
    
    
    
    
}