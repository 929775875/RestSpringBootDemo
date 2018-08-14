package com.niudingfeng.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lin
 * @since 2018-08-10
 */
@TableName("department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "departmentName")
    @NotBlank(message = "部门名称不能为空")
    @Size(min = 2, max = 3)
    private String departmentName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
        ", id=" + id +
        ", departmentName=" + departmentName +
        "}";
    }
}
