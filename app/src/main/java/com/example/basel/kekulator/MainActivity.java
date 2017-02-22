package com.example.basel.kekulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void operation(View v) {
        EditText num1 = (EditText) findViewById(R.id.editText);
        EditText num2 = (EditText) findViewById(R.id.editText2);
        TextView answerText = (TextView) findViewById(R.id.answer);

        Button b = (Button) v;
        double result = 0;
        try
        {
            if (b.getText().toString().equals("+")) {
                result = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
            } else if (b.getText().toString().equals("-")) {
                result = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
            } else if (b.getText().toString().equals("*")) {
                result = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
            } else {
                result = Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString());
            }
            answerText.setText(Double.toString(result));
        }
        catch(NumberFormatException ex)
        {
            answerText.setText("Please enter two numbers.");
        }
    }
}
