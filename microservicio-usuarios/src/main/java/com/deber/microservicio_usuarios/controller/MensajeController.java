package com.deber.microservicio_usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.deber.microservicio_usuarios.service.MensajeService;

@RestController
@RequestMapping("/productor")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @PostMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje) {
        mensajeService.enviarMensaje(mensaje);
        return "Mensaje enviado a RabbitMQ: " + mensaje;
    }
}