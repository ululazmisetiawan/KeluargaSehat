package com.project.keluargasehat.Sidebar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.project.keluargasehat.R;

public class Share extends Fragment {

    public Share(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.share, container, false);

        getActivity().setTitle("Share");

        return view;
    }
}
