package org.silvercloud.service;

import feign.hystrix.FallbackFactory;
import org.silvercloud.entity.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shixianchun
 * @Title: DeptClientServiceFallback
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/30上午11:35
 */
@Component
public class DeptClientServiceFallback implements FallbackFactory<DeptClientService> {
	@Override
	public DeptClientService create(Throwable throwable) {

		return new DeptClientService() {
			@Override
			public Dept get(long id) {
				return new Dept().setDeptno(id).setDeptname("该服务已降级，停止使用").setDb_source("no data");
			}

			@Override
			public List<Dept> list() {
				return null;
			}

			@Override
			public boolean add(Dept dept) {
				return false;
			}

			@Override
			public Object discovery() {
				return null;
			}
		};
	}
}
