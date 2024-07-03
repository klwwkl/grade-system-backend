package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.Result;
import org.gradeSystemBackend.service.GradeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
public class GradeController {
    public final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping(value = "/getStudentCourseGrade")
    public Result<?> getStudentCourseGrade(@RequestParam("studentId") Integer studentId,@RequestParam("courseId") Integer courseId){
        if(studentId==null){
            return Result.error("学生id为空");
        }
        if(courseId==null){
            return Result.error("课程id为空");
        }
        return Result.success(gradeService.getStudentCourseGrade(studentId,courseId));
    }
}
