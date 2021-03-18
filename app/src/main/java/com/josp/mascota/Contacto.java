package com.josp.mascota;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.josp.mascota.JavaMailAPI.*;

public class Contacto extends AppCompatActivity {
    public Button boton_enviar;
    public EditText mSubject;
    public EditText mEmail;
    public EditText mMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        androidx.appcompat.widget.Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mSubject = (EditText) findViewById(R.id.campo_asunto);
        mEmail = (EditText) findViewById(R.id.campo_mail);
        mMessage = (EditText) findViewById(R.id.campo_comentarios);
        boton_enviar = (Button) findViewById(R.id.boton_enviar);
        boton_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });

}

    private void sendMail() {
        String mail =  mEmail.getText().toString().trim();
        String message = mMessage.getText().toString().trim();
        String subject = mSubject.getText().toString().trim();

        //Send MAil

            JavaMailAPI JavaMailAPI = new JavaMailAPI(this, mail, subject, message);
            JavaMailAPI.execute();
    }
    }