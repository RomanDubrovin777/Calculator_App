package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView text_result;
    int num1, num2;
    char operator;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        TextView text_result = findViewById(R.id.textViewResult);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }


    public void funcOnClick(View view) {
        Button button = (Button) view;
        text_result = findViewById(R.id.textViewResult);
        text_result.setTextSize(60);
        if (button.getId() == R.id.buttonAc) {
            text_result.setText("");
        }
        if (text_result.getText().toString().equals("0")) {
            text_result.setText("");
        }
        if (button.getId() == R.id.buttonZero) {
            text_result.append(button.getText());
        }
        if (button.getId() == R.id.buttonOne) {
            text_result.append(button.getText());

        } else if (view.getId() == R.id.buttonTwo) {
            text_result.append(button.getText());

        } else if (view.getId() == R.id.buttonThree) {
            text_result.append(button.getText());

        } else if (view.getId() == R.id.buttonFour) {
            text_result.append(button.getText());
        } else if (view.getId() == R.id.buttonFive) {
            text_result.append(button.getText());
        } else if (view.getId() == R.id.buttonSix) {
            text_result.append(button.getText());
        } else if (view.getId() == R.id.buttonSeven) {
            text_result.append(button.getText());
        } else if (view.getId() == R.id.buttonEight) {
            text_result.append(button.getText());
        } else if (view.getId() == R.id.buttonNine) {
            text_result.append(button.getText());
        }
    }

    public void funcOperator(View view)
    {
        Button button_operator = (Button) view;
        num1 = Integer.parseInt(text_result.getText().toString());
        operator = button_operator.getText().toString().charAt(0);
        text_result.setText("");
    }

    public void funcEquale(View view) {
        num2 = Integer.parseInt(text_result.getText().toString());
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                text_result.setTextSize(60);
                text_result.setText("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                text_result.setTextSize(60);
                text_result.setText("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                text_result.setTextSize(60);
                text_result.setText("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    text_result.setTextSize(60);
                    text_result.setText("Result: " + result);
                } else {
                    text_result.setTextSize(40);
                    text_result.setText("Error Cant Divide By Zero\n Press AC To Reset");
                    return;
                }
                break;
        }
    }
}
