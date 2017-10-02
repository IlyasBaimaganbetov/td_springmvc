/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 *
 * @author ilias
 */
public class DBUtils {
    
    public static Object findUnique (HibernateTemplate hibernateTemplate, String queryString, final Object... values)
    {
        List resultList = hibernateTemplate.find(queryString, values);
        if ((resultList != null) && (resultList.size() > 0))
        {
            return resultList.get(0);
        }
        return null;
    }
    
/*    public static String findUnique2 (HibernateTemplate hibernateTemplate, String queryString, final Object... values)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Student where studentId = :id ");
        query.setParameter("id", 5);
        List<?> list = query.list();
        Student student = (Student)list.get(0);
        System.out.println(student);
        return null;
    }
*/
    public static Object findUnique3 (String queryString)
    {
        SessionFactory sessionFactory = null;
        return sessionFactory.getCurrentSession().createQuery(queryString).list().get(0);

    //return null;
    }
}
