package com.example.hacktiv8_latihan4javaberkurang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText angka1, angka2, output;
    double param1, param2, hasil;
    Button count, kurang, persen, bagi, akar, bersih;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

    public void konversi(){
        if(isEmpty((angka1))){
            param1 = 0;
        }else{
            param1 = Double.parseDouble(angka1.getText().toString());
        }
        if (isEmpty((angka2))) {
            param2 = 0;
        }else{
            param2 = Double.parseDouble(angka2.getText().toString());
        }
    }
    public void addListenerOnButtonClick() {
        count=(Button)findViewById(R.id.btnTambah);
        kurang=(Button)findViewById(R.id.btnKurang);
        persen=(Button)findViewById(R.id.btnPersen);
        bagi=(Button)findViewById(R.id.btnBagi);
        akar=(Button)findViewById(R.id.btnAkar);
        bersih=(Button)findViewById(R.id.btnBersih);
        angka1=(EditText)findViewById(R.id.edtHitung1);
        angka2=(EditText)findViewById(R.id.edtHitung2);
        output=(EditText)findViewById(R.id.edtHasil);

        count.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                konversi();
                hasil = param1+param2;
                output.setText(Double.toString(hasil));
            }
        });
        kurang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                konversi();
                hasil = param1-param2;
                output.setText(Double.toString(hasil));
            }
        });
        persen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                konversi();
                hasil = (param1/param2)*100;
                output.setText(Double.toString(hasil)+ "%");
            }
        });
        bagi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                konversi();
                hasil = param1/param2;
                output.setText(Double.toString(hasil));
            }
        });
        akar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                konversi();
                hasil=(param1+param2)*(param1+param2);
                output.setText(Double.toString(hasil));
            }
        });
        bersih.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                hasil = 0;
                output.setText(Double.toString(hasil));
            }
        });
    }
}
