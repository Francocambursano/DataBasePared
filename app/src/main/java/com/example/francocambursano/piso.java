package com.example.francocambursano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class piso extends AppCompatActivity {
    private String[] tipo_piso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piso);

        tipo_piso = new String[]{"ceramico","laminado","vinilico","flotante"};

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R)
    }
}
