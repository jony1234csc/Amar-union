package com.example.amarupapp.userActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.amarupapp.R;
import com.example.amarupapp.adapter.RajsahiDivisionDistrictListAdapter;
import com.example.amarupapp.adapter.RajsahiDivisionMunicipalityListAdapter;

import com.example.amarupapp.adapter.RajsahiDivisionUnionListAdapter;
import com.example.amarupapp.model.RajsahiDivisionDistrictList;
import com.example.amarupapp.model.RajsahiDivisionMunicipalityList;
import com.example.amarupapp.model.RajsahiDivisionUnionList;

import java.util.ArrayList;

public class RajsahiDivisionActivity extends AppCompatActivity {
    private TextView searchBTN;
    private Spinner districtSpinner, municipalitySpinner, unionSpinner;

    private ArrayList<RajsahiDivisionDistrictList> districtLists;
    private RajsahiDivisionDistrictListAdapter rajsahiDivisionDistrictListAdapter;

    private ArrayList<RajsahiDivisionMunicipalityList> municipalityLists;
    private RajsahiDivisionMunicipalityListAdapter rajsahiDivisionMunicipalityListAdapter;

    private ArrayList<RajsahiDivisionUnionList> unionLists;
    private RajsahiDivisionUnionListAdapter rajsahiDivisionUnionListAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajsahi_division);

        searchBTN = findViewById(R.id.searchBtnID);
        searchBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajsahiDivisionActivity.this, UpWorkerListActivity.class);
                startActivity(intent);
            }
        });

        districtinitList();
        municipalityinitList();
        unioninitList();

        districtSpinner = findViewById(R.id.districtSpinnerID);
        rajsahiDivisionDistrictListAdapter = new RajsahiDivisionDistrictListAdapter(this, districtLists);
        districtSpinner.setAdapter(rajsahiDivisionDistrictListAdapter);

        districtSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                RajsahiDivisionDistrictList clickedItem = (RajsahiDivisionDistrictList) parent.getItemAtPosition(position);
//                String clickedCountryName = clickedItem.getDistrictName();
//                Toast.makeText(RajsahiDivisionActivity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        municipalitySpinner = findViewById(R.id.municipalitySpinnerID);
        rajsahiDivisionMunicipalityListAdapter = new RajsahiDivisionMunicipalityListAdapter(this, municipalityLists);
        municipalitySpinner.setAdapter(rajsahiDivisionMunicipalityListAdapter);

        municipalitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unionSpinner = findViewById(R.id.unionSpinnerID);
        rajsahiDivisionUnionListAdapter = new RajsahiDivisionUnionListAdapter(this, unionLists);
        unionSpinner.setAdapter(rajsahiDivisionUnionListAdapter);

        unionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//             RajsahiDivisionUnionList clickedItem = (RajsahiDivisionUnionList) parent.getItemAtPosition(position);
//                String clickedCountryName = clickedItem.getUnionName();
//                Toast.makeText(RajsahiDivisionActivity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        statusBarColorChange();


    }

    private void unioninitList() {
        unionLists=new ArrayList<>();
        unionLists.add(new RajsahiDivisionUnionList("আপনার ইউনিয়ন সিলেক্ট করুন"));
        unionLists.add(new RajsahiDivisionUnionList("অরণী"));
        unionLists.add(new RajsahiDivisionUnionList("বাজুবাঘা"));
        unionLists.add(new RajsahiDivisionUnionList("বাউসা"));
        unionLists.add(new RajsahiDivisionUnionList("গড়গড়ি"));
        unionLists.add(new RajsahiDivisionUnionList("মনিগ্রাম"));
        unionLists.add(new RajsahiDivisionUnionList("পাকুরিয়া"));
        unionLists.add(new RajsahiDivisionUnionList("চক্রাজাপুর"));

    }

    private void municipalityinitList() {
        municipalityLists=new ArrayList<>();
        municipalityLists.add(new RajsahiDivisionMunicipalityList("আপনার উপজেলা সিলেক্ট করুন"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাগমারা উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("চারঘাগ উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("দুর্গাপুর উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new RajsahiDivisionMunicipalityList("বাঘা উপজেলা"));

    }

    private void districtinitList() {
        districtLists = new ArrayList<>();
        districtLists.add(new RajsahiDivisionDistrictList("আপনার জেলা সিলেক্ট করুন"));
        districtLists.add(new RajsahiDivisionDistrictList("রাজশাহী"));
        districtLists.add(new RajsahiDivisionDistrictList("নাটোর"));
        districtLists.add(new RajsahiDivisionDistrictList("পাবনা"));
        districtLists.add(new RajsahiDivisionDistrictList("বগুড়া"));
        districtLists.add(new RajsahiDivisionDistrictList("চাঁপাইনবাবগঞ্জ"));
        districtLists.add(new RajsahiDivisionDistrictList("জয়পুরহাট"));
        districtLists.add(new RajsahiDivisionDistrictList("নওগাঁ"));
        districtLists.add(new RajsahiDivisionDistrictList("সিরাজগঞ্জ"));

    }

    private void statusBarColorChange() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.dashboard_statusbar));
        }
    }

    public void backBtn(View view) {
        onBackPressed();
        finish();
    }


}