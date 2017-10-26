package com.itheima.springcloud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	@Autowired
	private RestTemplate restTemplate;
    /**
     * 查找与用户相关的订单
     */
	@GetMapping("/findOrdersByUser/{id}")
	public String findOrdersByUser(@PathVariable String id) {
//		return this.restTemplate.getForObject("http://localhost:7900/order/" + id, String.class);
		return this.restTemplate
			.getForObject("http://microservice-eureka-order/order/" + id, String.class);
	}
}