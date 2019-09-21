package com.example.deguzman_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3, et4, et5, et6, et7, et8;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = getSharedPreferences("data",MODE_PRIVATE);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.sc1);
        et2 = findViewById(R.id.sc2);
        et3 = findViewById(R.id.sc3);
        et4 = findViewById(R.id.sc4);
        et5 = findViewById(R.id.sc5);
        et6 = findViewById(R.id.sc6);
        et7 = findViewById(R.id.sc7);
        et8 = findViewById(R.id.sc8);

    }

    public void saveData(View v){
        SharedPreferences.Editor editor = sp.edit();
        String univ1 = et1.getText().toString();
        String univ2 = et2.getText().toString();
        String univ3 = et3.getText().toString();
        String univ4 = et4.getText().toString();
        String univ5 = et5.getText().toString();
        String univ6 = et6.getText().toString();
        String univ7 = et7.getText().toString();
        String univ8 = et8.getText().toString();

        editor.putString("univ1", univ1);
        editor.putString("univ2", univ2);
        editor.putString("univ3", univ3);
        editor.putString("univ4", univ4);
        editor.putString("univ5", univ5);
        editor.putString("univ6", univ6);
        editor.putString("univ7", univ7);
        editor.putString("univ8", univ8);
        editor.commit();
        Toast.makeText(this, "Data was saved!", Toast. LENGTH_LONG).show();

    }

    public void next(View v){
        Intent i = new Intent(this, VerifySchool.class);
        startActivity(i);
    }

}
