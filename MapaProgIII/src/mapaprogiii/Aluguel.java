/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprogiii;

import javax.swing.JOptionPane;

/**
 *
 * @author jails
 */
public class Aluguel {
    Usuario usuario;
    Carro carro;
    int quantidadeDias;
    double kmInicial;
    double kmFinal;
    double valorTotalAluguel;

    void iniciarAluguel() {
        usuario = new Usuario();
        usuario.cadastrarUsuario();

        carro = new Carro();
        carro.cadastrarCarro();

        quantidadeDias = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias de aluguel:"));
        kmInicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o Km inicial do veículo:"));
    }

    void fecharLocacao() {
        kmFinal = Double.parseDouble(JOptionPane.showInputDialog("Informe o Km final do veículo:"));

        double valorBase = quantidadeDias * carro.valorPorKm * (kmFinal - kmInicial);
        if (quantidadeDias > 20) {
            valorTotalAluguel = valorBase * 0.8; // 20% de desconto
        } else if (quantidadeDias > 10) {
            valorTotalAluguel = valorBase * 0.9; // 10% de desconto
        } else {
            valorTotalAluguel = valorBase;
        }
    }

    void mostrarResumoLocacao() {
        String resumo = "Resumo Aluguel\n" +
                "Cliente\n" + usuario.mostrarDadosUsuario() + "\n" +
                "Carro\nModelo: " + carro.modelo + "\nMarca: " + carro.marca + "\nValor por Km: " + carro.valorPorKm + "\n" +
                "Aluguel\nQuantidade de dias: " + quantidadeDias + "\nKm Inicial: " + kmInicial + "\nKm Final: " + kmFinal + "\nValor Total: R$" + valorTotalAluguel;

        JOptionPane.showMessageDialog(null, resumo);
    }
}
