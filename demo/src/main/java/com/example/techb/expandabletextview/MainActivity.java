package com.example.techb.expandabletextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.readmoretextview.ReadMoreTextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    RecyclerViewAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

        textView.setText(getResources().getString(R.string.dummy_text));

        ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        readMoreTextView.setTextView(textView);
        readMoreTextView.setMaximumLine(1);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("See More");
        readMoreTextView.setColorCode("#e74c3c");
        readMoreTextView.setReadMore();

        adapter = new RecyclerViewAdapter(this);

        recyclerView = (RecyclerView) findViewById(R.id.city_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
