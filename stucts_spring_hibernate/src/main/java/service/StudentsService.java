package service;

import bean.StudentsBean;
import dao.StudentsDao;

/**
 * Created by Administrator on 2017/6/6.
 */
public class StudentsService {

    private StudentsDao studentsDao;

    public StudentsDao getStudentsDao() {
        return studentsDao;
    }

    public void setStudentsDao(StudentsDao studentsDao) {
        this.studentsDao = studentsDao;
    }



    public void insertStudents() {
        StudentsBean studentsBean = new StudentsBean(1, "sdongwan", 18);
        studentsDao.insertStudents(studentsBean);
    }

}
