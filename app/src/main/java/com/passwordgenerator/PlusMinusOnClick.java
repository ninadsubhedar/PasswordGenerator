package com.passwordgenerator;

import android.view.View;
import android.widget.TextView;

import java.util.Locale;


public class PlusMinusOnClick implements View.OnClickListener {

    private TextView txtView;
    private boolean add, isMainLenTxtBox;
    private static Integer totalLen;

    PlusMinusOnClick(TextView txtView,boolean add,boolean isMainLenTxtBox) {
        this.txtView = txtView;
        this.add = add;
        this.isMainLenTxtBox = isMainLenTxtBox;
        totalLen = 0;
    }

    @Override
    public void onClick(View v) {

        if(!txtView.getText().toString().equals("")){
            Integer cnt = Integer.parseInt(txtView.getText().toString());

            if(!v.isEnabled() && !isMainLenTxtBox){
                totalLen += cnt;
                txtView.setText("0");
                return;
            }

            if(add){
                if(isMainLenTxtBox){
                    cnt++;
                    totalLen++;
                }
                else{
                    if(totalLen>0) {
                        cnt++;
                        totalLen--;
                    }
                }
            }
            else{
                if(cnt>0) {
                    if(isMainLenTxtBox){
                        if(totalLen>0) {
                            cnt--;
                            totalLen--;
                        }
                    }
                    else{
                        cnt--;
                        totalLen++;
                    }
                }
            }



            txtView.setText(String.format(Locale.ENGLISH,"%d",cnt));
        }
        else{
            txtView.setText("0");
        }
    }
}
