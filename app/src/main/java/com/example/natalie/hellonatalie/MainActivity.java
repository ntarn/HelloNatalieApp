package com.example.natalie.hellonatalie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.babyblue));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user inputted
                String newText =((EditText)findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView)).setText("Hello from Natalie!");
                }
                else{
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }

                //put the text into the original text

            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back to original
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                //reset the background color colorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                //reset the text back to "Hello from Natalie!"
                ((TextView)findViewById(R.id.textView)).setText("Hello from Natalie!");
            }
        });

    }

}
