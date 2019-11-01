package com.example.activitypagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPage1 extends AppCompatActivity {
    private Button gotoPage_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        gotoPage_B =(Button)findViewById(R.id.button_gotoPageB);
        gotoPage_B.setOnClickListener(gotoPage_BOnClick);
    }

    private View.OnClickListener gotoPage_BOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it = new Intent();
            it.setClass(ActivityPage1.this, ActivityPage2.class);
            startActivity(it);
        }
    };
}


