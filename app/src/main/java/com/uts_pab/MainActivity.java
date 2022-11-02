package com.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//deklarasi objek
    EditText etNama;
    EditText etNomor;
    Spinner spJalurPendaftaran;
    Button btPindah;
    CheckBox centang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = findViewById(R.id.et_nama);
        etNomor = findViewById(R.id.et_nomor);
        spJalurPendaftaran = findViewById(R.id.spinner);
        btPindah = findViewById(R.id.btn_pindah);
        centang = findViewById(R.id.check);

        btPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String namaPeserta = etNama.getText().toString();
                String nomorPendaftaran = etNomor.getText().toString();

                String jalur = spJalurPendaftaran.getSelectedItem().toString();

                if(namaPeserta.equals(""))
                {
                    etNama.setError("Nama Kosong Bre!!!");
                }
                else if(nomorPendaftaran.equals(""))
                {
                    etNomor.setError("Nomor Kosong Ni Gan!!!!");
                }
                else if(!centang.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Harus Diconteng", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    pindah.putExtra("xNama", namaPeserta);
                    pindah.putExtra("xNomor", nomorPendaftaran);
                    pindah.putExtra("xJalur", jalur);
                    startActivity(pindah);
                }
            }
        });
    }
}