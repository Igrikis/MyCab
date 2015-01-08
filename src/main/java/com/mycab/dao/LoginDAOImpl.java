package com.mycab.dao;

import com.mycab.model.Login;
import com.mycab.repositories.LoginI;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class LoginDAOImpl implements LoginI{

    @Autowired
    SessionFactory sessionFactory;

    public LoginDAOImpl() {

    }

    public LoginDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Login> listLogin() {

        @SuppressWarnings("unchecked")
        List<Login> loginList = (List<Login>) sessionFactory.getCurrentSession().createCriteria(Login.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return loginList;
    }

    @Override
    public Login getLogin(int id) {

        Login login = (Login) sessionFactory.getCurrentSession().load(Login.class, id);

        return login;
    }

    @Override
    @Transactional
    public void saveLogin(Login login) {

        sessionFactory.getCurrentSession().saveOrUpdate(login);

    }

    @Override
    @Transactional
    public void deleteLogin(int id) {

        Login login = new Login();
        login.setIdLogin(id);
        sessionFactory.getCurrentSession().delete(login);

    }

    @Override
    public Login findLoginByEmail(String email) {
        return (Login) sessionFactory.getCurrentSession().load(Login.class, email);
    }
}
