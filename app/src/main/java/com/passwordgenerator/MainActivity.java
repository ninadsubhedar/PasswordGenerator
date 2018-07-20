package com.passwordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button genPwd = findViewById(R.id.genPwd);
        genPwd.setOnClickListener(new GenPwdOnClick(this));

        findViewById(R.id.plusButton).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.plusButton1).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.plusButton2).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.plusButton3).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.plusButton4).setOnClickListener(new PlusMinusOnClick(this));

        findViewById(R.id.minusButton).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.minusButton1).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.minusButton2).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.minusButton3).setOnClickListener(new PlusMinusOnClick(this));
        findViewById(R.id.minusButton4).setOnClickListener(new PlusMinusOnClick(this));

        ((CheckBox) findViewById(R.id.upCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(this));
        ((CheckBox) findViewById(R.id.lowCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(this));
        ((CheckBox) findViewById(R.id.digitCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(this));
        ((CheckBox) findViewById(R.id.symbolCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(this));

    }




}
