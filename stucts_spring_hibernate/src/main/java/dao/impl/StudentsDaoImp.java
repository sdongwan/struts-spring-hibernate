package dao.impl;

import bean.StudentsBean;
import dao.StudentsDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Administrator on 2017/6/6.
 */

public class StudentsDaoImp implements StudentsDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }




    public void insertStudents(StudentsBean students) {
        HibernateUtil.openSession(sessionFactory).save(students);
        HibernateUtil.closeSession();

    }

    public StudentsBean selectStudentsById(int id) {
        return null;
    }

    public void deleteStudentsById(int id) {

    }

    public List<StudentsBean> selectAllStudents() {
        return null;
    }
}
