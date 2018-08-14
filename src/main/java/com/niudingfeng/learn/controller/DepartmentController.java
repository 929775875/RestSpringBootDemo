package com.niudingfeng.learn.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.niudingfeng.learn.annotation.IgnoreSecurity;
import com.niudingfeng.learn.entity.Department;
import com.niudingfeng.learn.response.Response;
import com.niudingfeng.learn.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lin
 * @since 2018-08-10
 */

@RestController

@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    ObjectMapper MAPPER = new ObjectMapper();
    @RequestMapping("deleteall")
    public String deleteAll(@RequestBody int[] ids){
       departmentService.deleteAll(ids);
        return "sucess";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(@Valid Department department){
        boolean bool = departmentService.insert(department);
        return bool?"success":"fail";
    }
    @RequestMapping("test")
    @ResponseBody
    @IgnoreSecurity
    public Response test(){
        Response response = new Response();
        Response success = response.success(departmentService.selectList(null));
        return success;
    }
    @RequestMapping("queryall")
    @ResponseBody
    @IgnoreSecurity
    public List<Department> queryAll(){
        List<Department> departments = departmentService.selectList(null);
        return departments;
    }
}

