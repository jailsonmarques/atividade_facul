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
public class Usuario {
    private String nome;
    private String cpf;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    


public void cadastrarUsuario() {
        nome = JOptionPane.showInputDialog("Informe o nome do usuário:");
        cpf = JOptionPane.showInputDialog("Informe o CPF do usuário:");
        telefone = JOptionPane.showInputDialog("Informe o telefone do usuário:");
    }

    String mostrarDadosUsuario() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }
}

