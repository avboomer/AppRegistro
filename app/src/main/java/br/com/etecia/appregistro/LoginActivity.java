package br.com.etecia.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText campo_login, campo_senha;

    Button botao_login, botao_cadastro;
    Button botao_login_google, botao_login_facebook, botao_login_twitter;

    String modo_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        try {
            Intent intent = getIntent();
            modo_cadastro = intent.getStringExtra("modocadastro");
            Toast.makeText(getApplicationContext(), "Cadastrou usuário com: " + modo_cadastro, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }

        campo_login = findViewById(R.id.campologin);
        campo_senha = findViewById(R.id.camposenha);

        botao_login = findViewById(R.id.botaologin);
        botao_cadastro = findViewById(R.id.botaocadastro);
        botao_login_google = findViewById(R.id.blgoogle);
        botao_login_facebook = findViewById(R.id.blfacebook);
        botao_login_twitter = findViewById(R.id.bltwitter);

        botao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = campo_login.getText().toString();
                senha = campo_senha.getText().toString();
                if (usuario.equals("abelhinha") && senha.equals("123456789")) {
                    Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("modologin", "default");

                    startActivity(intent);
                    finish();
                } else {

                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Dica: este app é apenas uma simulação, tente \"abelhinha\" e \"123456789\"", Toast.LENGTH_SHORT).show();
                    campo_login.setText("");
                    campo_senha.setText("");
                    campo_login.requestFocus();

                }
            }
        });

        botao_login_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modo_cadastro.equals("google")) {
                    int contador = 4;
                    while (contador != 0) {
                        Toast.makeText(getApplicationContext(), "Logando em " + contador + "segundos", Toast.LENGTH_SHORT).show();
                        contador--;
                    }
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("modologin", "google");

                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário não se cadastrou nesse modo", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botao_login_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modo_cadastro.equals("facebook")) {
                    int contador = 4;
                    while (contador != 0) {
                        Toast.makeText(getApplicationContext(), "Logando em " + contador + "segundos", Toast.LENGTH_SHORT).show();
                        contador--;
                    }
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("modologin", "facebook");

                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário não se cadastrou nesse modo", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botao_login_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modo_cadastro.equals("twitter")) {
                    int contador = 4;
                    while (contador != 0) {
                        Toast.makeText(getApplicationContext(), "Logando em " + contador + "segundos", Toast.LENGTH_SHORT).show();
                        contador--;
                    }
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("modologin", "twitter");

                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário não se cadastrou nesse modo", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botao_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);

                startActivity(intent);
                finish();
            }
        });

    }

}