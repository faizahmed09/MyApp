package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PraygActivity extends AppCompatActivity {

    ImageView deco,eleven,card,jwl,gif,cate;
    TextView tv,el,cr,jwll,gf,cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayg);
        deco = findViewById(R.id.imageView8);
        eleven = findViewById(R.id.imageView6);
        card = findViewById(R.id.imageView7);
        jwl = findViewById(R.id.imageView9);
        gif = findViewById(R.id.imageView12);
        cate = findViewById(R.id.imageView13);
        cat = findViewById(R.id.textView10);
        jwll = findViewById(R.id.textView8);
        cr = findViewById(R.id.textView7);
        tv = findViewById(R.id.textView6);
        el = findViewById(R.id.textView11);
        gf = findViewById(R.id.textView9);


        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PraygActivity.this, DecoratorsActivity.class));

                tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(PraygActivity.this, DecoratorsActivity.class));
                    }
                });
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PraygActivity.this, PlusElevenActivity.class));

                el.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(PraygActivity.this, PlusElevenActivity.class));
                    }
                });
            }
        });

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PraygActivity.this, CardsActivity.class));

                cr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(PraygActivity.this, CardsActivity.class));
                    }
                });
            }
        });

        jwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PraygActivity.this, JewelleryActivity.class));

                jwll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(PraygActivity.this, JewelleryActivity.class));
                    }
                });
            }
        });

        gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PraygActivity.this, GActivity.class));

                gf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(PraygActivity.this, GActivity.class));
                    }
                });
            }
        });

        cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PraygActivity.this, CateringActivity.class));

                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(PraygActivity.this, CateringActivity.class));
                    }
                });
            }
        });





    }
}

