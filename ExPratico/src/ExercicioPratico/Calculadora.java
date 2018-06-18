package ExercicioPratico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculadora {

    JFrame tela;
    JPanel painel;
    JTextArea result;
    JButton menos, mais, vezes, um, dois, tres, quatro, cinco, seis, sete, oito, nove, zero, igual, limpar;

    Calculadora() {
        tela = new JFrame("Calculadora");
        tela.setSize(300, 395);
        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(Color.BLUE);
        tela.add(painel);

        result = new JTextArea(5, 25);
        result.setBounds(0, 0, 284, 100);
        mais = new JButton("+");
        mais.setBounds(2, 101, 93, 50);
        mais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = result.getText();
                result.setText(valor + "+");
            }
        });
        menos = new JButton("-");
        menos.setBounds(95, 101, 93, 50);
        menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "-");
            }
        });
        vezes = new JButton("*");
        vezes.setBounds(188, 101, 93, 50);
        vezes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "*");
            }
        });
        um = new JButton("1");
        um.setBounds(2, 152, 93, 50);
        um.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "1");
            }
        });
        dois = new JButton("2");
        dois.setBounds(95, 152, 93, 50);
        dois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "2");
            }
        });
        tres = new JButton("3");
        tres.setBounds(188, 152, 93, 50);
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "3");
            }
        });
        quatro = new JButton("4");
        quatro.setBounds(2, 203, 93, 50);
        quatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "4");
            }
        });
        cinco = new JButton("5");
        cinco.setBounds(95, 203, 93, 50);
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "5");
            }
        });
        seis = new JButton("6");
        seis.setBounds(188, 203, 93, 50);
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "6");
            }
        });
        sete = new JButton("7");
        sete.setBounds(2, 254, 93, 50);
        sete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "7");
            }
        });
        oito = new JButton("8");
        oito.setBounds(95, 254, 93, 50);
        oito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "8");
            }
        });
        nove = new JButton("9");
        nove.setBounds(188, 254, 93, 50);
        nove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "9");
            }
        });
        zero = new JButton("0");
        zero.setBounds(2, 305, 93, 50);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText(valor + "0");
            }
        });
        igual = new JButton("=");
        igual.setBounds(95, 305, 93, 50);
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                Calculos calculos = new Calculos();
                String resultado = calculos.calculadora(valor);

                result.setText(resultado);

            }
        });
        limpar = new JButton("Limpar");
        limpar.setBounds(188, 305, 93, 50);
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = result.getText();
                result.setText("");
            }
        });

        painel.add(result);
        painel.add(mais);
        painel.add(menos);
        painel.add(vezes);
        painel.add(um);
        painel.add(dois);
        painel.add(tres);
        painel.add(quatro);
        painel.add(cinco);
        painel.add(seis);
        painel.add(sete);
        painel.add(oito);
        painel.add(nove);
        painel.add(zero);
        painel.add(igual);
        painel.add(limpar);
        tela.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
