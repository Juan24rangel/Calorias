package ejcutable;
import javax.swing.JOptionPane;
import java.util.Arrays;
    

public class Dec {
    public static void main(String[] args)
     {
     int[]calorias=new int[7];
    String[] dias ={"lunes","Martes","Miercoles","Jueves","Viernes", "Sabado", "Domingo" };
        int mayor=0;
        float promedio=0;
        float promedio_total;
        float menor;
        String dia_mayor= "";
        String dia_menor= "";
        String calorias_semana="Calorias gastadas en determinado dia:\n" ;
        String np="";


        for(int i=0; i<calorias.length;i++)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog( "ingrese las calorias quemadas el dia "+ dias[i]+": "));
            promedio=promedio +calorias[i];
            
            
            
            
            if(calorias[i]>mayor){
                mayor=calorias[i];
                dia_mayor=dias[i];
            }
        }
        menor=mayor;
        for(int i=0; i<calorias.length;i++){
            if(calorias[i]<menor){
                menor=calorias[i];
                dia_menor=dias[i];

            }

        }
        for(int i=0; i<calorias.length;i++){
            calorias_semana += dias[i]+ ": " + calorias[i] +" Calorias" +"\n";

        }
    
        
          

        promedio_total=promedio/7;

  
            
        

        JOptionPane.showMessageDialog(null, calorias_semana);
   JOptionPane.showMessageDialog(null,"El promedio de calorias es: " + promedio_total+"\n El dia que mayor calorias quemo fue: "+ dia_mayor + "\n El dia que menor calorias quemo fue: " +dia_menor);


   

   }
}
}