package com.yjc.mvptest.model;

import com.yjc.mvptest.bean.UserBean;

/**
 * Created by YJC on 2016/7/17.
 */
public interface IUserModel {
    void setID(int id);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    int getID();
    UserBean load(int id);
    void saveDataIntoDB(int id,String firstname,String lastname);
}
