package com.example.mvp_netflix_01.presenter;

import com.example.mvp_netflix_01.contract.LoginContract;
import com.example.mvp_netflix_01.model.pojo.Film;
import com.example.mvp_netflix_01.model.pojo.User;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.Model {
    @Override
    public void login(User user) {

    }

    @Override
    public void lstFilms(Film film) {

    }

    @Override
    public void findUserWS(User user, OnLoginUserListener onLoginUserListener) {

    }

    // public void lstFilms(){}

}
