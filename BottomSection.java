package com.aranish.memegenerator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aranish.memegenerator.R;

public class BottomSection extends Fragment {
    private static TextView toptext;
    private static TextView bottomtext;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.topfragment, container, false);
        toptext=(TextView)view.findViewById(R.id.TopText);
        bottomtext=(TextView)view.findViewById(R.id.Bottom_Text);
        return view;
    }
    public void setMemeText(String top,String bottom){
        toptext.setText(top);
        bottomtext.setText(bottom);
    }
}

