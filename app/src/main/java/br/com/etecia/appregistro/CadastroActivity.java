package br.com.etecia.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {
    EditText campologin, camposenha;
    Button botaocadastro;
    Button botaocadastrogoogle, botaocadastrofacebook, botaocadastrotwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        campologin = findViewById(R.id.campologinc);
        camposenha = findViewById(R.id.camposenhac);

        botaocadastro = findViewById(R.id.botaocadastroc);
        botaocadastrogoogle = findViewById(R.id.bcgoogle);
        botaocadastrofacebook = findViewById(R.id.bcfacebook);
        botaocadastrotwitter = findViewById(R.id.bctwitter);

        botaocadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = campologin.getText().toString();
                senha = camposenha.getText().toString();

                Toast.makeText(getApplicationContext(), "Cadastro realizado!! Usuario: "+usuario+"Senha: "+senha, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);

                startActivity(intent);
                finish();
            }
        });

        botaocadastrogoogle.setOnClickListener(new View.OnClickListener() {
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

        botaocadastrofacebook.setOnClickListener(new View.OnClickListener() {
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

        botaocadastrotwitter.setOnClickListener(new View.OnClickListener() {
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