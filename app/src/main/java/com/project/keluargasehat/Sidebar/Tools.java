package com.project.keluargasehat.Sidebar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.project.keluargasehat.R;

public class Tools extends Fragment {

    public Tools(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.tools, container, false);

        getActivity().setTitle("Tools");

        return view;
    }
}
