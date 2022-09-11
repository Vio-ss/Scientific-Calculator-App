package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    private TextView previousCalculation;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousCalculation = findViewById(R.id.previousCalculationView);
        display = findViewById(R.id.displayEditText);
        display.setShowSoftInputOnFocus(false);
    }
    private void updateText(String strToAdd){
        String oldString = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftString = oldString.substring(0, cursorPos);
        String rightString = oldString.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftString, strToAdd, rightString));
        display.setSelection(cursorPos + strToAdd.length());
    }
    public void zeroBTNPush(View view){
        updateText(getResources().getString(R.string.zeroText));
    }
    public void oneBTNPush(View view){
        updateText(getResources().getString(R.string.oneText));
    }
    public void twoBTNPush(View view){
        updateText(getResources().getString(R.string.twoText));
    }
    public void threeBTNPush(View view){
        updateText(getResources().getString(R.string.threeText));
    }
    public void fourBTNPush(View view){
        updateText(getResources().getString(R.string.fourText));
    }
    public void fiveBTNPush(View view){
        updateText(getResources().getString(R.string.fiveText));
    }
    public void sixBTNPush(View view){
        updateText(getResources().getString(R.string.sixText));
    }
    public void sevenBTNPush(View view){
        updateText(getResources().getString(R.string.sevenText));
    }
    public void eightBTNPush(View view){
        updateText(getResources().getString(R.string.eightText));
    }
    public void nineBTNPush(View view){
        updateText(getResources().getString(R.string.nineText));
    }
    public void addBTNPush(View view){
        updateText(getResources().getString(R.string.addText));
    }
    public void subtractBTNPush(View view){
        updateText(getResources().getString(R.string.subtractText));
    }
    public void multiplyBTNPush(View view){
        updateText(getResources().getString(R.string.multiplyText));
    }
    public void divideBTNPush(View view){
        updateText(getResources().getString(R.string.divideText));
    }
    public void clearBTNPush(View view){
        display.setText("");
        previousCalculation.setText("");
    }
    public void parenthesesOpenBTNPush(View view){
        updateText(getResources().getString(R.string.parenthesesOpenText));
    }
    public void parenthesesCloseBTNPush(View view){
        updateText(getResources().getString(R.string.parenthesesCloseText));
    }
    public void equalsBTNPush(View view){
        String userExp = display.getText().toString();
        previousCalculation.setText(userExp);
        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());
        display.setText(result);
        display.setSelection(result.length());
    }
    public void decimalBTNPush(View view){
        updateText(getResources().getString(R.string.decimalText));
    }
    public void backspaceBTNPush(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if (cursorPos != 0 && textLen == 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }
    }
    public void trigSinBTNPush(View view){
        updateText("sin(");
    }
    public void trigCosBTNPush(View view){
        updateText("cos(");
    }
    public void trigTanBTNPush(View view){
        updateText("tan(");
    }
    public void trigArcSinText(View view){
        updateText("arcsin(");
    }
    public void trigArcCosText(View view){
        updateText("arccos(");
    }
    public void trigArcTanText(View view){
        updateText("arctan(");
    }
    public void naturalLogText(View view){
        updateText("ln(");
    }
    public void LogText(View view){
        updateText("log(");
    }
    public void squareRootText(View view){
        updateText("sqrt(");
    }
    public void absoluteValueText(View view){
        updateText("abs(");
    }
    public void piText(View view){
        updateText("pi(");
    }
    public void eText(View view){
        updateText("e");
    }
    public void xSquaredText(View view){
        updateText("^(2)");
    }
    public void xPowerYText(View view){
        updateText("^(");
    }
    public void isPrimeFunctionText(View view){
        updateText("ispr(");
    }
}