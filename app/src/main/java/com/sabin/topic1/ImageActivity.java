package com.sabin.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton perman, doreamon, joker;
    private ImageView cartoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image2);

        doreamon = findViewById(R.id.rdoD);
        perman = findViewById(R.id.rdop);
        joker = findViewById(R.id.rdoj);
        cartoon = findViewById(R.id.imgcartoon);
        doreamon.setOnClickListener(this);
        perman.setOnClickListener(this);
        joker.setOnClickListener(this);

//        doreamon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.rdoD:
//                        cartoon.setImageResource(R.drawable.d);
//                        break;
//                    case R.id.rdop:
//                        cartoon.setImageResource(R.drawable.p);
//                        break;
//                    case R.id.rdoj:
//                        cartoon.setImageResource(R.drawable.joker);
//                        break;
//                }
//            }
//        });
//        perman.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.rdoD:
//                        cartoon.setImageResource(R.drawable.d);
//                        break;
//                    case R.id.rdop:
//                        cartoon.setImageResource(R.drawable.p);
//                        break;
//                    case R.id.rdoj:
//                        cartoon.setImageResource(R.drawable.joker);
//                        break;
//                }
//            }
//        });
//
//        joker.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.rdoD:
//                        cartoon.setImageResource(R.drawable.d);
//                        break;
//                    case R.id.rdop:
//                        cartoon.setImageResource(R.drawable.p);
//                        break;
//                    case R.id.rdoj:
//                        cartoon.setImageResource(R.drawable.joker);
//                        break;
//                }
//            }
//        });
    }

        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.rdoD:
                    cartoon.setImageResource(R.drawable.d);
                    break;
                case R.id.rdop:
                    cartoon.setImageResource(R.drawable.p);
                    break;
                case R.id.rdoj:
                    cartoon.setImageResource(R.drawable.joker);
                    break;
            }

        }
    }

