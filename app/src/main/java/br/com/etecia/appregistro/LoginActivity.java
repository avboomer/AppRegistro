package br.com.etecia.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText campologin, camposenha;
    Button botaologin, botaocadastro;
    Button botaologingoogle, botaologinfacebook, botaologintwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        final String modo_cadastro = intent.getStringExtra("modologin");

        Toast.makeText(getApplicationContext(), "Cadastrou usuário com: " + modo_cadastro, Toast.LENGTH_SHORT).show();

        campologin = findViewById(R.id.campologin);
        camposenha = findViewById(R.id.camposenha);

        botaologin = findViewById(R.id.botaologin);
        botaocadastro = findViewById(R.id.botaocadastro);
        botaologingoogle = findViewById(R.id.blgoogle);
        botaologinfacebook = findViewById(R.id.blfacebook);
        botaologintwitter = findViewById(R.id.bltwitter);

        botaologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = campologin.getText().toString();
                senha = camposenha.getText().toString();
                if (usuario.equals("abelhinha") && senha.equals("123456789")) {
                    Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("modologin", "default");

                    startActivity(intent);
                    finish();
                } else {

                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!!!", Toast.LENGTH_SHORT).show();
                    campologin.setText("");
                    camposenha.setText("");
                    campologin.requestFocus();

                }
            }
        });

        botaologingoogle.setOnClickListener(new View.OnClickListener() {
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

        botaologinfacebook.setOnClickListener(new View.OnClickListener() {
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

        botaologintwitter.setOnClickListener(new View.OnClickListener() {
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

        botaocadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);

                startActivity(intent);
                finish();
            }
        });

    }

}