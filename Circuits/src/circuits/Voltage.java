/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuits;

/**
 *
 * @author sugen
 */

public class Voltage extends Components{
    public Voltage(double value,int node1,int node2)
    { 
        super(value,node1,node2);
        System.out.println("calling v");
        Circuits.getInstance().add(this);
        
    }
    
    @Override
    public String toString()
    {
        
        return ("V"+ " "+ node1+" "+ node2+" "+String.valueOf(value));
    }

    //private void E(double voltage,Node node1,Node node2) {
       // if (voltage<0){
        //throw new IllegalArgumentException("it can't be negative");
        //}
       // if (node1.equals(node2)){
       // throw new IllegalArgumentException("resistor cant be attached to the same nodes");
    //}
    //}
}