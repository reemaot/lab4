package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] sushi={"Classic California","Salmon Emperor","California Tempura","Sushi site"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main, R.id.icon, sushi));
    }


    protected void onListItemClick(ListView listView, View view, int position, long id){
        super.onListItemClick(listView, view, position, id);

        switch(position){
            case 0: startActivity(new Intent(MainActivity.this, Item1.class)); break;
            case 1: startActivity(new Intent(MainActivity.this, Item2.class)); break;
            case 2: startActivity(new Intent(MainActivity.this, item3.class)); break;
            case 3: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://tokyoarabia.com"))); break;
        }
    }
}