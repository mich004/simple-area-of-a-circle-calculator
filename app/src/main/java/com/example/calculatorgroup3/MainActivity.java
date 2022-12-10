package com.example.calculatorgroup3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText radius;
    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.domathbutton);
        radius=(EditText) findViewById(R.id.radiusvalues);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        /*String name = radius.getText().toString();
                        Toast.makeText(MainActivity.this, "radius is: "+name, Toast.LENGTH_SHORT).show();
*/
                        String name = radius.getText().toString();
                        if (name.trim().equals("")) {
                            Toast.makeText(MainActivity.this, "No radius value is entered!", Toast.LENGTH_SHORT).show();

                        } else {
                            r = Integer.parseInt(radius.getText().toString());
                            double result = Math.PI * r * r;

                            String araa = Double.toString(result);

                            Toast.makeText(MainActivity.this, "Value of Area is : "+araa, Toast.LENGTH_SHORT).show();
                        }


                    }
                }
        );
    }



}