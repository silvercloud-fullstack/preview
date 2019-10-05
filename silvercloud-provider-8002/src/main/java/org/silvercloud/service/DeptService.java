package org.silvercloud.service;

import org.silvercloud.entity.Dept;

import java.util.List;

/**
 * @author shixianchun
 * @Title: DeptService
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午4:54
 */
public interface DeptService
{
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
