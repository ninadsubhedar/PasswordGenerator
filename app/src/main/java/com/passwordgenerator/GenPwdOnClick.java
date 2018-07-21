package com.passwordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenPwdOnClick implements View.OnClickListener {

    private AppCompatActivity context;
    private static String upChar,lowChar,digits,symbols,charSet,special_char;
    private int pwdLen, minUpper, minLower, minDigits, minSpecial;


    GenPwdOnClick(AppCompatActivity context) {
        this.context = context;
        upChar = context.getResources().getString(R.string.upperCaseCharacters);
        lowChar = context.getResources().getString(R.string.lowerCaseCharacters);
        digits = context.getResources().getString(R.string.digits);
        symbols = context.getResources().getString(R.string.symbols);
    }
    @Override
    public void onClick(View view) {
        {
            TextView pwdTxt = context.findViewById(R.id.pwdTxt);
            TextView pwdLenTxt = context.findViewById(R.id.pwdLen);
            TextView minU = context.findViewById(R.id.minUp);
            TextView minL = context.findViewById(R.id.minLo);
            TextView minD = context.findViewById(R.id.minDi);
            TextView minS = context.findViewById(R.id.minSy);
            TextView sym = context.findViewById(R.id.symTxt);

            minUpper=minLower=minDigits=minSpecial=0;
            charSet = "";

            pwdLen = Integer.parseInt(pwdLenTxt.getText().toString());

            if(((CheckBox)context.findViewById(R.id.upCheckBox)).isChecked()) {
                minUpper = Integer.parseInt(minU.getText().toString());
                charSet += upChar;
            }
            if(((CheckBox)context.findViewById(R.id.lowCheckBox)).isChecked()) {
                minLower = Integer.parseInt(minL.getText().toString());
                charSet += lowChar;
            }
            if(((CheckBox)context.findViewById(R.id.digitCheckBox)).isChecked()) {
                minDigits = Integer.parseInt(minD.getText().toString());
                charSet += digits;
            }
            if(((CheckBox)context.findViewById(R.id.symbolCheckBox)).isChecked()) {
                minSpecial = Integer.parseInt(minS.getText().toString());
                special_char = sym.getText().toString();
                charSet = charSet+special_char;
            }

            if(charSet.equals("")){
                charSet = upChar + lowChar + symbols + digits;
            }

            pwdTxt.setText(getPwd());

        }
    }

    private String getPwd(){

        Random r = new Random();
        List<String> list = new ArrayList<>();

        for(int i =0;i<minUpper;i++){
            list.add(upChar.charAt(r.nextInt(upChar.length()))+"");
        }
        for(int i =0;i<minLower;i++){
            list.add(lowChar.charAt(r.nextInt(lowChar.length()))+"");
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
