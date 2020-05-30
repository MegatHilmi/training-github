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
public class Node {
    String data;
    Node next;
    
    
    public String toString(Node  n)
    {
        return n.data + " --> ";
    }
}
