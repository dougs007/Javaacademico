package ExercicioPratico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Carros {

    JFrame tela;
    JPanel painelCima;
    JPanel painelBaixo;
    ImageIcon img1, img2, img3, img4, img5;
    ImageIcon img01, img02, img03, img04, img05;
    JButton bt1, bt2, bt3, bt4, bt5;

    JLabel labelunico;
    JLabel texto;

    Carros() {
        painelBaixo = new JPanel();
        labelunico = new JLabel();
        texto = new JLabel();
        img1 = new ImageIcon("src/Imagens/imagem1.jpg");
        img01 = new ImageIcon("src/Imagens/imagem1.jpg");
        img1.setImage(img1.getImage().getScaledInstance(50, 50, 100));
        bt1 = new JButton(img1);
        bt1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                labelunico.setIcon(new ImageIcon(img01.getImage().getScaledInstance(500, 250, Image.SCALE_AREA_AVERAGING)));
                texto.setText("<html> 1 - Gol, Volkswagen <br> Vendas em dezembro: 27.547 <br> Vendas em outubro: 27.737<br>Crescimento: -7,7%<br>Total vendido no ano: 300.000 </html>");
            }
        });

        img2 = new ImageIcon("src/Imagens/imagem2.jpg");
        img02 = new ImageIcon("src/Imagens/imagem2.jpg");
        img2.setImage(img2.getImage().getScaledInstance(50, 50, 100));
        bt2 = new JButton(img2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                labelunico.setIcon(new ImageIcon(img02.getImage().getScaledInstance(500, 250, Image.SCALE_AREA_AVERAGING)));
                texto.setText("<html> 2 - Uno, da Fiat<br>Vendas em novembro: 18.611<br>Vendas em outubro: 21.370<br>Crescimento: -12,9%<br>Total vendido no ano: 237.581</html>");
            }
        });

        img3 = new ImageIcon("src/Imagens/imagem3.jpg");
        img03 = new ImageIcon("src/Imagens/imagem3.jpg");
        img3.setImage(img3.getImage().getScaledInstance(50, 50, 100));
        bt3 = new JButton(img3);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                labelunico.setIcon(new ImageIcon(img03.getImage().getScaledInstance(500, 250, Image.SCALE_AREA_AVERAGING)));
                texto.setText("<html> 3 - Palio, da Fiat<br>Vendas em novembro: 17.268<br>Vendas em outubro: 18.824<br>Crescimento: -8,2%<br>Total vendido no ano: 167.955</html>");
            }
        });

        img4 = new ImageIcon("src/Imagens/imagem4.jpg");
        img04 = new ImageIcon("src/Imagens/imagem4.jpg");
        img4.setImage(img4.getImage().getScaledInstance(50, 50, 100));
        bt4 = new JButton(img4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                labelunico.setIcon(new ImageIcon(img04.getImage().getScaledInstance(500, 250, Image.SCALE_AREA_AVERAGING)));
                texto.setText("<html> 4 - Fox/CrossFox, da Volkswagen<br>Vendas em novembro: 11.676<br>Vendas em outubro: 14.601<br>Crescimento: -20%<br>Total vendido no ano: 154.104</html>");
            }
        });

        img5 = new ImageIcon("src/Imagens/imagem5.jpg");
        img05 = new ImageIcon("src/Imagens/imagem5.jpg");
        img5.setImage(img5.getImage().getScaledInstance(50, 50, 100));
        bt5 = new JButton(img5);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                labelunico.setIcon(new ImageIcon(img05.getImage().getScaledInstance(500, 250, Image.SCALE_AREA_AVERAGING)));
                texto.setText("<html> 5 - Siena, da Fiat<br>Vendas em novembro: 11.606<br>Vendas em outubro: 12.512<br>Crescimento: -7,2%<br>Total vendido no ano: 91.611</html>");
            }
        });

        tela = new JFrame("Imagens");
        tela.setSize(500, 500);
        tela.setVisible(true);

        painelCima = new JPanel();
        painelCima.setLayout(new FlowLayout());
        painelCima.setBackground(Color.BLUE);

        painelCima.add(bt1);
        painelCima.add(bt2);
        painelCima.add(bt3);
        painelCima.add(bt4);
        painelCima.add(bt5);
        painelBaixo.add(labelunico);
        painelBaixo.add(texto);
        tela.add(painelCima);
        tela.add(painelBaixo);
        tela.setLayout(new BorderLayout());
        tela.add(painelCima, BorderLayout.NORTH);
        tela.add(painelBaixo, BorderLayout.CENTER);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Carros();
    }
}
