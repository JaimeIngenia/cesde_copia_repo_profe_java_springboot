package com.example.TurismoaApplication.controladores;

import com.example.TurismoaApplication.modelos.Oferta;
import com.example.TurismoaApplication.servicios.OfertaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ofertas")
public class OfertaControlador {

    @Autowired
    OfertaServicio objetoOfertaServicio;

    @PostMapping
    public ResponseEntity<?> registrarOferta(@RequestBody Oferta datosEmpresa){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(objetoOfertaServicio.registrarOferta(datosEmpresa));

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
}
