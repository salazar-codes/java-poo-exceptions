package com.jimmysalazar.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int dividendo) throws DivisionPorZeroException{
        if(dividendo == 0){
            throw new DivisionPorZeroException("No se puede dividir por cero!");
            // las checked nos obligan a propagar la excepción en la firma del método.
        }
        return numerador/(double)dividendo;
    }
}
