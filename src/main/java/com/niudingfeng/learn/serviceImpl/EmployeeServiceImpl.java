package com.niudingfeng.learn.serviceImpl;

import com.niudingfeng.learn.entity.Employee;
import com.niudingfeng.learn.mapper.EmployeeMapper;
import com.niudingfeng.learn.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
