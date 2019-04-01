package com.example.manreet.custombutton_library;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.custombutton_lib.CustomButton;

public class MainActivity extends AppCompatActivity {
LinearLayout container;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar m_myActionBar=getSupportActionBar(); // to get activity actionbar
        //For hiding actionbar
        m_myActionBar.hide();

        container=findViewById(R.id.container);
        CustomButton button = new CustomButton(this);
        container.addView(button);
        button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
        button.changedesign(Color.WHITE,R.drawable.button_shape,"Gotham-Font/GothamMedium.ttf");
        ((LinearLayout.LayoutParams) button.getLayoutParams()).setMargins(50, 40, 50, 0);
        button.setText("LogIn");
    }
}
