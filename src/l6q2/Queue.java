/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q2;

/**
 *
 * @author User
 */
public class Queue {
    Node producthead;
    Node codehead;
    Node toShowhead;
    
    public void enqueuecode(String data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(codehead == null)
        {
            codehead = node;
        }
        else
        {
            Node n = codehead;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    
     public void enqueueproduct(String data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(producthead == null)
        {
            producthead = node;
        }
        else
        {
            Node n = producthead;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
     
     public void showlist(Node header)
     {
         Node n = header;
         while(n != null)
         {
             System.out.print(n.toString(n));
             n = n.next;
         }
     }
     
     public void enqueuetoShow(String data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(toShowhead == null)
        {
            toShowhead = node;
        }
        else
        {
            Node n = toShowhead;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
     
     
     public String popproduct()
     {
         String data = producthead.data;
         producthead = producthead.next;
         return data;
     }
     
     public String peekcode()
     {
         return codehead.data;
     }
     
     public String popcode()
     {
         String data = codehead.data;
         codehead = codehead.next;
         return data;
     }
}
