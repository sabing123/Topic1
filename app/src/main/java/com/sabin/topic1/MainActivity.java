package com.sabin.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etfirstnum, etsecondnum;
    private Button btncalculate;
    private RadioButton rdosum, rdosub, rdomulti, rdodivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //binding

        etfirstnum = findViewById(R.id.etfirstnum);
        etsecondnum = findViewById(R.id.etsecondnum);
        btncalculate = findViewById(R.id.btncalculate);
        rdosum = findViewById(R.id.rdosum);
        rdosub = findViewById(R.id.rdosubtract);
        rdomulti = findViewById(R.id.rdomultiply);
        rdodivide = findViewById(R.id.rdodivide);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first, second, cal;
                first = Integer.parseInt(etfirstnum.getText().toString());
                second = Integer.parseInt(etsecondnum.getText().toString());

                if (rdosum.isChecked()) {
                    cal = first + second;
                }
                else if (rdosub.isChecked()){
                    cal = first-second;
                }
                else if (rdomulti.isChecked()) {
                    cal = first * second;
                }
                else {
                    cal = first / second;
                }
                Toast.makeText(MainActivity.this, "Result is : " + cal, Toast.LENGTH_LONG).show();

            }
        });

    }
}
