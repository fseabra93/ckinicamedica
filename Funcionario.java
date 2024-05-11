/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicamedica;

//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author flaviorgs
 */
public abstract class Funcionario extends Pessoa {
   
    protected int matricula;
    protected String funcao;
    protected String data_contratacao;
    protected String data_demissao;
    

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        
    }
    

    public String getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(String data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    public String getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(String data_demissao) {
        this.data_demissao = data_demissao;
    }
    
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int getQtd_filhos() {
        return qtd_filhos;
    }

    @Override
    public void setQtd_filhos(int qtd_filhos) {
        this.qtd_filhos = qtd_filhos;
    }
    
    Scanner tecl = new Scanner(System.in);
   
    public abstract void pagamento();
    
    @Override
    public void demitir(float salario){
       Date currentDate = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       String dataformatada = sdf.format(currentDate);
       //System.out.println(dataformatada);
           
       System.out.print("\nPocessando demissão de "+
                this.getNome()+
                ", de Matrícula: "+this.getMatricula()+": ");
       
       this.setData_demissao(dataformatada);
       System.out.println("\nA demissão do "+ this.getFuncao()+" "+ this.getNome() +" foi processada com sucesso em " +this.getData_demissao());
       System.out.println("O valor da recisão é: "+(salario+salario*0.3));
  
   
    }

}


