package android.modularpamipedroatividadeimc;

import android.app.Activity;
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class imcActivity : AppCompatActivity() {
    private lateinit var btnCalcular: Button
    private lateinit var edtPeso: EditText
    private lateinit var edtAltura: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.imc)

        initComponents()

        btnCalcular.setOnClickListener {
            if(!validate()){
                Toast.makeText(this, "os campos devem ser preenchidos e" +
                        " com valores diferentes de 0",
                Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun validate(): Boolean {
        return (edtPeso.text.toString().isNotEmpty()
                && edtAltura.text.toString().isNotEmpty()
                && !edtPeso.text.toString().startsWith("0")
                && !edtAltura.text.toString().startsWith("0"))
    }

    private fun initComponents() {
        btnCalcular = findViewById(R.id.btn_calcular)
        edtPeso = findViewById(R.id.edt_weight)
        edtAltura = findViewById(R.id.edt_height)
    }
}
