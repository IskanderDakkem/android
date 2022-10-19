package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText userName;
    private EditText userPassword;
    private Button signInBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        userName =(EditText) findViewById(R.id.username);
        userPassword = (EditText) findViewById(R.id.password);
        signInBTN= (Button) findViewById(R.id.signinBTN);

        String userNameValue = (String) userName.getText().toString();
        String userPasswordValue = (String) userPassword.getText().toString();





    }
}