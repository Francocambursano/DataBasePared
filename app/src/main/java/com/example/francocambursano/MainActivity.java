package com.example.francocambursano;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button btnpiso;
    Button btnmaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpiso = (Button) findViewById(R.id.btn1);
        btnpiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { clic();}
            });
        };
        public void clic(){
            Intent piso = new Intent(this, piso.class );
            startActivity(piso);
        }
}

