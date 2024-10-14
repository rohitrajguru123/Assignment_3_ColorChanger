package com.example.assignment_3_colorchanger;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tView1;
    TextView tView2;
    TextView tView3;
    EditText eText;
    Button btnn;

    private static final String ONE ="one";
    private static final String TWO ="two";
    private static final String THREE ="three";



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        initializeListener();
    }

    private void initializeViews() {

        tView1 = findViewById(R.id.tView1);
        tView2 = findViewById(R.id.tView2);
        tView3 = findViewById(R.id.tView3);
        eText =  findViewById(R.id.eText);
        btnn = findViewById(R.id.btnn);
    }

    private void initializeListener() {
        btnn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String input = eText.getText().toString().toLowerCase();
                        switch (input){
                            case ONE :
                                setColor(R.color.red,R.color.Green,R.color.Green);
                                break;
                            case TWO :
                                setColor(R.color.Green,R.color.red,R.color.Green);
                                break;
                            case THREE :
                                setColor(R.color.Green,R.color.Green,R.color.red);
                                break;

                            default:
                                deFoultColor();
                        }
                    }

                }
        );
    }
    private void setColor(int color1 , int color2 , int color3) {

        tView1.setBackgroundColor(getResources().getColor(color1));
        tView2.setBackgroundColor(getResources().getColor(color2));
        tView3.setBackgroundColor(getResources().getColor(color3));
    }
    private void deFoultColor() {
        tView1.setBackgroundColor(getResources().getColor(R.color.red));
        tView2.setBackgroundColor(getResources().getColor(R.color.red));
        tView3.setBackgroundColor(getResources().getColor(R.color.red));
    }
}
