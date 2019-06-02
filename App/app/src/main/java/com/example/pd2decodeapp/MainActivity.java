package com.example.pd2decodeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Translator translator;
    PrinterControler controler;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            translator = new Translator();
            controler = new PrinterControler( (LinearLayout) findViewById(R.id.printer), translator );
            tv = (TextView) findViewById(R.id.textDebug);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "ERROR", Toast.LENGTH_LONG);
        }
    }

    public void on_Key_Press(View v)
    {
        int code = -1;

        switch (v.getId())
        {
            case R.id.buttonA:
                code = 0;
                break;

            case R.id.buttonB:
                code = 1;
                break;

            case R.id.buttonC:
                code = 2;
                break;

            case R.id.buttonD:
                code = 3;
                break;

            case R.id.buttonE:
                code = 4;
                break;

            case R.id.buttonF:
                code = 5;
                break;

            case R.id.buttonG:
                code = 6;
                break;

            case R.id.buttonH:
                code = 7;
                break;

            case R.id.buttonI:
                code = 8;
                break;

            case R.id.buttonJX:
                code = 9;
                break;

            case R.id.buttonK:
                code = 10;
                break;

            case R.id.buttonL:
                code = 11;
                break;

            case R.id.buttonM:
                code = 12;
                break;

            case R.id.buttonN:
                code = 13;
                break;

            case R.id.buttonO:
                code = 14;
                break;

            case R.id.buttonP:
                code = 15;
                break;

            case R.id.buttonQ:
                code = 16;
                break;

            case R.id.buttonR:
                code = 17;
                break;

            case R.id.buttonS:
                code = 18;
                break;

            case R.id.buttonT:
                code = 19;
                break;

            case R.id.buttonU:
                code = 20;
                break;

            case R.id.buttonV:
                code = 21;
                break;

            case R.id.buttonW:
                code = 22;
                break;

            case R.id.buttonXJ:
                code = 9;
                break;

            case R.id.buttonY:
                code = 23;
                break;

            case R.id.buttonZ:
                code = 24;
                break;

            case R.id.button0:
                code = 25;
                break;

            case R.id.button1:
                code = 26;
                break;

            case R.id.button2:
                code = 27;
                break;

            case R.id.button3:
                code = 28;
                break;

            case R.id.button4:
                code = 29;
                break;

            case R.id.button5:
                code = 30;
                break;

            case R.id.button6:
                code = 31;
                break;

            case R.id.button7:
                code = 32;
                break;

            case R.id.button8:
                code = 33;
                break;

            case R.id.button9:
                code = 34;
                break;

            case R.id.buttonDot:
                code = 35;
                break;

            case R.id.buttonUpperComa:
                code = 36;
                break;

            case R.id.buttonDubbleUpperComa:
                code = 37;
                break;

            case R.id.buttonSpace:
                code = 38;
                break;

        }

        translator.add(code);
        tv.setText(translator.translate());
        controler.refresh();
    }

    public void clear_button(View v)
    {
        translator.clear();
        tv.setText("");
    }

    public void line_button(View v)
    {
        translator.line();
    }

}
