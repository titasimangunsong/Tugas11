package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {
    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",         "consectetuer", "adipiscing", "elit", "morbi", "vel",         "ligula", "vitae", "arcu", "aliquet", "mollis",         "etiam", "vel", "erat", "placerat", "ante",         "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override protected void onCreate(Bundle savedInstanceState) {     super.onCreate(savedInstanceState);     setContentView(R.layout.activity_main);

        ListView lv = (ListView)findViewById(R.id.listView);
        lv.setAdapter(new ArrayAdapter<String>(List.this,android.R.layout.simple_list_item_1,items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(List.this,"Anda memilih " + items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}