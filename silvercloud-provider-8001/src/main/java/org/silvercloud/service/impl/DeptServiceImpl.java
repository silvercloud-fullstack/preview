package org.silvercloud.service.impl;

import org.silvercloud.dao.DeptDao;
import org.silvercloud.entity.Dept;
import org.silvercloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shixianchun
 * @Title: DeptServiceImpl
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午4:54
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}
