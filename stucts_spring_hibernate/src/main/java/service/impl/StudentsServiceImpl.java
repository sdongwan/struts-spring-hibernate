package service.impl;

import bean.StudentsBean;
import dao.StudentsDao;
import service.StudentsService;

/**
 * Created by Administrator on 2017/8/30.
 */
public class StudentsServiceImpl implements StudentsService {
    private StudentsDao studentsDao;

    public StudentsDao getStudentsDao() {
        return studentsDao;
    }

    public void setStudentsDao(StudentsDao studentsDao) {
        this.studentsDao = studentsDao;
    }


    public void saveStudents(StudentsBean studentsBean) {

        studentsDao.insertStudents(studentsBean);
    }


}
