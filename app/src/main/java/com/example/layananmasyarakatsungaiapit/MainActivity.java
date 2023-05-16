package com.example.layananmasyarakatsungaiapit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahkeprofil(View view) {
        Intent intent = new Intent(MainActivity.this,profil.class);
        startActivity(intent);
    }

    public void pindahkemasyarakat(View view) {
        Intent intent = new Intent(MainActivity.this,laporanmasyarakat.class);
        startActivity(intent);
    }

    public void pindahkebencana(View view) {
        Intent intent = new Intent(MainActivity.this,bencana.class);
        startActivity(intent);
    }

    public void pindahkeriwayat(View view) {
        Intent intent = new Intent(MainActivity.this,riwayat.class);
        startActivity(intent);
    }


    public void saran(View view) {
        Intent intent = new Intent(MainActivity.this,sampaikan.class);
        startActivity(intent);
    }
}