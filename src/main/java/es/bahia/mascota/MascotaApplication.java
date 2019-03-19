/*
 * Copyright 2018
 * 
 * Author: Emilio Domínguez
 * Proyecto: Prueba técnica Bahia - Gestión mascotas
 * 
 */
package es.bahia.mascota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Clase MascotaApplication.
 */
@SpringBootApplication
public class MascotaApplication extends SpringBootServletInitializer{

    /* (non-Javadoc)
     * @see org.springframework.boot.web.servlet.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MascotaApplication.class);
    }

    /**
     * Método principal.
     *
     * @param args argumentos
     * @throws Exception si se produce unha excepción
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MascotaApplication.class, args);
    }
}
