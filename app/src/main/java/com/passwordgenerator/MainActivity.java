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

        findViewById(R.id.plusButton).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.pwdLen),true,true));
        findViewById(R.id.plusButton1).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minUp),true,false));
        findViewById(R.id.plusButton2).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minLo),true,false));
        findViewById(R.id.plusButton3).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minDi),true,false));
        findViewById(R.id.plusButton4).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minSy),true,false));

        findViewById(R.id.minusButton).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.pwdLen),false,true));
        findViewById(R.id.minusButton1).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minUp),false,false));
        findViewById(R.id.minusButton2).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minLo),false,false));
        findViewById(R.id.minusButton3).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minDi),false,false));
        findViewById(R.id.minusButton4).setOnClickListener(new PlusMinusOnClick((TextView)findViewById(R.id.minSy),false,false));

        ((CheckBox) findViewById(R.id.upCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton1),findViewById(R.id.minusButton1)}));
        ((CheckBox) findViewById(R.id.lowCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton2),findViewById(R.id.minusButton2)}));
        ((CheckBox) findViewById(R.id.digitCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton3),findViewById(R.id.minusButton3)}));
        ((CheckBox) findViewById(R.id.symbolCheckBox)).setOnCheckedChangeListener(new EnableOnCheck(new View[]{findViewById(R.id.plusButton4),findViewById(R.id.minusButton4),findViewById(R.id.symTxt)}));

    }




}
