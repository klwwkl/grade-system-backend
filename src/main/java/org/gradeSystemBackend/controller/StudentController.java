package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.Result;
import org.gradeSystemBackend.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/getStudentCourseList")
    public Result<?> getStudentCourseList(@RequestParam("studentId") Integer studentId){
        if(studentId==null){
            return Result.error("学生id为空");
        }
        return Result.success(studentService.getStudentCourseList(studentId));
    }
}
