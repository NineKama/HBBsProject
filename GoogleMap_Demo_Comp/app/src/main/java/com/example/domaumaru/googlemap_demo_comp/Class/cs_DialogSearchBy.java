package com.example.domaumaru.googlemap_demo_comp.Class;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.domaumaru.googlemap_demo_comp.Activity.MapsActivity;
import com.example.domaumaru.googlemap_demo_comp.R;

import java.util.Map;

/**
 * Created by Doma Umaru on 9/29/2016.
 */

public class cs_DialogSearchBy extends DialogFragment {

    public interface SearchByDialogListener{
        void onFinishDialog(String inputText);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_searchby, container);

        Button btnSearch = (Button) view.findViewById(R.id.btnSearch);
        final EditText etKeyword = (EditText) view.findViewById(R.id.etKeyword);

        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        getDialog().setTitle("Search By");

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapsActivity activity = (MapsActivity) getActivity();
                String keyword = etKeyword.getText().toString().trim();
                activity.onUserSelectValue(keyword);
                getDialog().dismiss();
            }
        });

        return view;
    }

    public cs_DialogSearchBy() {

    }
}
