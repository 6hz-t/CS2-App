package com.example.cstore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login_activity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        sharedPreferences = getSharedPreferences("login_prefs", Context.MODE_PRIVATE);

        // 检查是否已登录
        if (sharedPreferences.getBoolean("is_logged_in", false)) {
            // 已登录，跳转到主界面
            goToMainActivity();
        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (validateLogin(username, password)) {
                    // 登录成功，记录登录状态
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("is_logged_in", true);
                    editor.apply();

                    Toast.makeText(Login_activity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    goToMainActivity();
                } else {
                    Toast.makeText(Login_activity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateLogin(String username, String password) {
        // 这里简单模拟验证，实际应用中应从数据库或服务器验证


        return true;
        //return "admin".equals(username) && "123456".equals(password);
    }

    private void goToMainActivity() {
        Intent intent = new Intent(Login_activity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}