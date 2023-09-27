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
public class Carro {
    String modelo;
    String marca;
    double valorPorKm;

    public void cadastrarCarro() {
        modelo = JOptionPane.showInputDialog("Informe o modelo do carro:");
        marca = JOptionPane.showInputDialog("Informe a marca do carro:");
        valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por Km do carro:"));
    }
}
