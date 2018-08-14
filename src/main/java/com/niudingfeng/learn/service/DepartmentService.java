package com.niudingfeng.learn.service;

import com.niudingfeng.learn.entity.Department;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lin
 * @since 2018-08-10
 */
public interface DepartmentService extends IService<Department> {
    Integer deleteAll(int[] ids);
}
