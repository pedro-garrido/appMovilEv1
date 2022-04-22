package com.example.eval1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userInput, passInput;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializar las views
        userInput = findViewById(R.id.user_login);
        passInput = findViewById(R.id.pass_login);
        submit = findViewById(R.id.btn_login);

        // evento click
        submit.setOnClickListener(v -> {
            String user = userInput.getText().toString();
            String pass = passInput.getText().toString();
            if(validarUsuarios(user, pass)){
                Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
                intentTurismo();

            }else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                intentTurismo();
            }
        });



    }

    //funcion validacion
    private boolean validarUsuarios(String user, String pass){
        return user.equals("admin") && pass.equals("admin");
    }
    //funcion intent turismo
    private void intentTurismo(){
        Intent intent = new Intent(this, turismo.class);
        startActivity(intent);

    }
}