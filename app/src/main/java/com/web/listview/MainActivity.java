package com.web.listview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ListView pdfListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfListView=(ListView)findViewById(R.id.myPDFList);


        String[] pdfFiles ={"a","b","c","d","e","f","g","h","i","j","k","L","M","n","o","p","q","r","s","u","v","w","x","y","z"};

        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1
        ,pdfFiles ){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View view =super.getView(position,convertView,parent);
                TextView mytext = (TextView)view.findViewById(android.R.id.text1);
                return view;
            }
        };

pdfListView.setAdapter(adapter);
pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        String item = pdfListView.getItemAtPosition(i).toString();

        Intent start = new Intent(getApplicationContext(),PDFOpener.class);
        start.putExtra("pdfFileName",item);
        startActivity(start);
    }
});


    }
}
