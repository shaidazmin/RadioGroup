package com.example.nz.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(id);
                String string = radioButton.getText().toString();
                Toast.makeText(MainActivity.this,"You select "+string,Toast.LENGTH_SHORT).show();
        }
        });

    }
}
