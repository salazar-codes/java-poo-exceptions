package com.jimmysalazar.pooexcepciones.ejemplo;

import javax.swing.*;

public class ExceptionExample {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        //int divisor;
        int divisor = Integer.parseInt(valor);
        double division = 0; // no estamos obligados a mandar la excepción, pero como es una checked, obliga.

        try {
            division = calc.dividir(10, divisor);
        } catch (DivisionPorZeroException dpz) {
            System.out.println("Capturamos nuestra exception personalizada = " + dpz.getMessage());
        }

        // Con catch podemos capturar el error y seguir con el flujo
        try {
            // Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
            // int division = 10 / 0; //acá termina la aplicación
            // divisor = Integer.parseInt(valor);
            // int division = 10 / divisor;

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
