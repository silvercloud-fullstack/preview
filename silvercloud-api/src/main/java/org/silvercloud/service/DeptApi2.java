package org.silvercloud.service;

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
public interface DeptApi2 {

	@ApiOperation(value = "接口名1", notes = "接口描述1")
	@RequestMapping(value = "/dept2/get/{id}", method = RequestMethod.GET)
	public String getHaHa(@PathVariable("id") long id);

	@ApiOperation(value = "接口名4", notes = "接口描述4")
	@RequestMapping(value = "/dept2/discovery", method = RequestMethod.GET)
	public Object discovery();

}
