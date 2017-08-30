package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2017/5/23.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static Transaction transaction;
    private static Session session;


    public static Session openSession(SessionFactory sessionFactory1) {
        sessionFactory = sessionFactory1;
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        return session;     //先开启一个事务
    }


    public static void closeSession() {
        if (transaction != null) {
            transaction.commit();
        }
        if (session != null) {
            session.close();
        }
    }

}
