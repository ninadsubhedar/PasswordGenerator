package com.passwordgenerator;

import android.view.View;
import android.widget.TextView;

import java.util.Locale;


public class PlusMinusOnClick implements View.OnClickListener {

    private TextView txtView;
    private boolean add;

    PlusMinusOnClick(TextView txtView,boolean add) {
        this.txtView = txtView;
        this.add = add;
    }

    @Override
    public void onClick(View v) {

        if(!txtView.getText().toString().equals("")){
            Integer cnt = Integer.parseInt(txtView.getText().toString());
            if(add){
                cnt++;
            }
            else{
                if(cnt>0) {
                    cnt--;
                }
            }
            txtView.setText(String.format(Locale.ENGLISH,"%d",cnt));
        }
        else{
            txtView.setText("0");
        }
    }
}
