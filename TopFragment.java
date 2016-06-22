package com.aranish.memegenerator;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.aranish.memegenerator.R;


public class TopFragment extends Fragment {

    private static EditText topText;
    private static EditText bottomText;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top,String button);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander=(TopSectionListener)activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.topfragment,container,false);

        topText=(EditText)view.findViewById(R.id.topText);
        bottomText=(EditText)view.findViewById(R.id.bottomText);
        final Button button=(Button)view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }
    public void buttonClicked(View view){
        activityCommander.createMeme(topText.getText().toString(),bottomText.getText().toString());

    }
}
