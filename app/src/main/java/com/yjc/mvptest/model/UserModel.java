package com.yjc.mvptest.model;

import android.content.ContentValues;
import android.util.Log;

import com.yjc.mvptest.bean.UserBean;
import com.yjc.mvptest.db.DBinstance;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by YJC on 2016/7/17.
 */
public class UserModel implements IUserModel{
    private ArrayList<UserBean> userBeans;
    private UserBean userBean;
    public UserModel(){
        userBean =new UserBean();
        userBeans=new ArrayList<>();
        UserBean userBean_temp=new UserBean(1,"yuan","jiangchao");
        UserBean userBean_temp1=new UserBean(2,"yang","wawa");
        userBeans.add(userBean_temp);
        userBeans.add(userBean_temp1);
    }
    @Override
    public void setID(int id) {
        userBean.setId(id);
    }

    @Override
    public void setFirstName(String firstName) {
        userBean.setmFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        userBean.setmLastName(lastName);
    }

    @Override
    public int getID() {
        return userBean.getId();
    }

    @Override
    public UserBean load(int id) {
        Iterator it=userBeans.iterator();
        while(it.hasNext()){
            UserBean userBean1=(UserBean) it.next();
            if(userBean1.getId()==id){
                return userBean1;
            }
        }
        return null;
    }

    @Override
    public void saveDataIntoDB(int id, String firstname, String lastname) {
        ContentValues cv=new ContentValues();
        cv.put("userid",id);
        cv.put("firstname",firstname);
        cv.put("lastname",lastname);
        DBinstance.getInstance().getWritableDatabase().insert("user","firstname",cv);
        if(DBinstance.getInstance()==null){
            Log.i("有数据库","yse");
        }
    }
}
