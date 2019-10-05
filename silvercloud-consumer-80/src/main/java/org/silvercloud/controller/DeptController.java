package org.silvercloud.controller;

import java.util.List;

import org.silvercloud.entity.Dept;
import org.silvercloud.service.DeptClientService;
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

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return deptService.list();
    }


    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery()
    {
        return deptService.discovery();
    }

}
