package com.jimmysalazar.pooexcepciones.ejemplo;

import javax.swing.*;

public class ExceptionExample {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        /**
        try {
            //int divisor;
            int divisor = Integer.parseInt(valor);
            double division = 0; // no estamos obligados a mandar la excepción, pero como es una checked, obliga.
            division = calc.dividir(10, divisor);
        } catch (DivisionPorZeroException dpz) {
            System.out.println("Capturamos nuestra exception personalizada = " + dpz.getMessage());
        }
        */

        // Con catch podemos capturar el error y seguir con el flujo
        try {
            // Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
            // int division = 10 / 0; //acá termina la aplicación
            // divisor = Integer.parseInt(valor);
            // int division = 10 / divisor;
            //System.out.println("division = " + division);

            double division2 = calc.dividir("10","sdsa");
            System.out.println("division2 = " + division2);
        } catch(NumberFormatException nfe){
            System.out.println("Capturamos el error en tiempo de ejecución = " + nfe.getMessage());
        } catch(ArithmeticException ae){
            System.out.println("Capturamos el error en tiempo de ejecución = " + ae.getMessage());
        } catch (FormatoNumeroException e) {
            System.out.println("Excepcion de debe ingresar un número = " + e.getMessage());
            // para dar mas detalle
            e.printStackTrace(System.out);
        } catch (DivisionPorZeroException e) {
            System.out.println("Excepcion de no dividir entre 0 = " + e.getMessage());
        } finally {
            System.out.println("Es opcional. Acá cerramos recursos que se hayan quedado abiertos, se ejecuta siempre");
        }
    }
}
