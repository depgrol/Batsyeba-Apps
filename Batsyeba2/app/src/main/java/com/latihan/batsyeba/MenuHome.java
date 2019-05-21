package com.latihan.batsyeba;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


// Tanggal Pengerjaan : 21 Mei 2019
// NIM : 10116096
// NAMA : AA SUHENDAR
// KELAS : IF-3 / AKB-3


public class MenuHome extends Fragment {


    public MenuHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_home, container, false);
    }

}
