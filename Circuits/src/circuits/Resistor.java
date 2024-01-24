/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuits;

/**
 *
 * @author sugen
 */
public class Resistor extends Components{

    public Resistor(double resistance,int node1,int node2)
    {
        super(resistance,node1,node2);
        System.out.println("calling r");
        Circuits.getInstance().add(this);
        
    }
    @Override
    public int[] getNodes()
    {
        int[] nodes={node1,node2};
        return nodes;
       
    }
    @Override
    public String toString()
    {
         return ("R"+ " "+ node1+" "+ node2+" "+String.valueOf(value));
    }

   // private void E(double resistance,Node node1,Node node2) {
     //   if (resistance<0){
       // throw new IllegalArgumentException("it can't be negative");
        //}
       // if (node1.equals(node2)){
       // throw new IllegalArgumentException("resistor cant be attached to the same nodes");
    //}
    //}
}