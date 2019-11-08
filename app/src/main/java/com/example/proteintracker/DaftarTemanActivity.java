package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.DaftarTmnAdapter;
import com.example.proteintracker.Model.DaftarTeman;

import java.util.ArrayList;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarTmnAdapter dafTemanAdapter;
    private ArrayList<DaftarTeman> Daftartemanarrylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        addData();

        recyclerView = findViewById(R.id.RvTeman);
        dafTemanAdapter = new DaftarTmnAdapter(Daftartemanarrylist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        recyclerView .setLayoutManager(layoutManager);
        recyclerView .setAdapter( dafTemanAdapter );
    }
    private  void addData(){
        Daftartemanarrylist =  new ArrayList<>();
        Daftartemanarrylist.add(new DaftarTeman("Adrian Paskalis","72170125","Membaca buku","Menjadi orang kaya","Menjadi terang","Laki-laki",R.drawable.adrian));
        Daftartemanarrylist.add(new DaftarTeman("Yashinta Novita Dewi","72170110","Hiking","Jadi orang kaya","Ajinomoto","Perempuan",R.drawable.shinta));
        Daftartemanarrylist.add(new DaftarTeman("Laurentia Yulia Christi","72170170","Merajut","Presiden","Harus glowing","Perempuan",R.drawable.lau));
        Daftartemanarrylist.add(new DaftarTeman("Yos Rafel Kristanto","72170092","Main game","Menjadi orang sukses","Santuy","Laki-laki",R.drawable.yos));
    }
}
