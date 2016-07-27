package com.yjc.mvptest.bean;

/**
 * Created by YJC on 2016/7/17.
 */
public class UserBean {
    private String mFirstName;
    private String mLastName;
    private int id;
    public UserBean(){}
    public UserBean(int id,String mFirstName,String mLastName){
        this.id=id;
        this.mFirstName=mFirstName;
        this.mLastName=mLastName;

    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
