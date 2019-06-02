package com.example.pd2decodeapp;

import android.graphics.drawable.Drawable;

import java.util.LinkedList;
import java.util.List;

public class Translator
{
    List<Integer> codes;
    List<String> lines;

    public  Translator()
    {
        this.codes = new LinkedList<>();
        this.lines = new LinkedList<>();
    }

    /* Statics methods */
    public static String singlechar(int i)
    {
        switch (i)
        {
            case 0:
                return "A";

            case 1:
                return "B";

            case 2:
                return "C";

            case 3:
                return "D";

            case 4:
                return "E";

            case 5:
                return "F";

            case 6:
                return "G";

            case 7:
                return "H";

            case 8:
                return "I";

            case 9:
                return "(J/X)";

            case 10:
                return "K";

            case 11:
                return "L";

            case 12:
                return "M";

            case 13:
                return "N";

            case 14:
                return "O";

            case 15:
                return "P";

            case 16:
                return "Q";

            case 17:
                return "R";

            case 18:
                return "S";

            case 19:
                return "T";

            case 20:
                return "U";

            case 21:
                return "V";

            case 22:
                return "W";

            case 23:
                return "Y";

            case 24:
                return "Z";

            case 35:
                return ".";

            case 36:
                return "\"";

            case 37:
                return "\"";

            case 38:
                return " ";
                
        }

        if(i>24 && i<35)
            return Integer.toString(i-25);

        return "Nope";
    }

    public static int to_image(int i)
    {
        switch (i)
        {
            case 1:
                return R.drawable.b;
            case 2:
                return R.drawable.c;
            case 3:
                return R.drawable.d;
            case 4:
                return R.drawable.e;
            case 5:
                return R.drawable.f;
            case 6:
                return R.drawable.g;
            case 7:
                return R.drawable.h;
            case 8:
                return R.drawable.i;
            case 9:
                return R.drawable.jx;
            case 10:
                return R.drawable.k;
            case 11:
                return R.drawable.l;
            case 12:
                return R.drawable.m;
            case 13:
                return R.drawable.n;
            case 14:
                return R.drawable.o;
            case 15:
                return R.drawable.p;
            case 16:
                return R.drawable.q;
            case 17:
                return R.drawable.r;
            case 18:
                return R.drawable.s;
            case 19:
                return R.drawable.t;
            case 20:
                return R.drawable.u;
            case 21:
                return R.drawable.v;
            case 22:
                return R.drawable.w;
            case 23:
                return R.drawable.y;
            case 24:
                return R.drawable.z;
            case 25:
                return R.drawable.n0;
            case 26:
                return R.drawable.n1;
            case 27:
                return R.drawable.n2;
            case 28:
                return R.drawable.n3;
            case 29:
                return R.drawable.n4;
            case 30:
                return R.drawable.n5;
            case 31:
                return R.drawable.n6;
            case 32:
                return R.drawable.n7;
            case 33:
                return R.drawable.n8;
            case 34:
                return R.drawable.n9;
            case 35:
                return R.drawable.dot;
            case 36:
                return R.drawable.upper_coma;
            case 37:
                return R.drawable.upper_dubble_coma;
            case 38:
                return R.drawable.space;
        }
        return -1;
    }

    /* Object methods */
    public String translate_cur_line()
    {
        String ret = "";
        for(int i : this.codes)
        {
            ret = Translator.singlechar(i) + ret;
        }
        return ret;
    }

    public void clear()
    {
        this.codes.clear();
        this.lines.clear();
    }

    public void add(int i){ codes.add(i); }

    public void line()
    {
        this.lines.add( this.translate_cur_line() );
        this.codes.clear();
    }

    public String translate()
    {
        String ret = "";

        for(String line : this.lines)
        {
            ret += line;
        }

        if(!codes.isEmpty())
        {
            ret+= this.translate_cur_line();
        }

        return ret;
    }
}
