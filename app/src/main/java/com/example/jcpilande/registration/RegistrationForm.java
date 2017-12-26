package com.example.jcpilande.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.jcpilande.registration.R.*;

public class RegistrationForm extends AppCompatActivity {
    private EditText et_name, et_email, et_password, et_cpassword;
    private String name, email, password, cpassword;
    Button regbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_registration_form);
        et_name = (EditText) findViewById(id.name);
        et_email =(EditText) findViewById(id.);
        et_password = (EditText) findViewById(id.password);
        et_cpassword = (EditText) findViewById(id.cpassword);
        regbtn = (Button) findViewById(id.regbtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
        }

    }
    public void register() {
        intialize()
    }
}
