/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicamedica;


import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author flaviorgs
 */
public class Medico extends Funcionario {
    
    
    private String crm;
    protected float salario_base;
    protected float salario;
    
    

    public Medico(String nome, String cpf) {
        super(nome, cpf);
        this.salario_base = 2000;
    }
    
    

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getFuncao() {
        return funcao;
    }

    @Override
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    
    public float getSalario_base() {
        return salario_base;
    }

    
    public void setSalario_base(float salario_base) {
        this.salario_base = salario_base;
    }

    @Override
    public String getData_contratacao() {
        return data_contratacao;
    }

    @Override
    public void setData_contratacao(String data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    @Override
    public String getData_demissao() {
        return data_demissao;
    }

    @Override
    public void setData_demissao(String data_demissao) {
        this.data_demissao = data_demissao;
    }

    
    public float getSalario() {
        return salario;
    }


    public void setSalario(float salario) {
        this.salario = salario;
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
    
    Scanner teclado = new Scanner(System.in);
    
  

    @Override
    public void pagamento() {
     
        Date currentDate = new Date();
        int mes = currentDate.getMonth();
        String[] nomeMeses = new DateFormatSymbols().getMonths();

        System.out.println("\nPagamento executado ao "+ this.getFuncao() +": "
                + "\nNome: "+this.getNome()+
                "\nValor: "+this.getSalario()+
                "\nMês de referência: " + nomeMeses[mes]);
    }

    
    @Override
    public void contratar(){

       this.setFuncao("Médico");
       Date currentDate = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       String dataformatada = sdf.format(currentDate);
       this.setData_contratacao(dataformatada);
       
        System.out.println("\nProcesando contratação de "+this.getNome() +" na função de " +this.getFuncao());
        System.out.println("Qual o número do CRM de "+this.getNome()+"?");
        String str_crm = tecl.nextLine();
        this.setCrm(str_crm);
        
        System.out.println(this.getNome() +" tem filhos? (s/n)" );
        
        String resp_filhos = tecl.nextLine();
        if (resp_filhos.equalsIgnoreCase("s")){
            System.out.println("Quantos filhos tem "+ this.getNome() +"?" );
            this.setQtd_filhos(tecl.nextInt());
        }
        
        float fator_correção = (float)(this.getQtd_filhos()*0.1);
        float adicional_filhos = this.getSalario_base()*fator_correção;
        float sal = this.getSalario_base()+adicional_filhos;
        
        this.setSalario(sal);
        
        Random random = new Random();
        int matr = random.nextInt(100000);
        this.setMatricula(matr+100000); // para que toda matrícula de médico comece com 1
        
        System.out.println("O "+this.getFuncao()+" "+ this.getNome() + " de CPF: "+this.getCpf()+ " e CRM: "+this.getCrm()+
                " foi contratado com sucesso:" +
                "\nMatrícula: "+ this.getMatricula()+
                "\nData da contratação: "+this.getData_contratacao()+
                "\nSalário: "+this.getSalario());
                
                

    }
    
    
    protected final void tirarFerias(){
        System.out.println("\nDigite dia e mês para as férias de "+this.getNome()+ " em 2024, no formato dd/mm.");
        String ferias = tecl.nextLine();
        System.out.println("As férias de "+this.getNome()+ " foram registradas com sudesso para o dia: "+ferias+"/2024");
    }

}
    

