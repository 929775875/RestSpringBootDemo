package com.niudingfeng.learn.serviceImpl;

import com.niudingfeng.learn.entity.Department;
import com.niudingfeng.learn.mapper.DepartmentMapper;
import com.niudingfeng.learn.service.DepartmentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lin
 * @since 2018-08-10
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public Integer deleteAll(int[] ids) {
        return departmentMapper.deleteAll(ids);
    }
}
