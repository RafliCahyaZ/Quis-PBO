package pkg123230214_ifc_kuis;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
        

public class Main {

    
    public static void main(String[] args) {
        // Menjalankan Tampilan Login
        loginScreen();
    }
    
    public static void loginScreen(){
        //Frame Login
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setSize(300, 200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Panel input username dan Password
        
       JPanel panel = new JPanel();
       loginFrame.add(panel);
       placeLoginComponents(panel);
       
       //Menampilkan Frame
       loginFrame.setVisible(true);
    }
    
    private static void placeLoginComponents(JPanel panel) {
        panel.setLayout(null);
        
        //label Username 
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 80, 25);
        panel.add(userText);
        
        //Label Password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 60, 80, 25);
        panel.add(passwordLabel);
        
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 60, 80, 25);
        panel.add(passwordField);
        
        //Tombol Login
        JButton loginButton = new JButton("Masuk");
        loginButton.setBounds(100, 100, 80, 25);
        panel.add(loginButton);
       
        
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            String username = userText.getText();
            String password = new String(passwordField.getPassword());
            
            //Cek Username dan Password
            if (username.equals("Rafli")&&password.equals("214")){
                // Menutup Frame Login dan Membuka Game Batu-Kertas-Gunting
                JOptionPane.showMessageDialog(panel,"Login Berhasil");
                gameScreen();
                //menutup frame login
                loginFrame.dispose(); 
            } else {
                JOptionPane.showMessageDialog(panel, "Coba di inget Lagi username sama passwordnya", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
            });
        }
    //Tampilan Game
    private static void gameScreen(){
        //Frame Login
        JFrame gameFrame = new JFrame("Game Batu-Gunting-Kertas");
        gameFrame.setSize(300, 200);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Panel input username dan Password
        
       JPanel panel = new JPanel();
       gameFrame.add(panel);
       placeGameComponents(panel);
       
       //Menampilkan Frame
       gameFrame.setVisible(true);
    }
    
    private static void placeGameComponents(JPanel panel){
        panel.setLayout(null);
        //label Player 1
        JLabel playerLabel = new JLabel("Player 1");
        playerLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        JTextField playerText = new JTextField(20);
        playerText.setBounds(100, 20, 80, 25);
        panel.add(userText);
    }
    
    
}

   
