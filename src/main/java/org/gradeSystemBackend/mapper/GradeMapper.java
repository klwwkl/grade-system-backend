package org.gradeSystemBackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gradeSystemBackend.entity.Grade;
import org.gradeSystemBackend.entity.dto.UpdateCourseGradeDTO;
import org.gradeSystemBackend.entity.vo.GetGradeVO;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GradeMapper extends BaseMapper<Grade> {
    GetGradeVO getCourseGrade(Integer studentId, Integer courseId);
    Integer updateCourseGrade(UpdateCourseGradeDTO updateCourseGradeDTO);
}
