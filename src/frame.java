import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 

public class frame extends JFrame implements ActionListener {

    private JButton start;
    private JButton info;
    private JButton ende;
    
    public static void main(String[] args) {
        
        frame frame = new frame ("Menue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLocationRelativeTo (null);
        frame.setLayout (null);
        frame.setVisible(true);
        
    }
    
    public frame (String title) {
        super(title);
        
        start = new JButton("Spiel Starten");
        start.setBounds (120,40,160,40);
        start.addActionListener(this);
        add(start);
        
        info = new JButton("Info");
        info.setBounds(120,100,160,40);
        info.addActionListener(this);
        add(info);
        
        ende = new JButton("Ende");
        ende.setBounds(120, 160, 160, 40);
        ende.addActionListener(this);
        add(ende);
        
    }
    
    public static void fenster () {
        JFrame fenster = new JFrame();
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(650,350);
        fenster.setVisible(true); {
    }
 
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== start ) {
            fenster();
        }
        
        if (e.getSource()== info) {
            Object[] options = { "OK"};
            
            JOptionPane.showOptionDialog(null, "Infos kommen noch!","Credits",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
        }
        
        if (e.getSource() == ende ) {
            System.exit(0);
        }
        
    }
    
}
