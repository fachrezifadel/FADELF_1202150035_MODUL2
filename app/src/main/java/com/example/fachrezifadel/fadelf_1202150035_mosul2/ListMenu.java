package com.example.fachrezifadel.fadelf_1202150035_mosul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<PilihMenu> listmenu;
    //membuat yang untuk dipanggil

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new PilihMenu(R.drawable.indomie, "Indomie Goreng", 2500, "Mie, Bumbu, Bawang Goreng"));
        listmenu.add(new PilihMenu(R.drawable.nasgor, "Nasi Goreng", 40000, "Nasi, Bumbu Rahasia, Sayuran, Telur"));
        listmenu.add(new PilihMenu(R.drawable.nasipad, "Nasi Padang", 60000, "Nasi, Lauk, sayuran, Kerupuk, Kuah Nikmat"));
        listmenu.add(new PilihMenu(R.drawable.sate, "Sate Madura", 35000, "Daging, Kecap, Bumbu Kacang, Nasi jika dibutuhkan"));
        listmenu.add(new PilihMenu(R.drawable.rendang, "Rendang", 50000, "Daging dengan bumbu khas Bunda"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
        //detail saat menampilakan detail makanan
    }
}
