package com.passwordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button genPwd = findViewById(R.id.genPwd);
        genPwd.setOnClickListener(new GenPwdOnClick(this));

        findViewById(R.id.plusButton).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.pwdLen),true));
        findViewById(R.id.plusButton1).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minUp),true));
        findViewById(R.id.plusButton2).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minLo),true));
        findViewById(R.id.plusButton3).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minDi),true));
        findViewById(R.id.plusButton4).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minSy),true));

        findViewById(R.id.minusButton).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.pwdLen),false));
        findViewById(R.id.minusButton1).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minUp),false));
        findViewById(R.id.minusButton2).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minLo),false));
        findViewById(R.id.minusButton3).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minDi),false));
        findViewById(R.id.minusButton4).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minSy),false));

        ((CheckBox) findViewById(R.id.upCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton1),findViewById(R.id.minusButton1),findViewById(R.id.minUp)}));
        ((CheckBox) findViewById(R.id.lowCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton2),findViewById(R.id.minusButton2),findViewById(R.id.minLo)}));
        ((CheckBox) findViewById(R.id.digitCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton3),findViewById(R.id.minusButton3),findViewById(R.id.minDi)}));
        ((CheckBox) findViewById(R.id.symbolCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton4),findViewById(R.id.minusButton4),findViewById(R.id.minSy),findViewById(R.id.symTxt)}));

    }




}
