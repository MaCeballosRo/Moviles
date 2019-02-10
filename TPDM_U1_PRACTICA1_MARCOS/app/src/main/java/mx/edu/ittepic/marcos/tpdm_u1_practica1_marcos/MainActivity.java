package mx.edu.ittepic.marcos.tpdm_u1_practica1_marcos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Declaración de variables
    EditText textoEntrada;
    TextView mensaje;
    Button btn;
    ToggleButton btnT;
    CheckBox conf;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlace con XML
        textoEntrada = findViewById(R.id.texto_entrada);
        mensaje = findViewById(R.id.texto_salida);
        btn = findViewById(R.id.boton);
        btnT = findViewById(R.id.boton2);
        conf = findViewById(R.id.confirmacion);
        img = findViewById(R.id.imagen);
    }

    public void mensajeBoton(View v){
        if(conf.isChecked()){
            String texto = textoEntrada.getText().toString();
            if(texto.equals("")){
                Toast.makeText(this, "Escriba algún mensaje",Toast.LENGTH_LONG).show();
            }else{
                mensaje.setText(texto);
            }

        }else{
            Toast.makeText(this,"Debe seleccionar el checkBox",Toast.LENGTH_LONG).show();
        }
    }

    public void notificacionCheck (View v){
        if(conf.isChecked()){
            Toast.makeText(this, "Gracias por seleccionarme",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "¿Por qué? Seleccióname",Toast.LENGTH_LONG).show();
        }
    }

    public void MostrarImg(View v){
        if(btnT.isChecked()){
            img.setImageResource(R.drawable.itt_escudo);
        }else{
            img.setImageResource(0);
        }
    }
}
