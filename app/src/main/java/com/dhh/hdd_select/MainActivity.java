package com.dhh.hdd_select;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Switch simpleSwitch;
    private TextView selected_item_texView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch simpleSwitch = (Switch)findViewById((R.id.simpleSwitch));
        simpleSwitch.setChecked(true);

        Boolean switchState = simpleSwitch.isChecked();

        ListView listView = (ListView)findViewById(R.id.listView);
        selected_item_texView = (TextView)findViewById(R.id.selected_item_textView);

        List<String> list = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });

        list.add("1주일");
        list.add("2주일");
        list.add("4주일");
    }
}
