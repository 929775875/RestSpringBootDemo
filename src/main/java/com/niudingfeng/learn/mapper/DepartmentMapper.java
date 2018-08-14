package com.niudingfeng.learn.mapper;

import com.niudingfeng.learn.entity.Department;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lin
 * @since 2018-08-10
 */
public interface DepartmentMapper extends BaseMapper<Department> {
    Integer deleteAll(@Param("ids") int[] ids);
}