package com.gravitybd.navigationtemplate.com.gravitybd.navigationtemplate.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gravitybd.navigationtemplate.R;

/**
 * Created by adnan on 2/5/15.
 */
public class FragTwo extends Fragment {

    public FragTwo(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragtwo_layout, container, false);
        return v;
    }
}
