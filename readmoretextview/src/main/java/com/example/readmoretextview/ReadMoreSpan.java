package com.example.readmoretextview;

/**
 * ------------------------------------------
 * Created by Ishank on 20-06-2018.
 * ------------------------------------------
 */

import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

public class ReadMoreSpan extends ClickableSpan {

    private boolean isUnderline = true;
    private String color = "#1b76d3";

    public ReadMoreSpan(boolean isUnderline, String color) {
        this.isUnderline = isUnderline;
        this.color = color;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(isUnderline);
        if (TextUtils.isEmpty(color)) {
            ds.setColor(Color.parseColor("#1b76d3"));
        } else {
            try {
                ds.setColor(Color.parseColor(color));
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("ReadMoreTextView", "Unable to parse your color please provide proper color along with #");
                ds.setColor(Color.parseColor("#1b76d3"));
            }
        }
    }

    @Override
    public void onClick(View widget) {


    }
}