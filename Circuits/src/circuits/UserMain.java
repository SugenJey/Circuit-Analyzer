/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuits;

import java.util.Scanner;

/**
 *
 * @author sugen
 */
public class UserMain {
    
    public static void main(String[] args)
    {   
        String userInput="";
        Scanner scanner = new Scanner(System.in);
        int node1,node2;
        double value;
        String[] values=new String[4];
       while(userInput.contains("end")==false)
       {
           System.out.println("next input:");
           userInput=scanner.nextLine();
           if(userInput.contains("v"))
           {
              values=userInput.split(" ");
              node1=Integer.valueOf(values[1]);
              node2=Integer.valueOf(values[2]);
              value=Double.valueOf(values[3]);
              Voltage V= new Voltage(value,node1,node2);
              Circuits.getInstance().add(V);
           }
           else if(userInput.contains("r"))
           {
              values=userInput.split(" ");
              node1=Integer.valueOf(values[1]);
              node2=Integer.valueOf(values[2]);
              value=Double.valueOf(values[3]);
              Resistor R=new Resistor(value,node1,node2);
              Circuits.getInstance().add(R);
   
           }
       
           if(userInput.contains("spice"))
           {
              System.out.print(Circuits.getInstance().toString());
           }
       
       
       }
        
        
    } 
}
