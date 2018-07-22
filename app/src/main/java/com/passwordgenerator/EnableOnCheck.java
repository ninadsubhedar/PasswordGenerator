package com.passwordgenerator;

import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;


public class EnableOnCheck implements CompoundButton.OnCheckedChangeListener {

    private View[] viewArr;

    public EnableOnCheck(View[] viewArr) {
        this.viewArr = viewArr;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        for(View v : viewArr){
            v.setEnabled(b);

            if(v instanceof Button){
                ((Button)v).performClick();
            }
        }

    }
}
