/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuits;

/**
 *
 * @author sugen
 */


  public class Components {
    double value;
    char type;
    int node1,node2;
    static int idC=1;
    int idComp;
    public Components(double value,int node1,int node2)
    {
        //this.type=type;
        //E(value,node1,node2);
        this.value=value;
        this.node1=node1;
        this.node2=node2;
        idComp=idC;
        idC++;
       
    }
    public int[] getNodes()
    {
        int[] nodes={node1,node2};
        return nodes;
       
    }
       

    private void E(double value,Node node1,Node node2) {
       // if (voltage<0){
        //throw new IllegalArgumentException("it can't be negative");
        //}
       // if (node1.equals(node2)){
       // throw new IllegalArgumentException("resistor cant be attached to the same nodes");
    //}
    }
}  
