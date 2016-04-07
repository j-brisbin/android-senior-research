package com.example.haungsn.finalprojectapi15;

import android.content.res.Resources;
import android.graphics.Canvas;

import java.util.ArrayList;

/**
 * Created by jbrisbin32 on 12/1/15.
 */
public class CardRow {
    private ArrayList<Card> cards;
    private Card card;
    private int distanceApart;
    private int quantity;
    private int initialX;
    private int initialY;
    private int resourceId;
    private Resources resource;
    public CardRow(Resources resource, int resourceId, int initialX,
                   int initialY, int distanceApart, int quantity){
        this.distanceApart = distanceApart;
        this.quantity = quantity;
        cards = new ArrayList<Card>();
        for(int i = 0; i<quantity; i++){

        }
    }


}
