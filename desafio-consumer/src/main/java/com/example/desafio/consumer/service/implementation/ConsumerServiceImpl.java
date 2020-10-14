package com.example.desafio.consumer.service.implementation;

import org.springframework.stereotype.Service;

import com.example.desafio.consumer.dto.MessageDTO;
import com.example.desafio.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(MessageDTO message) throws Exception {
		throw new Exception("Erro");
		//System.out.println(message.getText());
		
	}

	
	
}
