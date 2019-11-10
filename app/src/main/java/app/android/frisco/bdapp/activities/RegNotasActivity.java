package app.android.frisco.bdapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import app.android.frisco.bdapp.R;
import app.android.frisco.bdapp.clases.Notas.NoteRepository;

public class RegNotasActivity extends AppCompatActivity {

    private EditText titulo;
    private EditText contenido;
    private Button regnota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_notas);
        titulo=findViewById(R.id.titulo_input);
        contenido=findViewById(R.id.contenido_input);
        regnota=findViewById(R.id.RegNota);

        regnota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarNota();
            }
        });

    }
    public void registrarNota(){
        String tit=titulo.getText().toString();
        String conte=contenido.getText().toString();

        if(tit.isEmpty()||conte.isEmpty()){
            Toast.makeText(this, "Llene los espacios en blanco", Toast.LENGTH_SHORT).show();
            return;
        }
        NoteRepository.create(tit,conte,1);
        finish();
        }
    }