package com.gravitybd.navigationtemplate.com.gravitybd.navigationtemplate.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gravitybd.navigationtemplate.R;

/**
 * Created by adnan on 2/5/15.
 */
public class FragOne extends android.app.Fragment {

    public FragOne() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragone_layout, null);
        return v;
    }
}
