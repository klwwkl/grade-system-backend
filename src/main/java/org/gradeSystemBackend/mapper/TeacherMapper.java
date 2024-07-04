package org.gradeSystemBackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gradeSystemBackend.entity.Teacher;
import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.vo.CourseStudentListVO;
import org.gradeSystemBackend.entity.vo.StudentCourseListVO;
import org.gradeSystemBackend.entity.vo.TeacherCourseListVO;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TeacherMapper extends BaseMapper<Teacher> {
    TeacherCourseListVO[] getTeacherCourseList(Integer teacherId);

    CourseStudentListVO[] getStudentList(Integer teacherId, Integer courseId);
}
