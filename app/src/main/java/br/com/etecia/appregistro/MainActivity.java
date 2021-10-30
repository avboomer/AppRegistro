package br.com.etecia.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String modo_login = intent.getStringExtra("modologin");

        Toast.makeText(getApplicationContext(), "Entrou com: " + modo_login, Toast.LENGTH_SHORT).show();

    }
}