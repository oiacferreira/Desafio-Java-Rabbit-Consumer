package com.example.desafio.consumer.amqp;

public interface AmqpConsumer<T> {

	public void consumer(T t);
}
