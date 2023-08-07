package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView chis;
    float one, two;
    int choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
//        ConstraintLayout constraintLayout=new ConstraintLayout(this);
//        TextView textView=new TextView(this);
//        textView.setText("Hello, Android!");
//        textView.setTextSize(30);
//        ConstraintLayout.LayoutParams layoutParams=new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//        setContentView(constraintLayout);
        chis=findViewById(R.id.display);

    }
    public void number(View view){
        Button button=(Button) view;


        if(chis.getText().toString().equals("0")) {
            chis.setText(button.getText());
        }
        else{
            chis.append(button.getText());
        }

    }
    public void operation(View view){
        Button button=(Button) view;
        String op=button.getText().toString();
        if(op.equals("+")) {
            one = Float.parseFloat(chis.getText().toString());
            chis.setText("0");
            choice=1;
        }
        else if(op.equals("-")) {
            one = Float.parseFloat(chis.getText().toString());
            chis.setText("0");
            choice=2;
        }
        else if(op.equals("*")) {
            one = Float.parseFloat(chis.getText().toString());
            chis.setText("0");
            choice=3;
        }
        else if(op.equals("/")) {
            one = Float.parseFloat(chis.getText().toString());
            chis.setText("0");
            choice=4;
        }
    }
    public void result(View view){
        if(!(chis.getText().toString()).equals("0")) {
            float res;
            switch (choice) {
                case 1:
                    res = Float.parseFloat(chis.getText().toString()) + one;
                    chis.setText(Float.toString(res));
                    break;
                case 2:
                    res = one-Float.parseFloat(chis.getText().toString());
                    chis.setText(Float.toString(res));
                    break;
                case 3:
                    res = one*Float.parseFloat(chis.getText().toString());
                    chis.setText(Float.toString(res));
                    break;
                case 4:
                    res = one/Float.parseFloat(chis.getText().toString());
                    chis.setText(Float.toString(res));
                    break;

            }
        }
    }
    public void clean(View view){
        choice=0;
        chis.setText("0");
    }


}