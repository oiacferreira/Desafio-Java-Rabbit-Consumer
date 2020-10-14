package com.example.desafio.consumer.service;

import com.example.desafio.consumer.dto.MessageDTO;

public interface ConsumerService {
	
	void action(MessageDTO message) throws Exception;

}
