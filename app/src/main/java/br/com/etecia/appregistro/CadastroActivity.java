package br.com.etecia.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {
    EditText campo_login, campo_senha;
    EditText campo_senha_confirmada;
    Button botao_cadastro;
    Button botao_cadastro_google, botao_cadastro_facebook, botao_cadastro_twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        campo_login = findViewById(R.id.campologinc);
        campo_senha = findViewById(R.id.camposenhac);
        campo_senha_confirmada = findViewById(R.id.camposenhacc);

        botao_cadastro = findViewById(R.id.botaocadastroc);
        botao_cadastro_google = findViewById(R.id.bcgoogle);
        botao_cadastro_facebook = findViewById(R.id.bcfacebook);
        botao_cadastro_twitter = findViewById(R.id.bctwitter);

        botao_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha, senha_confirmada;
                usuario = campo_login.getText().toString();
                senha = campo_senha.getText().toString();
                senha_confirmada = campo_senha_confirmada.getText().toString();

                if (!usuario.isEmpty()) {
                    if (!senha.isEmpty() && senha_confirmada.matches(senha)) {
                        Toast.makeText(getApplicationContext(), "Cadastro realizado! Usuário: " + usuario + "Senha: " + senha, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                        intent.putExtra("modocadastro", "default");

                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Senhas não batem! Checar...", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário está vazio! Checar...", Toast.LENGTH_LONG).show();
                    campo_login.requestFocus();
                }
            }
        });

        botao_cadastro_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int contador = 4;
                while (contador != 0) {
                    Toast.makeText(getApplicationContext(), "Cadastrando em " + contador + "segundos", Toast.LENGTH_SHORT).show();
                    contador--;
                }

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("modocadastro", "google");

                startActivity(intent);
                finish();
            }
        });

        botao_cadastro_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int contador = 4;
                while (contador != 0) {
                    Toast.makeText(getApplicationContext(), "Cadastrando em " + contador + "segundos", Toast.LENGTH_SHORT).show();
                    contador--;
                }

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("modocadastro", "facebook");

                startActivity(intent);
                finish();
            }
        });

        botao_cadastro_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int contador = 4;
                while (contador != 0) {
                    Toast.makeText(getApplicationContext(), "Cadastrando em " + contador + "segundos", Toast.LENGTH_SHORT).show();
                    contador--;
                }

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("modocadastro", "twitter");

                startActivity(intent);
                finish();
            }
        });

    }
}