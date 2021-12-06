package com.fisei.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceraActivity extends AppCompatActivity {
private Button btn_mostrar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);



    }
    public void ClicMostrarActivity(View view) {
        //mostar una actividad
        Intent intent = new Intent(this, TerceraActivity.class);
        this.startActivity(intent);
    }
}