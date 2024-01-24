/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuits;


public class Node {
    static int nextId=0;  
    int id;
    
    public Node()
    {
        this.id=nextId;
        nextId++;
       
    }
   
    @Override
    public String toString()
    {
        
        return String.valueOf(id);
    }
}
