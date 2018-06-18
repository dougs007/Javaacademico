package ExercicioPratico;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CopyInvert {

    JFrame tela;
    JPanel painel;
    JTextArea campo1;
    JTextArea campo2;
    JButton invert;
    JButton copy;

    String text;
    String text2;

    CopyInvert() {

        tela = new JFrame("Copy&Invert");
        tela.setSize(500, 400);

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(50, 50, 450, 450);
        painel.setBackground(Color.RED);
        tela.add(painel);
        campo1 = new JTextArea(10, 50);
        campo2 = new JTextArea(10, 50);

        copy = new JButton("Copy");
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                text = new String(campo1.getText());
                campo2.setText(text);
            }
        });
        invert = new JButton("Invert");
        invert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                text2 = new String(campo2.getText());
                StringBuilder text01 = new StringBuilder();
                text01.append(text2);
                text01.reverse();
                campo2.setText(String.valueOf(text01));
            }
        });

        // Define tamanho dos campos.
        campo1.setBounds(60, 10, 410, 130);
        campo2.setBounds(70, 250, 410, 100);
        copy.setBounds(70, 160, 100, 30);
        invert.setBounds(/*x*/150,/*y*/ 160,/*z*/ 100,/*i*/ 30);

        // Adiciona os campos ao painel.
        painel.add(campo1);
        painel.add(campo2);
        painel.add(copy);
        painel.add(invert);

        // Deixando a tela visível
        tela.setVisible(true);
    }

    public static void main(String[] args) {
        new CopyInvert();
    }
}
