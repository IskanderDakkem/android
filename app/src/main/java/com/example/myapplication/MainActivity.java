package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        signInBTN= (Button) findViewById(R.id.signinBTN);

        signInBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName =(EditText) findViewById(R.id.username);
                userPassword = (EditText) findViewById(R.id.password);
                String userNameValue = (String) userName.getText().toString();
                String userPasswordValue = (String) userPassword.getText().toString();
                TextView userNameField=(TextView) findViewById(R.id.showUserName);
                userNameField.setText(userNameValue);

                TextView errorInputUserName=(TextView) findViewById(R.id.userInputErrors);
                TextView errorInputPassword = (TextView) findViewById(R.id.inputErrorsPassword);
                if(userNameValue.matches("")){
                    errorInputUserName.setText("This field is required");
                }else{
                    errorInputUserName.setText("");
                    errorInputUserName.setVisibility(View.INVISIBLE);
                }
                if(userPasswordValue.matches("")){
                    errorInputPassword.setText("This field is required");
                }else{
                    errorInputPassword.setText("");
                    errorInputPassword.setVisibility(View.INVISIBLE);
                }
                Intent Acitivity3= new Intent(MainActivity.this,Acitvity3.class);
                startActivity(Acitivity3);
            }

        });




    }
}