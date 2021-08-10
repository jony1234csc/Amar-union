package com.example.amarupapp.userActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.amarupapp.R;
import com.example.amarupapp.adapter.WorkerListAdapter;
import com.example.amarupapp.model.WorkerList;

import java.util.ArrayList;
import java.util.List;

public class UpWorkerListActivity extends AppCompatActivity {
    private RecyclerView workerListRV;
    private List<WorkerList> workerLists = new ArrayList<>();
    private WorkerListAdapter workerListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_worker_list);

        workerListDataLoad();
        setRecyclerView();
        statusBarColorChange();
    }

    private void setRecyclerView() {
        workerListRV = findViewById(R.id.workerListRV);
        workerListAdapter = new WorkerListAdapter(UpWorkerListActivity.this, workerLists);
        workerListRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        workerListRV.setAdapter(workerListAdapter);
        workerListRV.setHasFixedSize(true);

    }

    private void workerListDataLoad() {
        workerLists.add(new WorkerList(R.drawable.chairmanimage, "গিয়াস উদ্দিন মুহাম্মদ", "ইউপি চেয়ারম্যান", "chairman@gmail.com", "01845272842", "01712864794"));
        workerLists.add(new WorkerList(R.drawable.socibimage, "হালিমা আক্তার", "সচিব", "sochib@gmail.com", "01712864794", "01712864794"));
        workerLists.add(new WorkerList(R.drawable.hisabsohokarimage, "মো: লোকমান হোসাইন সুমন", "হিসাব সহকারী কাম-কম্পিউটার অপারেটর", "hisabsohokari@gmail.com", "01712864794", "01712864794"));

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