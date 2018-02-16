package com.example.demo;

import java.util.Date;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@RabbitListener(queues="hello")
public class DemoApplication {

//    @Autowired
//    private RabbitTemplate rabbitTemplate;
    
//    @Scheduled(fixedDelay=3000)//3s执行1次此方法;
//    public void send(){
//       rabbitTemplate.convertAndSend("hello","test>>>" + new Date());
//    }
    
//    @Bean
//    public Queue fooQueue(){
//       return new  Queue("hello");
//    }
    
    //接收到消息处理.
//    @RabbitHandler
//    public void onMessage(@Payload String hello){
//       System.out.println(hello);
//    }
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
