package org.gradeSystemBackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gradeSystemBackend.entity.Grade;
import org.gradeSystemBackend.entity.Student;
import org.gradeSystemBackend.entity.vo.GetGradeVo;
import org.gradeSystemBackend.entity.vo.StudentCourseListVO;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GradeMapper extends BaseMapper<Grade> {
    GetGradeVo getStudentCourseGrade(Integer studentId,Integer courseId);
}
