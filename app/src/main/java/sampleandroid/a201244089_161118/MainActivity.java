package sampleandroid.a201244089_161118;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String num1;
    String num2;
    double resultnum;
    Button plus;
    Button minus;
    Button multi;
    Button div;
    Button remainnum;
    EditText input1;
    EditText input2;
    EditText result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.input1);
        input2 = (EditText)findViewById(R.id.input2);
        result = (EditText)findViewById(R.id.resulttxt);


        plus = (Button)findViewById(R.id.plusbtn);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    num1 = input1.getText().toString();
                    num2 = input2.getText().toString();

                    resultnum = Double.parseDouble(num1) + Double.parseDouble(num2);
                    result.setText(Double.toString(resultnum));
            }
        });

        minus = (Button)findViewById(R.id.minusbtn);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                resultnum = Double.parseDouble(num1)-Double.parseDouble(num2);
                result.setText(Double.toString(resultnum));
            }
        });

        multi = (Button)findViewById(R.id.multibtn);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                resultnum = Double.parseDouble(num1)*Double.parseDouble(num2);
                result.setText(Double.toString(resultnum));
            }
        });
        div = (Button)findViewById(R.id.divbtn);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                resultnum = Double.parseDouble(num1)/Double.parseDouble(num2);
                result.setText(Double.toString(resultnum));
            }
        });
        remainnum = (Button)findViewById(R.id.remainbtn);
        remainnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                resultnum = Double.parseDouble(num1)%Double.parseDouble(num2);
                result.setText(Double.toString(resultnum));
            }
        });
    }
}
