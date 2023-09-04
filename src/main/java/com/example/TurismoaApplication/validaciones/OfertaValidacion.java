package com.example.TurismoaApplication.validaciones;

public class OfertaValidacion {

    public Boolean validarTitulo(String nombre){

        if(nombre.length()>30){
            return false;
        }else{
            return true;
        }

    }
}
