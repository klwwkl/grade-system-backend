package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.Result;
import org.gradeSystemBackend.entity.dto.UpdateCourseGradeDTO;
import org.gradeSystemBackend.service.GradeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")
@CrossOrigin(origins = "*")
public class GradeController {
    public final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping(value = "/getCourseGrade")
    public Result<?> getCourseGrade(@RequestParam("studentId") Integer studentId,@RequestParam("courseId") Integer courseId){
        if(studentId==null){
            return Result.error("学生id为空");
        }
        if(courseId==null){
            return Result.error("课程id为空");
        }
        return Result.success(gradeService.getCourseGrade(studentId,courseId));
    }

    @PostMapping(value = "/updateCourseGrade")
    public Result<?> login(@RequestBody UpdateCourseGradeDTO updateCourseGradeDTO) {
        if(!updateCourseGradeDTO.isValidate().equals("验证通过")){
            return Result.error(updateCourseGradeDTO.isValidate());
        }
        gradeService.updateCourseGrade(updateCourseGradeDTO);
        return Result.success("修改成功！");
    }
}
