import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Leah_bad_idea implements ActionListener {
    private JFrame mainFrame;
    private JPanel Panel1;
    private JPanel Panel2;
    private JPanel Panel3;
    private JPanel Panel4;
    private JPanel Panel5;
    private JPanel Panel6;
    private JPanel Panel7;
    private JPanel Panel8;
    private JPanel Panel9;
    private JPanel Panel10;
    private JPanel Panel11;
    private JPanel Panel12;

    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area

    private int WIDTH=800;
    private int HEIGHT=700;


    public Leah_bad_idea() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Leah_bad_idea Leah_bad_idea= new Leah_bad_idea();
        Leah_bad_idea.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("I am NOT getting carried");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2,1));

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
        Panel1 = new JPanel();
        Panel1.setLayout(new BorderLayout());

        Panel2 = new JPanel();
        Panel2.setLayout(new GridLayout(1,5));

        Panel3 = new JPanel();
        Panel3.setLayout(new GridLayout(1,11));

        Panel4 = new JPanel();
        Panel4.setLayout(new GridLayout(1,4));

        Panel5 = new JPanel();
        Panel5.setLayout(new BorderLayout());

        Panel6 = new JPanel();
        Panel6.setLayout(new GridLayout(2,1));

        Panel7 = new JPanel();
        Panel7.setLayout(new GridLayout(1,2));

        Panel8 = new JPanel();
        Panel8.setLayout(new BorderLayout());

        Panel9 = new JPanel();
        Panel9.setLayout(new BorderLayout());

        Panel10 = new JPanel();
        Panel10.setLayout(new GridLayout(1,1));

        Panel11 = new JPanel();
        Panel11.setLayout(new BorderLayout());

        Panel12 = new JPanel();
        Panel12.setLayout(new BorderLayout());

    }

    private void showEventDemo() {
        JLabel label1 = new JLabel("hello", JLabel.CENTER);
        JLabel label2 = new JLabel("hi", JLabel.CENTER);
        JLabel label3 = new JLabel("bonjur", JLabel.CENTER);
        JLabel label4 = new JLabel("hello", JLabel.CENTER);
        JLabel label5 = new JLabel("hiii", JLabel.CENTER);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("1");
        JButton button3 = new JButton("1");
        JButton button4 = new JButton("1");
        JButton button5 = new JButton("1");
        JButton button6 = new JButton("1");
        JLabel topLabel1 = new JLabel("0", JLabel.CENTER);
        JLabel topLabel2 = new JLabel("0", JLabel.CENTER);
        JLabel topLabel3 = new JLabel("0", JLabel.CENTER);
        JLabel topLabel4 = new JLabel("0", JLabel.CENTER);
        JLabel topLabel5 = new JLabel("0", JLabel.CENTER);

        JButton quad1side = new JButton("");
        JButton quad1top = new JButton("hi");
        JButton quad1bottom = new JButton("lol");

        JButton quad2button1 = new JButton("");
        JButton quad2button2 = new JButton("");
        JButton quad2button3 = new JButton("");
        JButton quad2button4 = new JButton("");
        JLabel quad2label1 = new JLabel("1", JLabel.CENTER);
        JLabel quad2label2 = new JLabel("2", JLabel.CENTER);

        JButton quad4button1 = new JButton("");
        JButton quad4button2 = new JButton("");
        JButton quad4button3 = new JButton("");
        JButton quad4button4 = new JButton("");
        JButton quad4button5 = new JButton("");
        JButton quad4button6 = new JButton("");
        JButton quad4button7 = new JButton("");
        JButton quad4button8 = new JButton("");



        mainFrame.add(Panel1);
        mainFrame.add(Panel2);
        Panel1.add(Panel3, BorderLayout.NORTH);
        Panel1.add(Panel4, BorderLayout.CENTER);
        Panel4.add(Panel5);

        Panel5.add(Panel6, BorderLayout.CENTER);
        Panel4.add(Panel7);
        Panel7.add(Panel8);
        Panel7.add(Panel9);
        Panel4.add(Panel10);
        Panel4.add(Panel11);
        Panel11.add(Panel12, BorderLayout.CENTER);

        Panel2.add(label1);
        Panel2.add(label2);
        Panel2.add(label3);
        Panel2.add(label4);
        Panel2.add(label5);

        Panel3.add(button1);
        Panel3.add(topLabel1);
        Panel3.add(button2);
        Panel3.add(button3);
        Panel3.add(topLabel2);
        Panel3.add(button4);
        Panel3.add(button5);
        Panel3.add(button6);
        Panel3.add(topLabel3);
        Panel3.add(topLabel4);
        Panel3.add(topLabel5);
        Panel5.add(quad1side, BorderLayout.WEST);
        Panel6.add(quad1top);
        Panel6.add(quad1bottom);
        Panel8.add(quad2button1, BorderLayout.NORTH);
        Panel8.add(quad2label1, BorderLayout.CENTER);
        Panel8.add(quad2button2, BorderLayout.SOUTH);
        Panel9.add(quad2button3, BorderLayout.EAST);
        Panel9.add(quad2button4, BorderLayout.WEST);
        Panel9.add(quad2label2, BorderLayout.CENTER);
        Panel11.add(quad4button1, BorderLayout.NORTH);
        Panel11.add(quad4button2, BorderLayout.EAST);
        Panel11.add(quad4button3, BorderLayout.SOUTH);
        Panel11.add(quad4button4, BorderLayout.WEST);
        Panel12.add(quad4button5, BorderLayout.NORTH);
        Panel12.add(quad4button6, BorderLayout.EAST);
        Panel12.add(quad4button7, BorderLayout.SOUTH);
        Panel12.add(quad4button8, BorderLayout.WEST);


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