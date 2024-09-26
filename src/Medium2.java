import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Medium2 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel controlPanel2;
    private JPanel controlPanel3;
    private JPanel controlPanel4;
    private JTextArea controlPanel5;
    private JTextArea controlPanel6;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area

    private int WIDTH=800;
    private int HEIGHT=700;


    public Medium2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium2 Medium2= new Medium2();
        Medium2.showEventDemo();
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



        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout());

        controlPanel2 = new JPanel();
        controlPanel2.setLayout(new GridLayout(2,2));

        controlPanel3 = new JPanel();
        controlPanel3.setLayout(new GridLayout(3,3));

        controlPanel4 = new JPanel();
        controlPanel4.setLayout(new GridLayout(2,1));

        controlPanel5 = new JTextArea();
        controlPanel5.setBounds(50, 5, WIDTH-100, HEIGHT-50);

        controlPanel6 = new JTextArea();
        controlPanel6.setBounds(50, 5, WIDTH-100, HEIGHT-50);


    }

    private void showEventDemo() {

        JLabel label1 = new JLabel("0", JLabel.CENTER);
        JLabel label2 = new JLabel("0", JLabel.CENTER);
        JLabel label3 = new JLabel("0", JLabel.CENTER);
        JLabel label4 = new JLabel("0", JLabel.CENTER);
        JLabel label5 = new JLabel("0", JLabel.CENTER);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        JLabel topLabel1 = new JLabel("Top 0", JLabel.CENTER);
        JLabel topLabel2 = new JLabel("Top 0", JLabel.CENTER);
        JLabel topLabel3 = new JLabel("Top 0", JLabel.CENTER);
        JLabel topLabel4 = new JLabel("Top 0", JLabel.CENTER);
        JLabel topLabel5 = new JLabel("Top 0", JLabel.CENTER);
        JButton topButton1 = new JButton("Top 1");
        JButton topButton2 = new JButton("Top 2");
        JButton topButton3 = new JButton("Top 3");
        JButton topButton4 = new JButton("Top 4");

        JLabel topRightLabel = new JLabel("Top Right", JLabel.CENTER);
        JButton topRightButton = new JButton("1");



        mainFrame.add(controlPanel, BorderLayout.SOUTH);
        mainFrame.add(controlPanel2, BorderLayout.CENTER);
        controlPanel2.add(controlPanel3);
        controlPanel2.add(controlPanel4);
        controlPanel2.add(controlPanel5);
        controlPanel2.add(controlPanel6);

        controlPanel.add(label1);
        controlPanel.add(button1);
        controlPanel.add(label2);
        controlPanel.add(button2);
        controlPanel.add(label3);
        controlPanel.add(button3);
        controlPanel.add(label4);
        controlPanel.add(button4);
        controlPanel.add(label5);

        controlPanel3.add(topLabel1);
        controlPanel3.add(topButton1);
        controlPanel3.add(topLabel2);
        controlPanel3.add(topButton2);
        controlPanel3.add(topLabel3);
        controlPanel3.add(topButton3);
        controlPanel3.add(topLabel4);
        controlPanel3.add(topButton4);
        controlPanel3.add(topLabel5);

        controlPanel4.add(topRightLabel);
        controlPanel4.add(topRightButton);


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