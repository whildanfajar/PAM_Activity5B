package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomotTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

     switch (nama){
         case "Inayah":
             tvnama.setText("Inayah M");
             tvnomor.setText("0987654321");
             break;
         case "Ilham":
             tvnama.setText("Ilham");
             tvnomor.setText("0987654321");
             break;
         case "Eris":
             tvnama.setText("Eris");
             tvnomor.setText("0987654321");
             break;
         case "Fikri":
             tvnama.setText("Fikri");
             tvnomor.setText("0987654321");
             break;
         case "Maul":
             tvnama.setText("Maul");
             tvnomor.setText("0987654321");
             break;
         case "Intan":
             tvnama.setText("Intan");
             tvnomor.setText("0987654321");
             break;
         case "Vina":
             tvnama.setText("Vina");
             tvnomor.setText("0987654321");
             break;
         case "Gita":
             tvnama.setText("Gita");
             tvnomor.setText("0987654321");
             break;
         case "Lutfi":
             tvnama.setText("Lutfi");
             tvnomor.setText("0987654321");
             break;
         case "Vian":
             tvnama.setText("Vian");
             tvnomor.setText("0987654321");
             break;
     }
    }
}