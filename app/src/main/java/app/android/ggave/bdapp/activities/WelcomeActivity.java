package app.android.ggave.bdapp.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import app.android.frisco.bdapp.R;
import app.android.ggave.bdapp.clases.Usuarios.User;
import app.android.ggave.bdapp.clases.Usuarios.UserRepository;

public class WelcomeActivity extends AppCompatActivity {

    private static final int REGISTER_FORM_REQUEST = 100;
    private RecyclerView notasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        notasView=findViewById(R.id.note_list);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String username = sp.getString("username", null);
        User user = UserRepository.findByUsername(username);
    }

    // Mensaje de retorno
    public void callRegisterForm(View view){
        startActivityForResult(new Intent(this, RegNotasActivity.class),REGISTER_FORM_REQUEST);
    }

}
