package ru.mgvk.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    LinearLayout mainLayout;
    private EditText input1;
    private EditText input2;
    private TextView result;
    private Button   addButton, subButton, multButton, devButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);
        addButton = findViewById(R.id.add);
        subButton = findViewById(R.id.sub);
        multButton = findViewById(R.id.mult);
        devButton = findViewById(R.id.dev);
        mainLayout = findViewById(R.id.mainlayout);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multButton.setOnClickListener(this);
        devButton.setOnClickListener(this);


        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Для получения ответа, введите значения в поля ввода и нажмите на одну из кнопок операций!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    public void onClick(View view) {

        double a = Double.valueOf(input1.getText().toString());
        double b = Double.valueOf(input2.getText().toString());
        double c = 0;
        switch (view.getId()) {
            case R.id.add: {
                c = a + b;
                break;
            }
            case R.id.sub: {
                c = a - b;
                break;
            }
            case R.id.mult: {
                c = a * b;
                break;
            }
            case R.id.dev: {
                c = a / b;
                break;
            }

        }

        result.setText(String.valueOf(c));

    }
}
