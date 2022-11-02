package com.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvnamaPeserta, tvnomorPeserta, tvjalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnamaPeserta = findViewById(R.id.tv_output_nama);
        tvnomorPeserta = findViewById(R.id.tv_output_nomor);
        tvjalur = findViewById(R.id.tv_output_jalur_pendaftaran);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yNomor = terima.getStringExtra("xNomor");
        String yJalur = terima.getStringExtra("xJalur");

        tvnamaPeserta.setText(yNama);
        tvnomorPeserta.setText(yNomor);
        tvjalur.setText(yJalur);

    }
}