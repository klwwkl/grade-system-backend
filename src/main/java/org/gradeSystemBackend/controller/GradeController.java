package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.Result;
import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.dto.GetStudentCourseGradeDTO;
import org.gradeSystemBackend.entity.dto.UserLoginDTO;
import org.gradeSystemBackend.entity.vo.UserLoginVO;
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

    @PostMapping(value = "/updateStudentCourseGrade")
    public Result<?> login(@RequestBody GetStudentCourseGradeDTO getStudentCourseGradeDTO) {
        if(!getStudentCourseGradeDTO.isValidate().equals("验证通过")){
            return Result.error(getStudentCourseGradeDTO.isValidate());
        }
        gradeService.updateStudentCourseGrade(getStudentCourseGradeDTO);
        return Result.success("修改成功！");
    }
}
