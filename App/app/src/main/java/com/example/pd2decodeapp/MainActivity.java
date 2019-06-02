package com.example.pd2decodeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> codes;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codes = new LinkedList<>();
        tv = (TextView) findViewById(R.id.textDebug);
    }

    private String translate_word()
    {
        String ret = "";

        for(int i : codes)
        {
            switch (i)
            {
                case 0:
                    ret += "A";
                    break;

                case 1:
                    ret += "B";
                    break;

                case 2:
                    ret += "C";
                    break;

                case 3:
                    ret += "D";
                    break;

                case 4:
                    ret += "E";
                    break;

                case 5:
                    ret += "F";
                    break;

                case 6:
                    ret += "G";
                    break;

                case 7:
                    ret += "H";
                    break;

                case 8:
                    ret += "I";
                    break;

                case 9:
                    ret += "(J/X)";
                    break;

                case 10:
                    ret += "K";
                    break;

                case 11:
                    ret += "L";
                    break;

                case 12:
                    ret += "M";
                    break;

                case 13:
                    ret += "N";
                    break;

                case 14:
                    ret += "O";
                    break;

                case 15:
                    ret += "P";
                    break;

                case 16:
                    ret += "Q";
                    break;

                case 17:
                    ret += "R";
                    break;

                case 18:
                    ret += "S";
                    break;

                case 19:
                    ret += "T";
                    break;

                case 20:
                    ret += "U";
                    break;

                case 21:
                    ret += "V";
                    break;

                case 22:
                    ret += "W";
                    break;

                case 23:
                    ret += "Y";
                    break;

                case 24:
                    ret += "Z";
                    break;

                case 35:
                    ret += ".";
                    break;

                case 36:
                    ret += "\'";
                    break;

                case 37:
                    ret += "\"";
                    break;

                case 38:
                    ret += " ";
                    break;

            }

            if(i>24 && i<35)
                ret += Integer.toString(i-25);

        }

        return ret;
    }

    public void done_button(View v)
    {
        tv.setText( translate_word() );
        codes.clear();
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

        codes.add(code);
    }

}
