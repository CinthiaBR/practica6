package ec.edu.epn.git.practica6;

import java.sql.SQLOutput;

public class CalculatorExecute {
    public static void main (String[] args){
        System.out.println("==Calculator Execute ==");
        Calculator c = new Calculator();
        int addition =c.addition(7,7);
        System.out.println("c.addition(7,7)= "+ addition);
        int substraction =c.subtraction(7,1);
        System.out.println("c.substraction(7,1)= "+ substraction);
        int division =c.division(7,7);
        System.out.println("c.division(7,7)= "+ division);
        int multiplication = c.multiplication(6,2);
        System.out.println("c.multiplication (6,2) = " + multiplication);
    }
}
