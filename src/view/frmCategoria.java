package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener.*;

/*  public class frmCategoria extends JFrame {

    private static JLabel directionsLabel = new JLabel("Enter your name in the box");
    private static JLabel outputLabel = new JLabel();
    private static JTextField nameBox = new JTextField(25);
    private static JButton nameButton = new JButton("Click me");
    public static void main(String[] args) throws Exception{
        frmCategoria window = new frmCategoria();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("My Frame");
       

        window.setLayout(new FlowLayout());
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(nameBox);
        window.getContentPane().add(nameButton);
        window.getContentPane().add(outputLabel);

        //add an action listener
        nameButton.addActionListener(new actionListener(){
            public void actionPerfomed(ActionEvent e){
                buttonClick(e);

            }
        });

        //window.pack();


        //add Swing objects here



         //add Swing objects here
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    }
    public static void buttonClick(ActionEvent e){
        //put code in here to respond to the button
        JOptionPane.showMessageDialog(null, "Button Works !!", "Hi!", JOptionPane.INFORMATION_MESSAGE);
    }
      
}
*/

public class frmCategoria extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfDescricao;
    JLabel lbWelcome;

    public void initialize(){
        //JLabel lbFirstName = new JLabel("First Name");
        //Form Panel

        JLabel lbDescricao = new JLabel("Descrição :");
        lbDescricao.setFont(mainFont);

        tfDescricao = new JTextField();
        tfDescricao.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbDescricao);
        formPanel.add(tfDescricao);

        //Welcome Label
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        //Buttons Panel
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String descricao = tfDescricao.getText();
                lbWelcome.setText("Hello" + descricao + " ");
            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfDescricao.setText("");
                lbWelcome.setText("");
                
            }
            
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(233, 150, 122));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("CRUD - Categoria");
        setSize(500, 600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args){
        frmCategoria myFrame = new frmCategoria();
        myFrame.initialize();
    }
}