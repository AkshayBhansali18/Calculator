package edu.msrit.operations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {
    TextView textView6;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add);
        imageView=(ImageView) findViewById(R.id.imageView);
        textView6=(TextView) findViewById(R.id.textView6);
        button=(Button) findViewById(R.id.button);
        String result=getIntent().getStringExtra("result");
        textView6.setText("The result of the operation is: "+result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
