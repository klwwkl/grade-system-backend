package org.gradeSystemBackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.gradeSystemBackend.entity.Grade;
import org.gradeSystemBackend.entity.dto.UpdateCourseGradeDTO;
import org.gradeSystemBackend.entity.vo.GetGradeVO;
import org.gradeSystemBackend.mapper.GradeMapper;
import org.gradeSystemBackend.service.GradeService;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
    @Override
    public GetGradeVO getCourseGrade(Integer studentId, Integer courseId) {
        return this.baseMapper.getCourseGrade(studentId,courseId);
    }

    @Override
    public Integer updateCourseGrade(UpdateCourseGradeDTO updateCourseGradeDTO) {
        return this.baseMapper.updateCourseGrade(updateCourseGradeDTO);
    }
}
