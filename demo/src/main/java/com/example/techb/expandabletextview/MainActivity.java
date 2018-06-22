package com.example.techb.expandabletextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.resizeabletextview.ReadMoreTextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

        textView.setText(getResources().getString(R.string.dummy_text));
        new ReadMoreTextView(textView, 3, "Read More", "Read less");
    }
}
