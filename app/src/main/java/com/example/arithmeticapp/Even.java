
package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Even extends AppCompatActivity {

    EditText e1;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_even);
        e1=(EditText) findViewById(R.id.numb);
        b1=(AppCompatButton) findViewById(R.id.even);
        b2=(AppCompatButton) findViewById(R.id.backto);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            { try {
                String nu1=e1.getText().toString();
                int n1=Integer.parseInt(nu1);

                if(n1%2==0)
                {

                    Toast.makeText(getApplicationContext(),"even",Toast.LENGTH_LONG).show();
                }
                else
                {

                    Toast.makeText(getApplicationContext(),"odd",Toast.LENGTH_LONG).show();
                }

            }
            catch(Exception e)
            {
                Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
            }


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });




    }
}