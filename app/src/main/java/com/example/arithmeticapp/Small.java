
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

public class Small extends AppCompatActivity {

    EditText e1,e2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_small);
        e1=(EditText) findViewById(R.id.noo1);
        e2=(EditText) findViewById(R.id.noo2);
        b1=(AppCompatButton) findViewById(R.id.addd);
        b2=(AppCompatButton) findViewById(R.id.backk);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            { try {
                String nu1=e1.getText().toString();
                String nu2=e2.getText().toString();
                int n1=Integer.parseInt(nu1);
                int n2=Integer.parseInt(nu2);
                int r;
                if(n1<n2)
                {
                    r=n1;
                }
                else
                {
                    r=n2;
                }
                String result=String.valueOf(r);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
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
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });




    }
}




