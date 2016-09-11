package ejercicio36;

import javax.swing.JOptionPane;

public class Ejercicio36 {

    public static void main(String[] args) {
    int emfr=0, efr=0, er=0, enr=0, spc=0;
        
        int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo estudiante"));
        double pc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese promedio credito"));
        spc=spc+1;
        if(pc>=4.8){
            emfr=emfr+1;
            System.out.print(cod + pc +" MUY FUERTE RECOMENDARION");
        }
        else{
            if(pc>=4.5){
                efr=efr+1;
                System.out.print(cod + pc +" FUERTE RECOMENDACION");
            }
            else {
                 if(pc>=4.0){
                 er=er+1;
                 System.out.print(cod + pc +" RECOMENDADO");
                 }
                 else{
                 enr=enr+1;
                 System.out.print(cod + pc +"NO RECOMENDADO");
                 }
            }
        }
        cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo estudiante"));
        
        while(cod!=0){
           int nte=emfr+efr+er+enr;
           int pcg=spc/nte;
           System.out.print(emfr + efr + er + enr + pcg);
        }
    }
    
}
