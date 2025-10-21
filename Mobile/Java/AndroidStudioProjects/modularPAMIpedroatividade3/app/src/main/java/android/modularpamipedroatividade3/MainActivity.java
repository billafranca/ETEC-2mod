package android.modularpamipedroatividade3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nome, email, senha;
    Button btnCadastrar;


    private static final String PREFS_NAME = "CadastroPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initComponents();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        btnCadastrar.setOnClickListener(view -> {
            String nomeText = nome.getText().toString();
            String emailText = email.getText().toString();
            String senhaText = senha.getText().toString();

            if (nomeText.isEmpty() || emailText.isEmpty() || senhaText.isEmpty()) {
                Toast.makeText(MainActivity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                return;
            }


            SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();

            editor.putString("nome", nomeText);
            editor.putString("email", emailText);
            editor.putString("senha", senhaText);

            editor.apply();

            Toast.makeText(MainActivity.this, "Cadastro salvo com sucesso!", Toast.LENGTH_SHORT).show();


            nome.setText("");
            email.setText("");
            senha.setText("");
        });
    }

    private void initComponents() {
        nome = findViewById(R.id.edt_nome);
        email = findViewById(R.id.edt_email);
        senha = findViewById(R.id.edt_senha);
        btnCadastrar = findViewById(R.id.btn_cadastrar);
    }
}
