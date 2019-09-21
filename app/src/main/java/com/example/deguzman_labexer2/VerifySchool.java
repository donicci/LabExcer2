package com.example.deguzman_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class VerifySchool extends AppCompatActivity {

    EditText scblank;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = getSharedPreferences("data",MODE_PRIVATE);
        setContentView(R.layout.verify_school);
    }

    public void verify (View v) {
        scblank = findViewById(R.id.scblank);
        String user = scblank.getText().toString();
        sp = getSharedPreferences("data", MODE_PRIVATE);
        String univ1SP = sp.getString("univ1", null);
        String univ2SP = sp.getString("univ2", null);
        String univ3SP = sp.getString("univ3", null);
        String univ4SP = sp.getString("univ4", null);
        String univ5SP = sp.getString("univ5", null);
        String univ6SP = sp.getString("univ6", null);
        String univ7SP = sp.getString("univ7", null);
        String univ8SP = sp.getString("univ8", null);
        if (user.equals(univ1SP) || user.equals(univ2SP) || user.equals(univ2SP) || user.equals(univ3SP) || user.equals(univ4SP)
                || user.equals(univ5SP) || user.equals(univ6SP) || user.equals(univ7SP) || user.equals(univ8SP)) {
            Toast.makeText(this, "School is Computing in UAAP", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "School is not part of UAAP", Toast.LENGTH_LONG).show();
        }
    }
}
