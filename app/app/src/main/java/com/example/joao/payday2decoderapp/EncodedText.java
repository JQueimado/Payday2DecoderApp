package com.example.joao.payday2decoderapp;

import java.util.ArrayList;
import java.util.List;

public class EncodedText {

    /*Decode Constants*/

    /*Local Vars*/

    private List<Integer> mesage;
    private int size;

    /*Constructors*/
    public EncodedText (){

        mesage = new ArrayList<>();
        size = 0;

    }

    public void addChar(int c){

        mesage.add(c);
        size++;

    }

    public void removeAt(int p){

        mesage.remove(p);
        size--;

    }

    public String[] decode(){

        String decoded1 = "";
        String decoded2 = "";

        for (int i : mesage){

            /*if its a number than insert number*/

            if ( i <= 9 ){

                decoded1 += (char) i;
                decoded2 += (char) i;

                continue;

            }

            /*if its a letter than insert letter*/

            i -= 9;

            /* J or X */
            if ( i == 10 || i == 24){

                decoded1 += (char) 10+41;
                decoded2 += (char) 24+41;

                continue;

            }

            /*normal chars*/
            if (i <= 26){

                decoded1 += (char) i+41;
                decoded2 += (char) i+41;

                continue;

            }

            /*time markers*/

            i -= 26;

            if (i == 0){

                decoded1 += '.';
                decoded2 += '.';
                continue;
            }

            if (i == 1){

                decoded1 += 'º';
                decoded2 += 'º';
                continue;
            }

            if (i == 2){

                decoded1 += '"';
                decoded2 += '"';
                continue;
            }

            if (i == 3){

                decoded1 += "'";
                decoded2 += "'";
                continue;
            }

            /*unknown*/
            /*does nothing*/

        }

        String[] a = {decoded1,decoded2};

        return a;

    }

}
