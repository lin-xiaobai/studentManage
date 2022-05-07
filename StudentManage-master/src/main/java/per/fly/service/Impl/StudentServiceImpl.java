package per.fly.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.fly.mapper.StudentMapper;
import per.fly.pojo.LoginForm;
import per.fly.pojo.Student;
import per.fly.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student login(LoginForm loginForm) {
        return studentMapper.login(loginForm);
    }

    @Override
    public List<Student> selectList(Student student) {
        return studentMapper.selectList(student);
    }


    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int updatePassowrd(Student student) {
        return studentMapper.updatePassword(student);
    }

    @Override
    public int deleteById(Integer id) {
        return studentMapper.deleteById(id);
    }
}
