package dao;

import bean.StudentsBean;

import java.util.List;

/**
 * Created by Administrator on 2017/6/6.
 */
public interface StudentsDao {
    void insertStudents(StudentsBean students);

    StudentsBean selectStudentsById(int id);

    void deleteStudentsById(int id);

    List<StudentsBean> selectAllStudents();
}
