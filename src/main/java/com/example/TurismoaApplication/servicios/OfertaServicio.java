package com.example.TurismoaApplication.servicios;

import com.example.TurismoaApplication.modelos.Oferta;
import com.example.TurismoaApplication.repositorios.OfertaRepositorio;
import com.example.TurismoaApplication.validaciones.OfertaValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfertaServicio {

   /* @Autowired
    OfertaValidacion objetoOfertaValidacion;*/

    @Autowired
    OfertaRepositorio objetoOfertaRepositorio;
    public Oferta registrarOferta(Oferta datosARegistrar ) throws Exception{
        try{
            //validaciones
          /*  if(!this.objetoOfertaValidacion.validarTitulo(datosARegistrar.getTitulo())){
                throw new Exception("error en el servicio");
            }*/

            //falta validar el nit

            //SI PASO TODOS LOS IF ESTOY LISTO PARA LLAMAR AL REPO
            return(this.objetoOfertaRepositorio.save(datosARegistrar));

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
