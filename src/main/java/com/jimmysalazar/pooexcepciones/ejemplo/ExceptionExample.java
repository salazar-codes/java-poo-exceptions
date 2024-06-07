package com.jimmysalazar.pooexcepciones.ejemplo;

import javax.swing.*;

public class ExceptionExample {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        // Con catch podemos capturar el error y seguir con el flujo
        try {
            // Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
            // int division = 10 / 0; //acá termina la aplicación

            divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println("division = " + division);
        } catch(NumberFormatException nfe){
            System.out.println("Capturamos el error en tiempo de ejecución = " + nfe.getMessage());
        } catch(ArithmeticException ae){
            System.out.println("Capturamos el error en tiempo de ejecución = " + ae.getMessage());
        } finally {
            System.out.println("Es opcional. Acá cerramos recursos que se hayan quedado abiertos, se ejecuta siempre");
        }
    }
}
