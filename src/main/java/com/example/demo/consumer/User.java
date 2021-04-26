package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.config.MessagingConfig;
import com.example.demo.dto.OrderStatus;

@Component
public class User {
	
	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue :" + orderStatus);
		//return orderStatus;
	}

}
