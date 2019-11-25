package org.silvercloud.controller;

import java.util.List;

import org.silvercloud.service.DeptApi2;
import org.silvercloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shixianchun
 * @Title: DeptController
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午4:59
 */
@RestController
public class DeptController2 implements DeptApi2 {

	@Autowired
	private DeptService service;

	@Autowired
	private DiscoveryClient discoveryClient;

	/**
	 * 使用spring cloud 的服务发现功能来从eureka中获得相关信息作为扩展使用。
	 * 
	 * @return
	 */
	@Override
	public Object discovery() {
		List<String> list = discoveryClient.getServices();
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = discoveryClient.getInstances("SILVERCLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.discoveryClient;
	}

	@Override
	public String getHaHa(long id) {
		return "test222222";
	}
}
