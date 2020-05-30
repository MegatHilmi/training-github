/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q2;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q2 {
    public static Queue q = new Queue();

    /**
     * @param args the command line arguments
     */
    public static boolean check(String data)
    {
        if(Character.isDigit(data.charAt(1)))
        {
            return true;
        }
        else
            return false;
    }
    
    
    public static void split(String[] arrdata)
    {
        for(int counter = 0 ; counter < arrdata.length ; counter++)
        {
            
            if(check(arrdata[counter]))
            {
                q.enqueuecode(arrdata[counter]);
            }
            else
            {
                q.enqueueproduct(arrdata[counter]);
            }
        }
    }
    
    public static boolean checktoshow(String input)
    {
        if(q.peekcode().equalsIgnoreCase(input))
        {
            q.popcode();
            return true;
        }
        else
        {
            q.popcode();
            return false;
        }
    }
    
    public static void main(String[] args) {
        String data = "";
        
        try{
            Scanner a = new Scanner(new FileInputStream("file.txt"));
            
            while(a.hasNext())
            {
                String file = a.nextLine();
                
                data += file;
                data += " ";
            }
        }catch(Exception e)
        {
            System.out.println("There is problem with the file");
        }
        
        //split the code and product
        String[] arrdata = data.split(" ");
        split(arrdata);
//        q.showlist(q.codehead);
//        System.out.println("");
//        q.showlist(q.producthead);
          
          Scanner b = new Scanner(System.in);
          System.out.print("PLease enter the what product do you want to show :");
          String input = b.nextLine();
          
          while(q.codehead != null)
          {
              if(checktoshow(input))
              {
                  q.enqueuetoShow(q.popproduct());
              }
              else
              {
                  q.popproduct();
              }
          }
          
          q.showlist(q.toShowhead);
    }
    
}
