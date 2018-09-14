/*
 * Sean Luo 14/09/2018
 * Question30.java
 * This progrem calculates the question30.
 */

package question30;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class Question30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quotient,number1,number2;
        double sum,product,difference;
         String name =JOptionPane.showInputDialog("Please enter your name");
         String number1Str= JOptionPane.showInputDialog("Please enter first number");
         String number2Str = JOptionPane.showInputDialog("Please enter second number");
         number1 = Integer.parseInt(number1Str);
         number2 = Integer.parseInt(number2Str);
         sum = number1 + number2;
         product = number1 * number2;
         difference = number1 - number2;
         quotient = number1 / number2;
         System.out.println( name+"\nSum = "+sum+"\nDifference = "+ difference+"\nProduct =  "+product+"\nQuotient = "+quotient);
    }
    
}
