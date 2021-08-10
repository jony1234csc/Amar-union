package com.example.amarupapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.amarupapp.adapter.SliderAdapter;
import com.example.amarupapp.model.SliderItem;
import com.example.amarupapp.userActivity.BorisalDivisionActivity;
import com.example.amarupapp.userActivity.CtgDivisionActivity;
import com.example.amarupapp.userActivity.DhakaDivisionActivity;
import com.example.amarupapp.userActivity.KhulnaDivisionActivity;
import com.example.amarupapp.userActivity.MaymonSingDivisionActivity;
import com.example.amarupapp.userActivity.RajsahiDivisionActivity;
import com.example.amarupapp.userActivity.RongpurDivisionActivity;
import com.example.amarupapp.userActivity.SiletDivisionActivity;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CardView ctgDivisionCV,rajsahiDivisionCV,khulnaDivisionCV,borisalDivisionCV,shyletDivisionCV,
            dhakaDivisionCV,rongpurDivisionCV,maymonSingDivisionCV;
    private SliderView sliderView;
    private CardView call333CV,call999CV,call106CV,call109CV,call1098CV,call1090CV;
    private CardView schlloCV,unionCV,examCV,hisabCV,bricksCV,porusivaCV,percelCV;


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView=findViewById(R.id.imageSlider);

        List<SliderItem> mSliderItems = new ArrayList<>();

        mSliderItems.add(new SliderItem(R.drawable.upslider1));
        mSliderItems.add(new SliderItem(R.drawable.upslider2));
        mSliderItems.add(new SliderItem(R.drawable.service_covid));




        SliderAdapter adapter = new SliderAdapter(this,mSliderItems);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        statusBarColorChange();
        //union name List
        districtNameList();
        hotLineCalling();
        needService();
    }

    private void needService() {
        schlloCV=findViewById(R.id.schoolCV);
        unionCV=findViewById(R.id.unionCV);
        examCV=findViewById(R.id.examCV);
        hisabCV=findViewById(R.id.hisabCV);
        bricksCV=findViewById(R.id.bricksCV);
        porusivaCV=findViewById(R.id.porusovaCV);
        percelCV=findViewById(R.id.percelCV);

        schlloCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://apps.digiins.gov.bd/");
            }
        });
        unionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://comillalg.gov.bd/");
            }
        });
        examCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://onlineexam.narsingdilg.gov.bd/");
            }
        });
        hisabCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://hisab365.com/");
            }
        });
        bricksCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://amarbrick.com/");
            }
        });
        porusivaCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://sirajganjsadar.sirajganj.gov.bd/");
            }
        });
        percelCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://hisab365.com/");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void hotLineCalling() {
        call333CV=findViewById(R.id.call333CV);
        call106CV=findViewById(R.id.call106CV);
        call999CV=findViewById(R.id.call999CV);
        call109CV=findViewById(R.id.call109CV);
        call1098CV=findViewById(R.id.call1098CV);
        call1090CV=findViewById(R.id.call1090CV);

        call333CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:333"));
                startActivity(intent);
            }
        });
        call999CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:999"));
                startActivity(intent);
            }
        });
        call106CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:106"));
                startActivity(intent);
            }
        });
        call1090CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1090"));
                startActivity(intent);
            }
        });
        call109CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:109"));
                startActivity(intent);
            }
        });
        call1098CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1098"));
                startActivity(intent);
            }
        });
    }

    private void districtNameList() {
        ctgDivisionCV=findViewById(R.id.ctgDivisionCV);
        rajsahiDivisionCV=findViewById(R.id.rajsahiDivisionCV);
        khulnaDivisionCV=findViewById(R.id.khulnaDivisionCV);
        borisalDivisionCV=findViewById(R.id.borisalDivisionCV);
        shyletDivisionCV=findViewById(R.id.shyletDivisionCV);
        dhakaDivisionCV=findViewById(R.id.dhakaDivisionCV);
        rongpurDivisionCV=findViewById(R.id.rongpurDivisionCV);
        maymonSingDivisionCV=findViewById(R.id.moymonsingDivisionCV);

        maymonSingDivisionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MaymonSingDivisionActivity.class);
                startActivity(intent);
            }
        });

        rongpurDivisionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RongpurDivisionActivity.class);
                startActivity(intent);
            }
        });

        dhakaDivisionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, DhakaDivisionActivity.class);
                startActivity(intent);
            }
        });

        shyletDivisionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SiletDivisionActivity.class);
                startActivity(intent);
            }
        });

        borisalDivisionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BorisalDivisionActivity.class);
                startActivity(intent);
            }
        });


        khulnaDivisionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, KhulnaDivisionActivity.class);
                startActivity(intent);
            }
        });

        ctgDivisionCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, CtgDivisionActivity.class);
                startActivity(intent);
            }
        });

       rajsahiDivisionCV.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this, RajsahiDivisionActivity.class);
               startActivity(intent);
           }
       });

    }

    private void statusBarColorChange() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.dashboard_statusbar));
        }
    }
}