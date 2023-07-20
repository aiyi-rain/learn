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
@RequestMapping("/teacher")
public class TeacherController {
    @PreAuthorize("hasAuthority('teacher:query')")
    @GetMapping("/query")
    public String query(){
        return "查询教师成功";
    }
    @PreAuthorize("hasAuthority('teacher:add')")
    @GetMapping("/add")
    public String add(){
        return "添加教师成功";
    }
    @PreAuthorize("hasAuthority('teacher:updata')")
    @GetMapping("/updata")
    public String updata(){
        return "修改教师成功";
    }
    @PreAuthorize("hasAuthority('teacher:delete')")
    @GetMapping("/delete")
    public String delete(){
        return "删除教师成功";
    }
}
