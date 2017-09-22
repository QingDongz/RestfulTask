package cn.summerwaves.service.imp;

import cn.summerwaves.dao.StudentDao;
import cn.summerwaves.model.Student;
import cn.summerwaves.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by summerwaves on 2017/9/11.
 */
@Service("userService")
public class StudentServiceImpl implements IStudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return  studentDao.getAllStudent();
    }

    @Override
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
    @Override
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
//    @Override
//    public void insertUser(Student student) throws IOException {
//        studentDao.insertUserByAnnotation(student);
//    }
//
//    @Override
//    public List<Student> getAllUsers() throws IOException {
//        return studentDao.getAllUsers();
//    }
//
//    @Override
//    public Student getUserByUserName(String username) throws IOException {
//        return studentDao.getUserByUserName(username);
//    }
//
//    @Override
//    public void deleteUser(String username) {
//        studentDao.deleteUser(username);
//    }
//
//    @Override
//    public void modifyPassword(Student student)throws IOException {
//        studentDao.modifyPassword(student);
//    }

}
