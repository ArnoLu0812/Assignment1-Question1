/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
/**
 *
 * @author lu-l98
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    int num1=0;
    int num2=0;
    char operator;
    double answer = 0.0; 
    
    Scanner enter = new Scanner(System.in);
    
    System.out.println("Please enter first number");
    num1 = enter.nextInt();
    System.out.println("Please enter second numeber");
    num2 = enter.nextInt();
    System.out.println("What's operation");
    operator = enter.next().charAt(0);
    
    switch (operator) {
        case '+': answer = num1 + num2;
        break;
        case '-': answer = num1 - num2;
        break;
        case '*': answer = num1 * num2;
        break;
        case '/': answer = num1/num2;
    }    
        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
        
    
    }
    
}
