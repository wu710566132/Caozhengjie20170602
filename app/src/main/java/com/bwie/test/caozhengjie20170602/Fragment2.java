package com.bwie.test.caozhengjie20170602;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Date：2017/6/2
 * author: 曹政杰Administrator.
 * function：   第二个fragment
 */

public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
             View view=inflater.inflate(R.layout.frag2,container,false);
        return view;
    }

    private Button but;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        but=(Button) getActivity().findViewById(R.id.but);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(getActivity(),SecondActivity.class);
                startActivity(it);
            }
        });
    }
}
