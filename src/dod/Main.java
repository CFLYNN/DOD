/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2dod;

/**
 * @author 20312792
 */

import java.io.*;


public class Main {

    /**
     * @param args the command line arguments
     */




    public static void main(String[] args) {
   // TODO code application logic here

       BufferedReader r =  new BufferedReader( new InputStreamReader(System.in));
       Player p = new Player();
       World w = new World();

        p.l = w.BabblingBrook;


     String cmd="";
     while(true){
         try {
         cmd = r.readLine();
         
         
          } catch (Exception e){};

  System.out.println(cmd);
     
     
  if(cmd.equals("North"))   

  p.goNorth();
           
  if(cmd.equals("South"))   
     
   p.goSouth();

   if(cmd.equals("East"))   
     
    p.goEast();
   
  if(cmd.equals("West"))   
     
    p.goWest();
  
  
     }

     
    }

}