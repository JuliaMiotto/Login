import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String args[]){
        JFrame janela = new JFrame();
        janela.setTitle("Login");
        janela.setSize(300,425);
        janela.setResizable(false);
        janela.setLocation(500,100);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel tela = new JPanel();
        tela.setLayout(null);
        tela.setBackground(Color.black);
        janela.add(tela);

        JLabel titulo = new JLabel("REALIZE SEU LOGIN");
        titulo.setFont(new Font("Serif", Font.BOLD, 20));
        titulo.setForeground(Color.white);
        titulo.setSize(200,30);
        titulo.setLocation(43,125);
        tela.add(titulo);

        JLabel legendaLogin = new JLabel("Usuário");
        legendaLogin.setFont(new Font("Serif", Font.BOLD, 16));
        legendaLogin.setForeground(Color.white);
        legendaLogin.setSize(150,30);
        legendaLogin.setLocation(43,175);

        tela.add(legendaLogin);

        JTextField login = new JTextField(20);
        login.setSize(200,25);
        login.setLocation(43,200);
        login.setToolTipText("E-mail do usuário");

        tela.add(login);

        JLabel legendaSenha = new JLabel("Senha");
        legendaSenha.setFont(new Font("Serif", Font.BOLD, 16));
        legendaSenha.setForeground(Color.white);
        legendaSenha.setSize(150,30);
        legendaSenha.setLocation(43,225);
        tela.add(legendaSenha);

        JPasswordField senha = new JPasswordField(20);
        senha.setSize(200,25);
        senha.setLocation(43,250);
        senha.setToolTipText("Senha do usuário");
        tela.add(senha);

        JButton acesso = new JButton("Acessar");
        acesso.setSize(100,25);
        acesso.setLocation(94,310);
        acesso.setForeground(Color.white);
        acesso.setBackground(Color.black);
        tela.add(acesso);

        ImageIcon icon = new ImageIcon("assets/imgs/gandalf.gif");
        Image image = icon.getImage().getScaledInstance(300, 100,Image.SCALE_DEFAULT);
        JLabel gif = new JLabel(new ImageIcon(image));
        gif.setSize(290,100);
        gif.setLocation(0,0);
        tela.add(gif);

        acesso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
            }
        });


        janela.setVisible(true);

    }
}
