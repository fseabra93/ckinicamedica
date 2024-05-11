/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicamedica;

/**
 *
 * @author flaviorgs
 */
public abstract class Pessoa {
    public String nome;
    public String cpf;
    public int qtd_filhos;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.qtd_filhos = 0;
    }

    public int getQtd_filhos() {
        return qtd_filhos;
    }

    public void setQtd_filhos(int qtd_filhos) {
        this.qtd_filhos = qtd_filhos;
    }

 
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

 
    public abstract void contratar();
    public abstract void demitir(float salario);

}
