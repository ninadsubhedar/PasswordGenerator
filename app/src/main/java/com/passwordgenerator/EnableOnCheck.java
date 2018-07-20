package com.passwordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;

import java.util.HashMap;
import java.util.Map;

public class EnableOnCheck implements CompoundButton.OnCheckedChangeListener {

    AppCompatActivity context;

    static final Map<Integer,Integer[]> checkBoxMap = new HashMap<Integer,Integer[]>();

    static {
        checkBoxMap.put(R.id.upCheckBox,new Integer[]{R.id.plusButton1,R.id.minusButton1});
        checkBoxMap.put(R.id.lowCheckBox,new Integer[]{R.id.plusButton2,R.id.minusButton2});
        checkBoxMap.put(R.id.digitCheckBox,new Integer[]{R.id.plusButton3,R.id.minusButton3});
        checkBoxMap.put(R.id.symbolCheckBox,new Integer[]{R.id.plusButton4,R.id.minusButton4});

    }
    public EnableOnCheck(AppCompatActivity context) {
        this.context = context;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        Integer[] buttonIds = checkBoxMap.get(compoundButton.getId());

        for(Integer i : buttonIds){
            context.findViewById(i).setEnabled(b);
        }

    }
}
