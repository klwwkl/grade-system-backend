package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.Result;
import org.gradeSystemBackend.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
@CrossOrigin(origins = "*")
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
