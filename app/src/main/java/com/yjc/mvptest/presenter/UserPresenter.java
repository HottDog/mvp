package com.yjc.mvptest.presenter;

import com.yjc.mvptest.View.IUserView;
import com.yjc.mvptest.bean.UserBean;
import com.yjc.mvptest.model.IUserModel;
import com.yjc.mvptest.model.UserModel;

/**
 * Created by YJC on 2016/7/17.
 */
public class UserPresenter {
    private IUserView userView;
    private IUserModel userModel;

    public UserPresenter(IUserView view){
        userView=view;
        userModel=new UserModel() ;
    }
    public void saveUser(int id,String firstName,String lastName){
        userModel.setID(id);
        userModel.setFirstName(firstName);
        userModel.setLastName(lastName);
        userModel.saveDataIntoDB(id,firstName,lastName);
    }
    public void loadUser(int id){
        UserBean user=userModel.load(id);
        if(user!=null) {
            userView.setFirstName(user.getmFirstName());
            userView.setLastName(user.getmLastName());
        }
    }

}
