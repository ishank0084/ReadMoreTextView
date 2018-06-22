package com.example.resizeabletextview;

/**
 * ------------------------------------------
 * Created by Ishank on 20-06-2018.
 * ------------------------------------------
 */

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public class ReadMoreSpan extends ClickableSpan {

    private boolean isUnderline = true;

    public ReadMoreSpan(boolean isUnderline) {
        this.isUnderline = isUnderline;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(isUnderline);
        ds.setColor(Color.parseColor("#1b76d3"));
    }

    @Override
    public void onClick(View widget) {


    }
}