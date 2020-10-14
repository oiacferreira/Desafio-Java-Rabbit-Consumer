package com.example.desafio.consumer.amqp.implementation;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.desafio.consumer.amqp.AmqpConsumer;
import com.example.desafio.consumer.dto.MessageDTO;
import com.example.desafio.consumer.service.ConsumerService;

@Component
public class RabbitMQConsumer implements AmqpConsumer<MessageDTO> {

	@Autowired
	private ConsumerService consumerService;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
	public void consumer(MessageDTO message) {
		
		try {
			consumerService.action(message);
		}catch(Exception ex) {
			throw new AmqpRejectAndDontRequeueException(ex);
		}
		
	}

}
