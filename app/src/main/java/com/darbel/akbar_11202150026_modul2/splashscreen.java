package com.darbel.akbar_11202150026_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Toast.makeText(splashscreen.this,"LOLLY ASRI W - 1202150273",Toast.LENGTH_LONG).show(); //menampilkan isi pesan toast
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class)); //menunjukkan kelas berikutnya setelah splash
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}
