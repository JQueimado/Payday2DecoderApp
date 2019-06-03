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

        this.clear();

    }

    public void clear()
    {
        for(int i = 0; i<PRINTERSIZE; i++)
        {
            ImageView img = (ImageView) this.view.getChildAt(i);
            img.setImageResource(0);
        }
    }

    private void move()
    {
        for(int i = PRINTERSIZE-1; i>=0; i--)
        {
            try {
                ImageView view = (ImageView) this.view.getChildAt(i);
                view.setImageResource(Translator.to_image(translator.codes.get(translator.codes.size() - (PRINTERSIZE - i) )));
            }
            catch (Exception e)
            { }
        }
    }

    public void refresh()
    {
        if( translator.codes.size() > PRINTERSIZE )
        {
            this.move();
        }
        else
        {
            try{
                ImageView image = (ImageView) this.view.getChildAt(translator.codes.size() - 1);
                int result = translator.codes.get( translator.codes.size()-1 );
                image.setImageResource( Translator.to_image( result ) );
            }
            catch (Exception e)
            {}
        }
    }
}
