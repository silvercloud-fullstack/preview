package org.silvercloud.service;

import org.silvercloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author shixianchun
 * @Title: DeptClientService
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/29下午5:15
 */

@FeignClient(value = "SILVERCLOUD-DEPT",fallbackFactory = DeptClientServiceFallback.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);

    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery();


}
