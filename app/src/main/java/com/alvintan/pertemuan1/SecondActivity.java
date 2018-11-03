package com.alvintan.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // Pendefinisian Variabel untuk TextView dan value
    TextView txUser;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Membuat objek TextView berdasarkan komponen yang ada di activity_second.xml
        txUser = (TextView)findViewById(R.id.tv_nama);

        // Mengambil string yang dikirim ke activity ini dan ditampung dalam variabel value
        value = getIntent().getStringExtra("username");
        // Menampilkan teks yang ada di variabel value ke textview
        txUser.setText(value);
    }

}
