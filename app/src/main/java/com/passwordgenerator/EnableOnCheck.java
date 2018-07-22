package com.passwordgenerator;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;


class EnableOnCheck implements CompoundButton.OnCheckedChangeListener {

    private final View[] viewArr;

    EnableOnCheck(View[] viewArr) {
        this.viewArr = viewArr;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        for(View v : viewArr){
            v.setEnabled(b);

            if(v instanceof Button){
                v.performClick();
            }
        }

    }
}
