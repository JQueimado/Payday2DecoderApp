package com.example.pd2decodeapp;

import android.widget.LinearLayout;

import java.util.LinkedList;
import java.util.List;

public class PrinterControler {

    /* consts */
    private static final int PRINTERSIZE = 20;

    /* class vars */
    List<Integer> codes;
    LinearLayout view;
    int current;

    /* constructor */
    public PrinterControler(LinearLayout layout)
    {
        this.view = layout;
        this.codes = new LinkedList<>();
        this.current = 0;
    }

    /* methods */
    public void add(int i )
    {
        this.codes.add(i);
    }

    private void refresh()
    {
        if( this.current != PRINTERSIZE )
        {

        }
    }
}
