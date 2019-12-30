package org.silvercloud.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author shixianchun
 * @Title: DeptClientService
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/29下午5:15
 */

@FeignClient(value = "SILVERCLOUD-DEPT", fallbackFactory = DeptClientServiceFallback.class)
public interface DeptClientService extends DeptApi {

}
