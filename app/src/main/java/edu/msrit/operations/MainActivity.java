package edu.msrit.operations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button submit;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView) ;
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = editText.getText().toString();
                String text2 = editText2.getText().toString();
                if(TextUtils.isEmpty(text1)||TextUtils.isEmpty(text2)) {
                    if (TextUtils.isEmpty(text1))
                        editText.setError("Invalid Input");
                    if (TextUtils.isEmpty(text2))
                        editText2.setError("Invalid Input");
                }
                else {
                    final Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("num1", editText.getText().toString());
                    intent.putExtra("num2", editText2.getText().toString());
                    startActivity(intent);
                }

            }

        });
    }
}



