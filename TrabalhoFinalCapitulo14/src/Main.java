import entities.Imposto;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JOptionPane jo = new JOptionPane();
        Scanner sc = new Scanner(System.in);
        List<Imposto> lista = new ArrayList<>();

        int num = Integer.parseInt(jo.showInputDialog(null,
                "Digite o número de contribuintes: "));

        for (int i = 0; i < num; i++) {
            char op = jo.showInputDialog("Contrinuinte n° " + i + 1
                    + "\nPessoa Física digite -> (F)\nPessoa Juritica digite -> (J)").charAt(0);

            if (op == 'F' || op == 'f') {
                String nome = jo.showInputDialog("Nome: ");
                Double renda = Double.parseDouble(jo.showInputDialog("Renda anula: "));
                Double saude = Double.parseDouble(jo.showInputDialog("Gastos com saúde: "));

                lista.add(new PessoaFisica(nome, renda, saude));
            } else if (op == 'j' || op == 'J') {
                String nome = jo.showInputDialog("Nome: ");
                Double renda = Double.parseDouble(jo.showInputDialog("Renda anual: "));
                Integer numFuncionario = Integer.parseInt(jo.showInputDialog("Quantidade de funcionários: "));

                lista.add(new PessoaJuridica(nome, renda, numFuncionario));

            }
        }

        jo.showMessageDialog(null, "\nImpostos a pagar");

        double totalImpostos = 0.0;
        for (Imposto imp : lista) {
            jo.showMessageDialog(null, imp.getNome()
                    + String.format("R$ %.2f", imp.calculoImposto()));

            totalImpostos += imp.calculoImposto();
        }

        jo.showMessageDialog(null, "Impostos arrecadados: "
                + String.format("R$ %.2f", totalImpostos));

        sc.close();
    }
}