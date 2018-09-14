/* Hildana. M
 * Question30.java
 * This program allows the user to enter information and get result
 * Sept/14/2018
 */

package question30;
import javax.swing.*;
/**
 *
 * @author himel9675
 */
public class Question30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1, num2, sum, difference, product, quotient;
        
        //ask user for their first name
        String fName = JOptionPane.showInputDialog("Please"
                + " enter your first name.");
        
        //ask user to enter one number 
         num1 = Double.parseDouble(JOptionPane.showInputDialog("Please"
                + " enter the first number"));
        
        //ask user to enter a second number 
         num2 = Double.parseDouble(JOptionPane.showInputDialog("Please"
                + " enter a second number"));
       
        //the sum
        sum = num1 + num2;
        
        //Difference
        difference = num1 - num2;
        
        //product 
        product = num1 * num2;
        
        //quotient
        quotient = num1/num2;
            
        //Dsiplay result 
        System.out.println("first name: " + fName.toUpperCase());
        System.out.println("sum: " + sum);
        System.out.println("difference + " + difference);
        System.out.println("product: " + product);
        System.out.println("quorient " + quotient);
        
    
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
