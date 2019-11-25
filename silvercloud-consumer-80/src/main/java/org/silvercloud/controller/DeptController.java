package org.silvercloud.controller;

import java.util.List;

import org.silvercloud.entity.Dept;
import org.silvercloud.service.DeptClientService;
import org.silvercloud.service.DeptClientService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shixianchun
 * @Title: DeptController
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午7:12
 */
@RestController
public class DeptController {

	@Autowired
	private DeptClientService deptService;

	@Autowired
	private DeptClientService2 deptService2;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

	@RequestMapping(value = "/consumer/dept/getHaHa/{id}")
	public String getHaHa(@PathVariable("id") Long id) {
		return deptService2.getHaHa(id);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return deptService.list();
	}

	// 测试@EnableDiscoveryClient,消费端可以调用服务发现
	@RequestMapping(value = "/consumer/dept/discovery")
	public Object discovery() {
		return deptService.discovery();
	}

	@RequestMapping(value = "/consumer/dept/discovery2")
	public Object discovery2() {
		return deptService2.discovery();
	}

}
