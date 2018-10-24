package com.cji.edu.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
    }

    public void onClickWidget(View view){
        int id = view.getId();
        String text = ((RadioButton)view).getText().toString();

        switch(id){
            case R.id.radioButton01:
                text = text + "-" + ((RadioButton)view).isChecked();
                break;
            case R.id.radioButton02:
                text = text + "-" + ((RadioButton)view).isChecked();
                break;
                default:
                    text = "Nothing!";
        }
        textView.setText(text);
    }
}
