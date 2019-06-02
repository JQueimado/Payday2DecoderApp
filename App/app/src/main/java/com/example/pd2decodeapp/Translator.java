package com.example.pd2decodeapp;

import java.util.LinkedList;
import java.util.List;

public class Translator
{
    List<Integer> codes;

    public  Translator()
    {
        this.codes = new LinkedList<>();
    }

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

    public String translate()
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
        codes.clear();
    }

    public void add(int i){ codes.add(i); }
}
