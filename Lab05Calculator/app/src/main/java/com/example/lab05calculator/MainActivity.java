package com.example.lab05calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1;
    private EditText etNum2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(v -> calculate('+'));
        btnSubtract.setOnClickListener(v -> calculate('-'));
        btnMultiply.setOnClickListener(v -> calculate('×'));
        btnDivide.setOnClickListener(v -> calculate('÷'));
    }

    private void calculate(char op) {
        double num1, num2;
        try {
            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
            return;
        }

        double result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '×':
                result = num1 * num2;
                break;
            case '÷':
                if (num2 == 0) {
                    tvResult.setText("결과: 0으로 나눌 수 없음");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                return;
        }

        tvResult.setText("결과: " + result);
    }
}
