package com.jimmysalazar.pooexcepciones.ejemplo;

// Heredamos de Exception para que sea una checked, par aque sea unchecked sería de Runtime
public class DivisionPorZeroException extends Exception{
    public DivisionPorZeroException(String mensaje){
        super(mensaje);
    }
}
