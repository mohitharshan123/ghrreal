package com.example.reubro.ghr;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by reubro on 26/4/18.
 */

public class Medicalhistory extends android.support.v4.app.Fragment {

    public Medicalhistory() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.medicalhistoryfragment,container,false);
        return view;
    }
}
