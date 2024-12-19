package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    Button btnTopla , btnCikar , btnCarp , btnBol;
    TextView tvSonuc;
    EditText sayi1,sayi2;

    float etSayi1=0,etSayi2=0 , sonuc=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnTopla=findViewById(R.id.btnTopla);
        btnCikar=findViewById(R.id.btnCikar);
        btnCarp=findViewById(R.id.btnCarp);
        btnBol=findViewById(R.id.btnBol);
        tvSonuc=findViewById(R.id.tvSonuc);
        sayi1=findViewById(R.id.etSayi1);
        sayi2=findViewById(R.id.etSayi2);
    }
    public void toplama(View view){
        etSayi1=Float.parseFloat(sayi1.getText().toString());
        etSayi2=Float.parseFloat(sayi2.getText().toString());
        sonuc=etSayi1 + etSayi2;
        String strSonuc = String.valueOf(sonuc);
        tvSonuc.setText("Sonuç: " + strSonuc);
    }
    public void cikarma(View view){
        etSayi1=Float.parseFloat(sayi1.getText().toString());
        etSayi2=Float.parseFloat(sayi2.getText().toString());
        sonuc=etSayi1 - etSayi2;
        String strSonuc = String.valueOf(sonuc);
        tvSonuc.setText("Sonuç: " + strSonuc);
    }
    public void carpma(View view){
        etSayi1=Float.parseFloat(sayi1.getText().toString());
        etSayi2=Float.parseFloat(sayi2.getText().toString());
        sonuc=etSayi1 * etSayi2;
        String strSonuc = String.valueOf(sonuc);
        tvSonuc.setText("Sonuç: " + strSonuc);
    }
    public void bolme(View view){
        etSayi1=Float.parseFloat(sayi1.getText().toString());
        etSayi2=Float.parseFloat(sayi2.getText().toString());
        sonuc=etSayi1 / etSayi2;
        String strSonuc = String.valueOf(sonuc);
        tvSonuc.setText("Sonuç: " + strSonuc);
    }
}