package android.modularpamipedroatividade_media;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nota1, nota_2, nota_3, nota_4, faltas;
    Button btnCalcular;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initComponents();

        btnCalcular.setOnClickListener(view ->{
            validaCampos();
            calcularMedia();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }

    private void calcularMedia() {
        double n1 = Double.parseDouble(nota1.getText().toString());
        double n2 = Double.parseDouble(nota_2.getText().toString());
        double n3 = Double.parseDouble(nota_3.getText().toString());
        double n4 = Double.parseDouble(nota_4.getText().toString());
        int falta = Integer.parseInt(faltas.getText().toString());

        double media = (n1 + n2 + n3 + n4)/4;

        if (media >=7 && falta <=20){
            txtResultado.setText("Aluno aprovado \n--media: "+media + " (minimo = 7)" + "\n--faltas: "+ falta + " (maximo = 20)");
        }else{
            txtResultado.setText("Aluno reprovado \n--media: "+ media + " (minimo = 7)" + "\n--faltas: "+ falta  + " (maximo = 20)");
        }
    }

    private void validaCampos() {
        if(TextUtils.isEmpty(nota1.getText())){
            nota1.setError("ERROR: campo vazio...");
        }else if(TextUtils.isEmpty(nota_2.getText())){
            nota_2.setError("ERROR: campo vazio...");
        }else if(TextUtils.isEmpty(nota_3.getText())){
            nota_3.setError("ERROR: campo vazio...");
        }else if(TextUtils.isEmpty(nota_4.getText())){
            nota_4.setError("ERROR: campo vazio...");
        }else if(TextUtils.isEmpty(faltas.getText())){
            faltas.setError("ERROR: campo vazio...");
        }
    }



    private void initComponents() {
        nota1 = findViewById(R.id.nota_um);
        nota_2 = findViewById(R.id.nota_dois);
        nota_3 = findViewById(R.id.nota_tres);
        nota_4 = findViewById(R.id.nota_quatro);
        faltas = findViewById(R.id.n_faltas);
        txtResultado = findViewById(R.id.txt_resultado);
        btnCalcular = findViewById(R.id.b_calcular);

    }
}