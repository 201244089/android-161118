package sampleandroid.a201244089_161118;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button plus, minus, multi, div;
    Button remainnum;
    EditText input1;
    EditText input2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.input1);
        input2 = (EditText)findViewById(R.id.input2);
        result = (TextView) findViewById(R.id.resulttxt);


        plus = (Button)findViewById(R.id.plusbtn);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator('+');
            }
        });

        minus = (Button)findViewById(R.id.minusbtn);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator('-');
            }
        });

        multi = (Button)findViewById(R.id.multibtn);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator('*');
            }
        });
        div = (Button)findViewById(R.id.divbtn);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            calculator('/');
            }
        });
        remainnum = (Button)findViewById(R.id.remainbtn);
        remainnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator('%');
            }
        });
    }

    void calculator(char op){
        double resultnum = 0;
        double d_num1 = Double.parseDouble(input1.getText().toString());
        double d_num2 = Double.parseDouble(input2.getText().toString());
        if(input1.getText().length() == 0  || input2.getText().length() == 0){
            Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
        }
        else {
            if (op == '+') {
                resultnum = d_num1 + d_num2;
            }
            if (op == '-') {
                resultnum = d_num1 - d_num2;
            }
            if (op == '*') {
                resultnum = d_num1 * d_num2;
            }
            if (op == '/') {
                if(d_num2 == 0){
                    Toast.makeText(getApplicationContext(),"0으로 나눌수 없습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    resultnum = d_num1 / d_num2;
                }
            }
            if (op == '%') {
                resultnum = d_num1 % d_num2;
            }
            result.setText(resultnum + "");
        }
    }
}
