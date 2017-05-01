package com.example.qvietd.materialdesignexample.Bai3FloatLableEditText;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.qvietd.materialdesignexample.R;


public class FloatLableEditText extends AppCompatActivity {

    private EditText etUserName,etPassword;
    private TextInputLayout inputLayoutName,inputLayoutPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float_lable_edit_text);
        etUserName=(EditText)findViewById(R.id.etUsername);
        etPassword=(EditText)findViewById(R.id.etPassword);
        inputLayoutName=(TextInputLayout)findViewById(R.id.inputLayoutUsername);
        inputLayoutPass=(TextInputLayout)findViewById(R.id.inputLayoutPassword);

    }
    public  void validateAndLogin(View view){
        if (validateName() && validatePassword()) {
            Toast.makeText(this, "Oke", Toast.LENGTH_SHORT).show();
        }
    }
    private boolean validateName() {
        if (etUserName.getText().toString().isEmpty()) {
            inputLayoutName.setError("UserName bi sai");
            return false;
        } else {
            inputLayoutName.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validatePassword() {
        String pwd = etPassword.getText().toString().trim();
        if (pwd.length() < 8 ) {
            inputLayoutPass.setError("UserName bi sai");
            return false;
        } else {
            inputLayoutPass.setErrorEnabled(false);
            return true;
        }
    }
}
