package com.deber.microservicio_usuarios.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarMensaje(String mensaje) {
        rabbitTemplate.convertAndSend("pedidos-queue", mensaje);
        System.out.println("Mensaje enviado: " + mensaje);
    }
}