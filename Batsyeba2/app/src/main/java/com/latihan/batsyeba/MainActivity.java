package com.latihan.batsyeba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// Tanggal Pengerjaan : 21 Mei 2019
// NIM : 10116096
// NAMA : AA SUHENDAR
// KELAS : IF-3 / AKB-3

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private Button button;
    private int[] layouts = {R.layout.fragment_halaman_satu, R.layout.fragment_halaman_dua, R.layout.fragment_halaman_tiga};
    private Adaptor mpagerAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdaptor = new Adaptor(layouts, this);
        pager.setAdapter(mpagerAdaptor);






    }
    public void next(View view){
        Intent in = new Intent(this, Menu.class);
        startActivity(in);

    }




}
