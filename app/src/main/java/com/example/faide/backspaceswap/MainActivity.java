package com.example.faide.backspaceswap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et = findViewById(R.id.editext);
        CustomTextWatcher inputTextWatcher= new CustomTextWatcher(et);
        et.addTextChangedListener(inputTextWatcher);
        Button button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Toast toast = Toast.makeText(getApplicationContext(),editText.getText(),Toast.LENGTH_SHORT);
                toast.show();*/
            }
        });
    }
    


}
