package com.example.bikram.listview0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView vi;
    String[] name={"a","b","c","d","e"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vi=(ListView)findViewById(R.id.vg);
        ArrayAdapter ad= new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,name);
       // ArrayAdapter ad = new ArrayAdapter(this,R.layout.ListView,name);
        vi.setAdapter(ad);
        vi.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
     switch(i)
     {
         case 0:
             Toast.makeText(MainActivity.this, "first", Toast.LENGTH_SHORT).show();
             break;
         case 1:
             Toast.makeText(MainActivity.this,"second",Toast.LENGTH_SHORT).show();
             break;
        

     }
    }
}
