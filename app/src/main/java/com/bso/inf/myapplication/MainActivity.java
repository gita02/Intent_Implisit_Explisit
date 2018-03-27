package com.bso.inf.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button var_btn_im;
    Button var_btn_ex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var_btn_im = findViewById(R.id.btn_im);
        var_btn_ex = findViewById(R.id.btn_ex);

        var_btn_im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                String urllink="https://facebook.com/";
                intent.setData(Uri.parse(urllink));
                startActivity(intent);
            }
        });
        var_btn_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),Implisit.class);
                startActivity(j);

            }
        });



    }
}
