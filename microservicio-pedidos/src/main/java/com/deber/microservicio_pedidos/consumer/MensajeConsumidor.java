package com.deber.microservicio_pedidos.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MensajeConsumidor {

    @RabbitListener(queues = "pedidos-queue")
    public void recibirMensaje(String mensaje) {
        System.out.println("Mensaje recibido: " + mensaje);
    }
}