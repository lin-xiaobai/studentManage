package per.fly.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.fly.mapper.GradeMapper;
import per.fly.pojo.Grade;
import per.fly.service.GradeService;

import java.util.List;
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    GradeMapper gradeMapper;


    @Override
    public List<Grade> selectList(String name) {
        return gradeMapper.selectList(name);
    }

    @Override
    public List<Grade> selectAll() {
        return gradeMapper.selectAll();
    }

    @Override
    public Grade findByName(String name) {
        return gradeMapper.findByName(name);
    }

    @Override
    public int insert(Grade grade) {
        return gradeMapper.insert(grade);
    }

    @Override
    public int update(Grade grade) {
        return gradeMapper.update(grade);
    }

    @Override
    public int deleteById(Integer id) {
        return gradeMapper.deleteById(id);
    }
}
