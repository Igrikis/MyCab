package com.mycab.repositories;

import com.mycab.model.Login;

import java.util.List;

public interface LoginI {

    public List<Login> listLogin();

    public Login getLogin (int id);

    public void saveLogin (Login login);

    public void deleteLogin (int id);

}
