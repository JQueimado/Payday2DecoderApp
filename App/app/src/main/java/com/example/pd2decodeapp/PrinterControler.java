package com.example.pd2decodeapp;

import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.LinkedList;
import java.util.List;

public class PrinterControler {

    /* consts */
    private static final int PRINTERSIZE = 19;

    /* class vars */
    Translator translator;
    LinearLayout view;

    /* constructor */
    public PrinterControler(LinearLayout layout, Translator tr) throws Exception
    {
        if( layout.getId() != R.id.printer)
            throw new Exception("View Error");

        this.view = layout;
        this.translator = tr;
    }

    private void move()
    {

    }

    public void refresh()
    {
        if( translator.codes.size() > PRINTERSIZE )
        {
            this.move();
        }
        else
        {
            ImageView image = (ImageView) this.view.getChildAt(translator.codes.size() - 1);
            image.setImageResource( Translator.to_image( translator.codes.get( translator.codes.size()-1 )) );
        }
    }
}
