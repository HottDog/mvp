package com.yjc.mvptest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yjc.mvptest.View.IUserView;
import com.yjc.mvptest.presenter.UserPresenter;

public class MainActivity extends Activity implements IUserView{
    //component of view
    private EditText id;
    private EditText firstname;
    private EditText lastname;
    private Button du;
    private Button cun;
    //model control
    UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=(EditText)findViewById(R.id.id_et);
        firstname=(EditText)findViewById(R.id.firstname_et);
        lastname=(EditText)findViewById(R.id.lastname_et);
        du=(Button)findViewById(R.id.du);
        cun=(Button)findViewById(R.id.cun);

        userPresenter=new UserPresenter(this);
        //click event
        du.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPresenter.loadUser(getID());
            }
        });
        cun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPresenter.saveUser(getID(),getFirstName(),getLastName());
            }
        });
    }

    @Override
    public int getID() {
        return new Integer(id.getText().toString());
    }

    @Override
    public String getFirstName() {
        return firstname.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastname.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        firstname.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        lastname.setText(lastName);
    }
}
