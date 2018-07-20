package com.passwordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class PlusMinusOnClick implements View.OnClickListener {

    AppCompatActivity context;

    static final Map<Integer,Integer> buttonMap = new HashMap<Integer,Integer>();

    static {
        buttonMap.put(R.id.plusButton,R.id.pwdLen);
        buttonMap.put(R.id.minusButton,R.id.pwdLen);

        buttonMap.put(R.id.plusButton1,R.id.minUp);
        buttonMap.put(R.id.minusButton1,R.id.minUp);

        buttonMap.put(R.id.plusButton2,R.id.minLo);
        buttonMap.put(R.id.minusButton2,R.id.minLo);

        buttonMap.put(R.id.plusButton3,R.id.minDi);
        buttonMap.put(R.id.minusButton3,R.id.minDi);

        buttonMap.put(R.id.plusButton4,R.id.minSy);
        buttonMap.put(R.id.minusButton4,R.id.minSy);


    }

    public PlusMinusOnClick(AppCompatActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        int txtId = buttonMap.get(v.getId());
        TextView txtView = context.findViewById(txtId);

        if(txtView.getText().toString() != null && !txtView.getText().toString().equals("")){
            int cnt = Integer.parseInt(txtView.getText().toString());
            if(((Button)v).getText().equals("+")){
                cnt++;
            }
            else{
                if(cnt>0) {
                    cnt--;
                }
            }
            txtView.setText(cnt+"");
        }
        else{
            txtView.setText("0");
        }
    }
}
