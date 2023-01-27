package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener.*;

public class frmNivelUsuarios extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfNivel;
    JLabel lbWelcome;

    public void initialize(){
        //Form Panel

        JLabel lbNivel = new JLabel("Nivel :");
        lbNivel.setFont(mainFont);

        tfNivel = new JTextField();
        tfNivel.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbNivel);
        formPanel.add(tfNivel);

        //Welcome Label
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        //Buttons Panel
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nivel = tfNivel.getText();
                lbWelcome.setText("" + nivel + " ");
            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfNivel.setText("");
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

        setTitle("CRUD - Nivel Usuario");
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
    

