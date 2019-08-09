package sample;

import javax.swing.*;

public class Division {
    public static void main(String[] args) throws ArithmeticException{
        int a= 3, b = 3;
        try {
            System.out.println(b/a);
        }catch (ArithmeticException ex){
            JOptionPane.showMessageDialog(null,"Valor divisor erroneo");
        }
    }
}
