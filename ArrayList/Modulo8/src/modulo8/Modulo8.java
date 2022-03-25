
package modulo8;

import java.util.ArrayList;


public class Modulo8 {

  
    public static void main(String[] args) {
       ArrayList<String> carro= new ArrayList<String>();
       
       carro.add("BMW"); //0
       carro.add("Mazda");//1
       
       carro.clear();
       
       for(int i=0;i<carro.size();i++){
          System.out.println("Carro: "+carro.get(i)); 
       }
        
    }
    
}
