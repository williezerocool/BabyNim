/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynim;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class BabyNim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int pile1, pile2, pile3, userRemoval, count, a;
        String pilePick;
        userRemoval = 0;
        a = 0;
        pile1 = 3;
        pile2 = 3;
        pile3 = 3;
        count=1;
        
        
        
        while(count > 0){
            
            System.out.print("A: " + pile1 + " B: " + pile2 + " C: " + pile3 + "\n" + "\n" + "pick a pile: ");
            pilePick = keyboard.next();
            System.out.print("how many to remove from pile? ");
            userRemoval = keyboard.nextInt();
            
            if("a".equals(pilePick)){
            
                pile1 = pile1 - userRemoval;
            }else if("b".equals(pilePick)){
            
                pile2 = pile2 - userRemoval;
            }else if("c".equals(pilePick)){
            
                pile3 = pile3 - userRemoval;
            }
           
               
            if(pile1  <= 0){

                if(pile2 <= 0){

                    if(pile3 <= 0){

                        count = 0;
                        System.out.println("You did it, all piles are empty!");
                    }
                }
            }
            
        
        
        }
    
        
    
    
    }  
}
