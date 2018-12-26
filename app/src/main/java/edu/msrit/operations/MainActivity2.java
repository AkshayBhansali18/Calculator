package edu.msrit.operations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;
    TextView textView3;
    Button add,subtract,multiply,divide;
    int operand1,operand2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        add=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.subtract);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        String op1=getIntent().getExtras().getString("num1");
        operand1=Integer.parseInt(op1);
        textView2.setText("Operand1: "+op1);
        String op2=getIntent().getStringExtra("num2");
        operand2=Integer.parseInt(op2);
        textView3.setText("Operand2: "+op2);
    }
    public void performOperation(View view)
    {
        Intent intent=new Intent(this,AddActivity.class);

        Button b=(Button) view;
        switch(b.getId())
        {
            case R.id.add:
                 res=operand1+operand2;
                intent.putExtra("result",Integer.toString(res));
                startActivity(intent);
                break;
            case R.id.subtract:
                res=operand1-operand2;
                intent.putExtra("result",Integer.toString(res));
                startActivity(intent);
                break;
            case R.id.multiply:
                res=operand1*operand2;
                intent.putExtra("result",Integer.toString(res));
                startActivity(intent);
                break;
            case R.id.divide:
                res=operand1/operand2;
                intent.putExtra("result",Integer.toString(res));
                startActivity(intent);
                break;


        }
    }
}
