package com.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ArrayList<String> arrayJalurPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);

        arrayJalurPendaftaran = new ArrayList<>();
        arrayJalurPendaftaran.add("Tes Tertulis");
        arrayJalurPendaftaran.add("Jalur Tanpa Tes");
        arrayJalurPendaftaran.add("Ujian Saringan Masuk");

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.jalur_pendaftaran, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void OnNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}