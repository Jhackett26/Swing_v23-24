import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Easy2 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Easy2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy2 Easy2= new Easy2();
        Easy2.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("John learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        //end menu at top


        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });



    }

    private void showEventDemo() {

        JButton button1 =new JButton("button 1");
        JButton button2 =new JButton("button 2");
        JButton button3 =new JButton("button 3");
        JButton button4 =new JButton("button 4");
        JButton button5 =new JButton("button 5");

        button1.setActionCommand("button 1");
        button2.setActionCommand("button 2");
        button3.setActionCommand("button 3");
        button4.setActionCommand("button 4");
        button5.setActionCommand("button 5");

        mainFrame.add(button1, BorderLayout.NORTH);
        mainFrame.add(button2, BorderLayout.EAST);
        mainFrame.add(button3, BorderLayout.SOUTH);
        mainFrame.add(button4, BorderLayout.WEST);
        mainFrame.add(button5, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }
}