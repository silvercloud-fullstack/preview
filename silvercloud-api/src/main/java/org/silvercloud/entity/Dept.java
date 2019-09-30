package org.silvercloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author shixianchun
 * @Title: Dept
 * @ProjectName microservice
 * @Description: TODO
 * @date 2019/9/24下午6:06
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {

    private Long deptno;
    private String deptname;
    private String db_source;

}
