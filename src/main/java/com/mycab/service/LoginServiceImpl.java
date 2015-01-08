package com.mycab.service;

import com.mycab.dao.LoginDAOImpl;
import com.mycab.model.Login;
import com.mycab.repositories.LoginI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginI{
    @Autowired
    LoginDAOImpl loginDAO;

    @Override
    @Transactional
    public List<Login> listLogin() {

        return loginDAO.listLogin();

    }

    @Override
    @Transactional
    public Login getLogin(int id) {

        return loginDAO.getLogin(id);

    }

    @Override
    @Transactional
    public void saveLogin(Login login) {

        loginDAO.saveLogin(login);

    }

    @Override
    @Transactional
    public void deleteLogin(int id) {

        loginDAO.deleteLogin(id);

    }

    @Override
    @Transactional
    public Login findLoginByEmail(String email) {
        return loginDAO.findLoginByEmail(email);
    }
}
