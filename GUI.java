import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  implements ActionListener {

    private static JLabel  userlabel ;
    private static JTextField userText;
    private static JLabel passwordLebel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

       passwordLebel = new JLabel("Password");
        passwordLebel.setBounds(10,50,80,25);
        panel.add(passwordLebel);

       passText = new JPasswordField();
       passText.setBounds(100,50,165,20);
       panel.add(passText);

        button = new JButton("Login");
       button.setBounds(50,80,80,25);
       button.addActionListener(new GUI());
       panel.add(button);

       success = new JLabel();
       success.setBounds(10,110,300,25);
       panel.add(success);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String user = userText.getText();
        String password = passText.getText();
        System.out.println(user + " " + password);
        if(user.equals("Danish") && password.equals("danishbelal")){
            success.setText("Login successful!");
        }
    }
}
