package com.yjc.mvptest.View;

/**
 * Created by YJC on 2016/7/17.
 */
public interface IUserView {
    int getID();
    String getFirstName();
    String getLastName();
    void setFirstName(String firstName);
    void setLastName(String lastName);
}
