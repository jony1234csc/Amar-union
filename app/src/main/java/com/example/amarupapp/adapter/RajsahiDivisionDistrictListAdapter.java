package com.example.amarupapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.amarupapp.R;
import com.example.amarupapp.model.RajsahiDivisionDistrictList;

import java.util.ArrayList;

public class RajsahiDivisionDistrictListAdapter extends ArrayAdapter<RajsahiDivisionDistrictList> {

    public RajsahiDivisionDistrictListAdapter(Context context, ArrayList<RajsahiDivisionDistrictList> districtLists) {
        super(context, 0, districtLists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.district_spinner_item_row, parent, false
            );
        }


        TextView textViewName = convertView.findViewById(R.id.districtNameTV);

        RajsahiDivisionDistrictList rajsahiDivisionDistrictList = getItem(position);

        if (rajsahiDivisionDistrictList != null) {

            textViewName.setText(rajsahiDivisionDistrictList.getDistrictName());
        }

        return convertView;
    }
}
