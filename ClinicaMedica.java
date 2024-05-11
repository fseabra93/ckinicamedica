/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicamedica;

/**
 *
 * @author flaviorgs
 */
public class ClinicaMedica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medico m[] = new Medico[3];
        Recepcionista r[] = new Recepcionista[3];
        
        Pessoa med = new Medico("José Carlos", "333.333.333-33");
        
        if (med instanceof Pessoa){
            if (med instanceof Funcionario){
                if (med instanceof Medico){
                    med.contratar();
                }
            }  
        }
        
        
        
        m[0] = new Medico("João Silva", "111.111.111-11");
        r[0] = new Recepcionista("Maria Souza", "222.222.222-22");
        
        m[0].contratar();
        r[0].contratar();
        
        r[0].demitir(r[0].getSalario());
        m[0].demitir(m[0].getSalario());
        
        m[0].pagamento();
        r[0].pagamento();
        
        m[0].tirarFerias();
        r[0].tirarFerias();
        
        //contratarMedico(num);
        //r[0].contratar();
        
    }
    
}
