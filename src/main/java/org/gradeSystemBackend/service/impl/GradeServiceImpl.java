package org.gradeSystemBackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.gradeSystemBackend.entity.Grade;
import org.gradeSystemBackend.entity.dto.GetStudentCourseGradeDTO;
import org.gradeSystemBackend.entity.vo.GetGradeVO;
import org.gradeSystemBackend.mapper.GradeMapper;
import org.gradeSystemBackend.service.GradeService;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
    @Override
    public GetGradeVO getStudentCourseGrade(Integer studentId, Integer courseId) {
        return this.baseMapper.getStudentCourseGrade(studentId,courseId);
    }

    @Override
    public Integer updateStudentCourseGrade(GetStudentCourseGradeDTO getStudentCourseGradeDTO) {
        return this.baseMapper.updateStudentCourseGrade(getStudentCourseGradeDTO);
    }
}
