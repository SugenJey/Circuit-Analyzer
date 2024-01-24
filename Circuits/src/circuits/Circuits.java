/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circuits;

/**
 *
 * @author sugen
 */
import java.util.ArrayList;

/**
 *
 * @author sugen
 */
public class Circuits {
    private static Circuits instance =null;
    public static ArrayList<Components> component= new ArrayList();
    public static Circuits getInstance() {
    if (instance == null)
        { 
            instance = new
            Circuits();
        }       
    return instance;
    }
    private Circuits() {}
    
    public void add(Resistor r)
    {
        System.out.println("called r");
               int[] nodes;
       nodes=r.getNodes();
       int temp;
       if(nodes[0]>nodes[1])
       {
          temp=nodes[0];
          nodes[0]=nodes[1];
          nodes[1]=temp;
          
       }
       for(int i=0;i<component.size();i++)
       {   
           System.out.println("cycle");
           int[] nodesC;
            nodesC=component.get(i).getNodes();
           if(nodesC[0]<=nodes[0]||i==component.size()-1)
           {
               component.add(i, r);
               System.out.println("normal add r");
               break;
           }
       
       }
       if (component.isEmpty())
       {
         System.out.println("empty add r");
            component.add( r);
       }
    
    
    }
    public void add(Voltage v)
    {
        
       int[] nodes;
       nodes=v.getNodes();
       int temp;
       if(nodes[0]>nodes[1])
       {
          temp=nodes[0];
          nodes[0]=nodes[1];
          nodes[1]=temp;
          v.value=-1*v.value;
          
       }
       for(int i=0;i<component.size();i++)
       {    
           int[] nodesC;
            nodesC=component.get(i).getNodes();
           if(nodesC[0]<=nodes[0]||i==component.size()-1)
           {
               component.add(i, v);
               System.out.println("normal add v");
               break;
           }
       }
        if (component.isEmpty())
        {
            System.out.println("empty add v");
            component.add( v);
        }    
    }
    @Override
    public String toString()
    { 
        String output="";
       for(Components element:component)
        {
          
            output=output.concat(element.toString()).concat("\n");
        }
       return output;
    } 
}
