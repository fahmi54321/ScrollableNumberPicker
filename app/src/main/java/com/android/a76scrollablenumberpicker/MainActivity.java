package com.android.a76scrollablenumberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.michaelmuenzer.android.scrollablennumberpicker.ScrollableNumberPicker;

public class MainActivity extends AppCompatActivity {

    Button btnShow;
    ScrollableNumberPicker scrollableNumberPickerVertical, scrollableNumberPickerHorizotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollableNumberPickerHorizotal = (ScrollableNumberPicker) findViewById(R.id.scroll_horizontal);
        scrollableNumberPickerVertical = (ScrollableNumberPicker) findViewById(R.id.scroll_vertikal);
        btnShow = (Button) findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        MainActivity.this,
                        String.format(
                                "Value 1 %d Value 2 %d",
                                scrollableNumberPickerHorizotal.getValue(),
                                scrollableNumberPickerVertical.getValue()),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}