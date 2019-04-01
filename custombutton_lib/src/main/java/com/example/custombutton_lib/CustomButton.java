package com.example.custombutton_lib;


import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

public class CustomButton extends android.support.v7.widget.AppCompatButton {

    private boolean isRed = true;

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void changedesign(int textcolor, int background_shape,String font_path) {
        //set text alignment
        setTextAlignment(TEXT_ALIGNMENT_CENTER);
        //set text color
        setTextColor(textcolor);

        setAllCaps(false);
        //set background
        setBackgroundResource(background_shape);
        //set font
        if(font_path!=null) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), font_path);
            setTypeface(tf);
        }
    }

}