package wy.mybatis.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:王艺
 * @Project:learn
 * @File:TeacherController
 * @Date:2023/7/20 13:51
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @PreAuthorize("hasAuthority('student:query')")
    @GetMapping("/query")
    public String query(){
        return "查询学生成功";
    }
    @PreAuthorize("hasAuthority('student:add')")
    @GetMapping("/add")
    public String add(){
        return "添加学生成功";
    }
    @PreAuthorize("hasAuthority('student:updata')")
    @GetMapping("/updata")
    public String updata(){
        return "修改学生成功";
    }
    @PreAuthorize("hasAuthority('student:delete')")
    @GetMapping("/delete")
    public String delete(){
        return "删除学生成功";
    }
}
