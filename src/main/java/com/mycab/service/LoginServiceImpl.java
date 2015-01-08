package com.mycab.service;

import com.mycab.dao.LoginDAOImpl;
import com.mycab.model.Login;
import com.mycab.repositories.LoginI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginServiceImpl implements LoginI{

    LoginDAOImpl loginDAO;

    @Autowired
    public void setLoginDAO(LoginDAOImpl loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Override
    public List<Login> listLogin() {

        return loginDAO.listLogin();

    }

    @Override
    public Login getLogin(int id) {

        return loginDAO.getLogin(id);

    }

    @Override
    public void saveLogin(Login login) {

        loginDAO.saveLogin(login);

    }

    @Override
    public void deleteLogin(int id) {

        loginDAO.deleteLogin(id);

    }
}
