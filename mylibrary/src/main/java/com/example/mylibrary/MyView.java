package com.example.mylibrary;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Nishtha.Udai on 12/18/2015.
 */
public class MyView extends RelativeLayout{
    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;
    double num1,num2,sum;

    public MyView(Context context) {
        super(context);
        initialize(context);
        firstNumber = (EditText)findViewById(R.id.txtNumber1);
        secondNumber = (EditText)findViewById(R.id.txtNumber2);
        addResult = (TextView)findViewById(R.id.txtResult);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sum = num1 + num2;
                addResult.setText(Double.toString(sum));
            }
        });

    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);


    }

//    @Override
//    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//
//    }
}
