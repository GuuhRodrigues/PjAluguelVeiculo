package br.newtonpaiva;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class ProjetoAluguelVeiculo extends JFrame {

        private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        ProjetoAluguelVeiculo field = new ProjetoAluguelVeiculo();
        field.testaAluguelVeiculo();
    }

    private void testaAluguelVeiculo() {

        JFrame frame = new JFrame("Aluguel");
        Container janela = getContentPane();
        setLayout(null);

        JLabel aluguel = new JLabel("Aluguel de Veículos");
        JLabel dados = new JLabel("Dados do cliente");
        JLabel nome = new JLabel("Nome: ");
        JLabel cpf = new JLabel("CPF: ");
        JLabel tel = new JLabel("Tel: ");
        JLabel dadosCarro = new JLabel("Dados do carro");
        JLabel nomeCarro = new JLabel("Nome: ");
        JLabel placa = new JLabel("Placa: ");
        JLabel ano = new JLabel("Ano: ");
        JLabel dtaLoc = new JLabel("Data da locação: ");
        JLabel dtaEntrega = new JLabel("Data da Entrega: ");

        aluguel.setBounds(50, 30, 140, 20);
        dados.setBounds(50, 80, 100, 20);
        nome.setBounds(50, 120, 100, 20);
        cpf.setBounds(50, 160, 100, 20);
        tel.setBounds(50, 200, 100, 20);
        dadosCarro.setBounds(50, 260, 100, 20);
        nomeCarro.setBounds(50, 310, 100, 20);
        placa.setBounds(50, 350, 100, 20);
        ano.setBounds(50, 390, 100, 20);
        dtaLoc.setBounds(50, 430, 100, 20);
        dtaEntrega.setBounds(50, 470, 100, 20);


        MaskFormatter mascaraCPF = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDtaLoc = null;
        MaskFormatter mascaraDtaEntrega = null;

        try {
            mascaraCPF = new MaskFormatter("#########-##");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraPlaca = new MaskFormatter("UUU-#U##");
            mascaraAno = new MaskFormatter("####");
            mascaraDtaLoc = new MaskFormatter("##/##/####");
            mascaraDtaEntrega = new MaskFormatter("##/##/####");
            mascaraCPF.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraDtaLoc.setPlaceholderCharacter('_');
            mascaraDtaEntrega.setPlaceholderCharacter('_');

        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        JFormattedTextField jfNome = new JFormattedTextField();
        JFormattedTextField jfCPF = new JFormattedTextField(mascaraCPF);
        JFormattedTextField jfTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jfNomeCarro = new JFormattedTextField();
        JFormattedTextField jfPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jfAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jfDtaLoc = new JFormattedTextField(mascaraDtaLoc);
        JFormattedTextField jfDtaEntrega = new JFormattedTextField(mascaraDtaEntrega);

        jfNome.setBounds(150, 120, 200, 20);
        jfCPF.setBounds(150, 160, 90, 20);
        jfTel.setBounds(150, 200, 90, 20);
        jfNomeCarro.setBounds(150, 310, 100, 20);
        jfPlaca.setBounds(150, 350, 100, 20);
        jfAno.setBounds(150, 390, 100, 20);
        jfDtaLoc.setBounds(150, 430, 100, 20);
        jfDtaEntrega.setBounds(150, 470, 100, 20);

        janela.add(aluguel);
        janela.add(dados);
        janela.add(nome);
        janela.add(cpf);
        janela.add(tel);
        janela.add(dadosCarro);
        janela.add(nomeCarro);
        janela.add(placa);
        janela.add(ano);
        janela.add(dtaLoc);
        janela.add(dtaEntrega);
        janela.add(jfNome);
        janela.add(jfCPF);
        janela.add(jfTel);
        janela.add(jfNomeCarro);
        janela.add(jfPlaca);
        janela.add(jfAno);
        janela.add(jfDtaLoc);
        janela.add(jfDtaEntrega);

        JButton botao = new JButton("Salvar");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Aluguel realizado com sucesso!","Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        janela.add(botao);
        botao.setBounds(100, 520, 200, 20);

        frame.getContentPane().add(janela);
        frame.setSize(420, 620);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

