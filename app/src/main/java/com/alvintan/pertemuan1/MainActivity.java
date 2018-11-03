package com.alvintan.pertemuan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Pendefinisian Variabel untuk Button dan EditText
    Button btnSubmit;
    EditText txUser;
    // Pendefinisian variable value dengan tipe data string
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Membuat objek Button dan EditText berdasarkan komponen yang ada di activity_main.xml
        btnSubmit = (Button)findViewById(R.id.submit);
        txUser = (EditText)findViewById(R.id.user);

        // Saat Button submit di klik maka akan
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // variabel value berfungsi untuk menampung string yang kita ambil dari EditText
                value = txUser.getText().toString();

                // Pendefinisian variabel intent dengan tujuan ke SecondActivity
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                // Mengirimkan teks yang ada di variabel value
                i.putExtra("username",value);
                // Untuk menjalankan intent
                startActivity(i);
            }
        });


    }
}
