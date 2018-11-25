package com.example.faide.backspaceswap;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.String;




public class CustomTextWatcher implements TextWatcher {
    public EditText editText;
    String qwe = "qwerty";



    public CustomTextWatcher(EditText et){
        super();
        editText = et;
    }
    public void afterTextChanged(Editable s) {
        if(editText.getText().length() == 2){
            editText.setText(qwe);
        }


       /* if(editText.getText().length() == 7) {
            editText.setText(editText.getText().replace(0, 7, "Privet"));
        }*/


    }
    public void beforeTextChanged(CharSequence s, int start, int count, int after){

    }
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

}
