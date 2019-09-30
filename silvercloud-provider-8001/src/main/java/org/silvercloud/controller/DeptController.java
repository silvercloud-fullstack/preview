package org.silvercloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.silvercloud.entity.Dept;
import org.silvercloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shixianchun
 * @Title: DeptController
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午4:59
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }



    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hystrix_get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.get(id);
        if (null == dept) {
            throw new RuntimeException("该 ID:"+id+" 不存在");
        }

        return dept;
    }

    public Dept hystrix_get(@PathVariable("id") Long id){
        return  new Dept().setDeptno(id).setDeptname("该部门不存在").setDb_source("no data");
    }



    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }


    /**
     * 使用spring cloud 的服务发现功能来从eureka中获得相关信息作为扩展使用。
     * @return
     */
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("SILVERCLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }
}
