package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class KanpurActivity extends AppCompatActivity {

    ImageView eleven,deco,card,jwel,gifts,cate;
    TextView el,dec,cd,jwl,gif,cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanpur);
        eleven = findViewById(R.id.imageView6);
        deco = findViewById(R.id.imageView8);
        card = findViewById(R.id.imageView7);
        jwel = findViewById(R.id.imageView9);
        gifts = findViewById(R.id.imageView12);
        cate = findViewById(R.id.imageView13);
        cat = findViewById(R.id.textView10);
        gif = findViewById(R.id.textView9);
        jwl = findViewById(R.id.textView8);
        cd = findViewById(R.id.textView7);
        dec = findViewById(R.id.textView6);
        el = findViewById(R.id.textView11);

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KanpurActivity.this, pluselevenKActivity.class));

                el.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(KanpurActivity.this, pluselevenKActivity.class));
                    }
                });
            }
        });

        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KanpurActivity.this, KDecoratorsActivity.class));

                dec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(KanpurActivity.this, KDecoratorsActivity.class));
                    }
                });
            }
        });

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KanpurActivity.this, KCardActivity.class));

                el.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(KanpurActivity.this, KCardActivity.class));
                    }
                });
            }
        });

        jwel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KanpurActivity.this, KJwelleryActivity.class));

                jwl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(KanpurActivity.this, KJwelleryActivity.class));
                    }
                });
            }
        });

        gifts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KanpurActivity.this, KGiftsActivity.class));

                gif.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(KanpurActivity.this, KGiftsActivity.class));
                    }
                });
            }
        });

        cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KanpurActivity.this, KCateringActivity.class));

                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(KanpurActivity.this, KCateringActivity.class));
                    }
                });
            }
        });
    }
}