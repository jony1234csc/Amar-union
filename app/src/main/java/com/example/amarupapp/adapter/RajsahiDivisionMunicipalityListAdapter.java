package com.example.amarupapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.amarupapp.R;

import com.example.amarupapp.model.RajsahiDivisionMunicipalityList;

import java.util.ArrayList;

public class RajsahiDivisionMunicipalityListAdapter extends ArrayAdapter<RajsahiDivisionMunicipalityList> {

    public RajsahiDivisionMunicipalityListAdapter(Context context, ArrayList<RajsahiDivisionMunicipalityList> municipalityList) {
        super(context, 0, municipalityList);
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

        RajsahiDivisionMunicipalityList rajsahiDivisionMunicipalityList = getItem(position);

        if (rajsahiDivisionMunicipalityList != null) {

            textViewName.setText(rajsahiDivisionMunicipalityList.getMunicipalityName());
        }

        return convertView;
    }
}
