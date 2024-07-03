package org.gradeSystemBackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gradeSystemBackend.entity.Student;
import org.gradeSystemBackend.entity.vo.StudentCourseListVO;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {
    public StudentCourseListVO[] getStudentCourseList(Integer studentId);
}
