package per.fly.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.fly.mapper.TeacherMapper;
import per.fly.pojo.LoginForm;
import per.fly.pojo.Teacher;
import per.fly.service.TeacherService;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public Teacher login(LoginForm loginForm) {
        return teacherMapper.login(loginForm);
    }

    @Override
    public List<Teacher> selectList(Teacher teacher) {
        return teacherMapper.selectList(teacher);
    }

    @Override
    public Teacher findByTno(Teacher teacher) {
        return teacherMapper.findByTno(teacher);
    }

    @Override
    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int update(Teacher teacher) {
        return teacherMapper.update(teacher);
    }

    @Override
    public int deleteById(Integer id) {
        return teacherMapper.deleteById(id);
    }

    @Override
    public int updatePassowrd(Teacher teacher) {
        return teacherMapper.updatePassword(teacher);
    }
}
