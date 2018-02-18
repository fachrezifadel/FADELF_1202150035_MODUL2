package com.example.fachrezifadel.fadelf_1202150035_mosul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    ImageView foto;
    TextView nama, harga, komposisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        setTitle("Detail Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        foto = findViewById(R.id.gambarr);
        nama = findViewById(R.id.detailnama);
        komposisi = findViewById(R.id.detailkomposisi);
        harga = findViewById(R.id.detailharga);

        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
        nama.setText(getIntent().getStringExtra("nama"));
        foto.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));
    }
}