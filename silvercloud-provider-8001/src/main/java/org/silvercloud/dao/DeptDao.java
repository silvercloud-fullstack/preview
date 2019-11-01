package org.silvercloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.silvercloud.entity.Dept;
import java.util.List;

/**
 * @author shixianchun
 * @Title: DeptDao
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/25下午4:55
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
