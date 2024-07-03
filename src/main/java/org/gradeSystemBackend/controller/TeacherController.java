package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.Result;
import org.gradeSystemBackend.service.StudentService;
import org.gradeSystemBackend.service.TeacherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/teacher")
@CrossOrigin(origins = "*")
public class TeacherController {
    public final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping(value = "/getTeacherCourseList")
    public Result<?> getTeacherCourseList(@RequestParam("teacherId") Integer teacherId){
        if(teacherId==null){
            return Result.error("教师id为空");
        }
        return Result.success(teacherService.getTeacherCourseList(teacherId));
    }

    @GetMapping(value = "/getCourseStudentList")
    public Result<?> getCourseStudentList(@RequestParam("teacherId") Integer teacherId,@RequestParam("courseId") Integer courseId){
        if(teacherId==null){
            return Result.error("教师id为空");
        }
        if(courseId==null){
            return Result.error("课程id为空");
        }
        return Result.success(teacherService.getCourseStudentList(teacherId,courseId));
    }
}
