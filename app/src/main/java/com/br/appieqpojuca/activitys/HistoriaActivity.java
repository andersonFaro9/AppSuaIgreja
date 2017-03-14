package com.br.appieqpojuca.activitys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.appieqpojuca.R;


/**
 * Created by faro on 09/02/17.
 */



public class HistoriaActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.historia, container, false);

        return rootView;
    }
}

