import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Medium1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area

    private int WIDTH=800;
    private int HEIGHT=700;


    public Medium1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium1 Medium1= new Medium1();
        Medium1.showEventDemo();
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
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,3)); //set the layout of the pannel

        mainFrame.add(controlPanel);



    }

    private void showEventDemo() {

        JButton button1 =new JButton("button 1");
        JButton button2 =new JButton("button 2");
        JButton button3 =new JButton("button 3");
        JButton button4 =new JButton("button 4");
        JButton button5 =new JButton("button 5");
        JLabel label1 = new JLabel("label1", JLabel.CENTER);
        JLabel label2 = new JLabel("label2", JLabel.CENTER);


        mainFrame.add(button1, BorderLayout.NORTH);
        controlPanel.add(button2);
        controlPanel.add(label1);
        mainFrame.add(button3, BorderLayout.SOUTH);
        controlPanel.add(button4);
        controlPanel.add(label2);
        controlPanel.add(button5);


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