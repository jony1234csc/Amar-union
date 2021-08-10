package com.example.amarupapp.userActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.amarupapp.R;
import com.example.amarupapp.adapter.CtgDivisionDistrictListAdapter;
import com.example.amarupapp.adapter.CtgDivisionMunicipalityListAdapter;
import com.example.amarupapp.adapter.CtgDivisionUnionListAdapter;
import com.example.amarupapp.model.CtgDivisionDistrictList;
import com.example.amarupapp.model.CtgDivisionMunicipalityList;
import com.example.amarupapp.model.CtgDivisionUnionList;

import java.util.ArrayList;

public class BorisalDivisionActivity extends AppCompatActivity {
    private TextView searchBTN;
    private Spinner districtSpinner, municipalitySpinner, unionSpinner;

    private ArrayList<CtgDivisionDistrictList> districtLists;
    private CtgDivisionDistrictListAdapter ctgDivisionDistrictListAdapter;

    private ArrayList<CtgDivisionMunicipalityList> municipalityLists;
    private CtgDivisionMunicipalityListAdapter ctgDivisionMunicipalityListAdapter;

    private ArrayList<CtgDivisionUnionList> unionLists;
    private CtgDivisionUnionListAdapter ctgDivisionUnionListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borisal_division);

        searchBTN = findViewById(R.id.searchBtnID);
        searchBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BorisalDivisionActivity.this, UpWorkerListActivity.class);
                startActivity(intent);
            }
        });

        districtinitList();
        municipalityinitList();
        unioninitList();

        districtSpinner = findViewById(R.id.districtSpinnerID);
        ctgDivisionDistrictListAdapter = new CtgDivisionDistrictListAdapter(this, districtLists);
        districtSpinner.setAdapter(ctgDivisionDistrictListAdapter);

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
        ctgDivisionMunicipalityListAdapter = new CtgDivisionMunicipalityListAdapter(this, municipalityLists);
        municipalitySpinner.setAdapter(ctgDivisionDistrictListAdapter);

        municipalitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        unionSpinner = findViewById(R.id.unionSpinnerID);
        ctgDivisionUnionListAdapter = new CtgDivisionUnionListAdapter(this, unionLists);
        unionSpinner.setAdapter(ctgDivisionUnionListAdapter);

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
        unionLists.add(new CtgDivisionUnionList("আপনার ইউনিয়ন সিলেক্ট করুন"));
        unionLists.add(new CtgDivisionUnionList("অরণী"));
        unionLists.add(new CtgDivisionUnionList("বাজুবাঘা"));
        unionLists.add(new CtgDivisionUnionList("বাউসা"));
        unionLists.add(new CtgDivisionUnionList("গড়গড়ি"));
        unionLists.add(new CtgDivisionUnionList("মনিগ্রাম"));
        unionLists.add(new CtgDivisionUnionList("পাকুরিয়া"));
        unionLists.add(new CtgDivisionUnionList("চক্রাজাপুর"));

    }

    private void municipalityinitList() {
        municipalityLists=new ArrayList<>();
        municipalityLists.add(new CtgDivisionMunicipalityList("আপনার উপজেলা সিলেক্ট করুন"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাগমারা উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("চারঘাগ উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("দুর্গাপুর উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাঘা উপজেলা"));
        municipalityLists.add(new CtgDivisionMunicipalityList("বাঘা উপজেলা"));

    }

    private void districtinitList() {
        districtLists = new ArrayList<>();
        districtLists.add(new CtgDivisionDistrictList("আপনার জেলা সিলেক্ট করুন"));
        districtLists.add(new CtgDivisionDistrictList("রাজশাহী"));
        districtLists.add(new CtgDivisionDistrictList("নাটোর"));
        districtLists.add(new CtgDivisionDistrictList("পাবনা"));
        districtLists.add(new CtgDivisionDistrictList("বগুড়া"));
        districtLists.add(new CtgDivisionDistrictList("চাঁপাইনবাবগঞ্জ"));
        districtLists.add(new CtgDivisionDistrictList("জয়পুরহাট"));
        districtLists.add(new CtgDivisionDistrictList("নওগাঁ"));
        districtLists.add(new CtgDivisionDistrictList("সিরাজগঞ্জ"));

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