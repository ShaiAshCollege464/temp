package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

/**
 * Created by Sigal on 5/20/2016.
 */
@Transactional
@Component
@SuppressWarnings("unchecked")
public class Persist {


    private SessionFactory sessionFactory;

    @Autowired
    public Persist(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public Session getQuerySession() {
        return sessionFactory.getCurrentSession();
    }


    public <T> T

    loadObject(Class<T> clazz, int oid) {
        return (T) getQuerySession().get(clazz, oid);
    }

    public <T> List<T> getList(Class<T> clazz) {
        return (List<T>) getQuerySession().createQuery(String.format("FROM %s WHERE deleted=FALSE", clazz.getSimpleName())).list();
    }


    public void save(Object o) {
        sessionFactory.getCurrentSession().saveOrUpdate(o);
    }


}