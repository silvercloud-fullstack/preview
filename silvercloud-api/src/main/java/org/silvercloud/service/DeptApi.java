package org.silvercloud.service;

import java.util.List;

import org.silvercloud.entity.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.ApiOperation;

/**
 * @author shixianchun
 * @Title: DeptClientService
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/29下午5:15
 */
public interface DeptApi {

	@ApiOperation(value = "接口名1", notes = "接口描述1")
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id);

	@ApiOperation(value = "接口名2", notes = "接口描述2")
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list();

	@ApiOperation(value = "接口名3", notes = "接口描述3")
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept);

	@ApiOperation(value = "接口名4", notes = "接口描述4")
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery();

}
