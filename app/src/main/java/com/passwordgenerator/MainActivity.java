package com.passwordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String upper_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower_char = "abcdefghijklmnopqrstuvwxyz";
    private static final String special_char = "!@#$%^&*._?|";
    private static final String digits = "0123456789";

    int pwdLen, minUpper, minLower, minDigits, minSpecial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button genPwd = findViewById(R.id.genPwd);
        genPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView pwdTxt = findViewById(R.id.pwdTxt);
                TextView pwdLenTxt = findViewById(R.id.pwdLen);
                TextView minU = findViewById(R.id.minUpper);
                TextView minL = findViewById(R.id.minLower);
                TextView minD = findViewById(R.id.minDigits);
                TextView minS = findViewById(R.id.minSpecial);
                pwdLen = 0;
                if(pwdLenTxt.getText().toString() != null && !pwdLenTxt.getText().toString().equals("")){
                    pwdLen=minUpper=minLower=minDigits=minSpecial=0;

                    pwdLen = Integer.parseInt(pwdLenTxt.getText().toString());

                    if(minU.getText().toString() != null && !minU.getText().toString().equals("")) {
                        minUpper = Integer.parseInt(minU.getText().toString());
                    }
                    if(minL.getText().toString() != null && !minL.getText().toString().equals("")) {
                        minLower = Integer.parseInt(minL.getText().toString());
                    }
                    if(minD.getText().toString() != null && !minD.getText().toString().equals("")) {
                        minDigits = Integer.parseInt(minD.getText().toString());
                    }
                    if(minS.getText().toString() != null && !minS.getText().toString().equals("")) {
                        minSpecial = Integer.parseInt(minS.getText().toString());
                    }
                    pwdTxt.setText(getPwd());
                }
                else{
                    pwdLenTxt.setError("Required");
                    pwdTxt.setText("");
                }

            }
        });
    }

    private String getPwd(){

        String charSet = upper_char+lower_char+special_char+digits;
        Random r = new Random();
        List<String> list = new ArrayList<String>();

        for(int i =0;i<minUpper;i++){
            list.add(upper_char.charAt(r.nextInt(upper_char.length()))+"");
        }
        for(int i =0;i<minLower;i++){
            list.add(lower_char.charAt(r.nextInt(lower_char.length()))+"");
        }
        for(int i =0;i<minSpecial;i++){
            list.add(special_char.charAt(r.nextInt(special_char.length()))+"");
        }
        for(int i =0;i<minDigits;i++){
            list.add(digits.charAt(r.nextInt(digits.length()))+"");
        }

        for(int i=list.size();i<pwdLen;i++){
            list.add(charSet.charAt(r.nextInt(charSet.length()))+"");
        }
        Collections.shuffle(list);

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<list.size();i++){
            builder.append(list.get(i));
        }
        return builder.toString();
    }
}
