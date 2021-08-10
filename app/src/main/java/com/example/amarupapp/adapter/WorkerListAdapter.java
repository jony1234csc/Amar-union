package com.example.amarupapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amarupapp.R;
import com.example.amarupapp.model.WorkerList;

import java.text.BreakIterator;
import java.util.List;
import java.util.Locale;

public class WorkerListAdapter extends RecyclerView.Adapter<WorkerListAdapter.MyViewHolder> {
    private Context context;
    List<WorkerList> workerLists;

   private TextToSpeech textToSpeech;


    public WorkerListAdapter(Context context, List<WorkerList> workerLists) {
        this.context = context;
        this.workerLists = workerLists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.workerlist_sample_row, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        WorkerList workerList = workerLists.get(position);

        holder.profileIV.setImageResource(workerList.getProfileImage());
        holder.nameTV.setText(workerList.getName());
        holder.postTV.setText(workerList.getPost());
        holder.emailTV.setText(workerList.getEmail());
        holder.officePhoneTV.setText(workerList.getOfficePhone());
        holder.mobileTV.setText(workerList.getMobile());

        holder.callOfficePhoneID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + workerList.getOfficePhone()));
                context.startActivity(intent);
            }
        });

        holder.callMobileID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + workerList.getMobile()));
                context.startActivity(intent);
            }
        });

        holder.emailSendIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
                intent.setData(Uri.parse("mailto:" + workerList.getEmail())); // or just "mailto:" for blank
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                context.startActivity(intent);
            }
        });
        holder.smsNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("smsto:" + workerList.getOfficePhone()));
                smsIntent.putExtra("sms_body", "Hello");
                context.startActivity(smsIntent);
            }
        });

        holder.saveNumberID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE, workerList.getOfficePhone());
                intent.putExtra(ContactsContract.Intents.Insert.NAME, workerList.getName());
                // intent.putExtra(ContactsContract.Intents.Insert.PHONE, "15417543010");
                context.startActivity(intent);
            }
        });

        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });

        holder.soundInformationID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = workerList.getName() + " " + workerList.getPost() + "" + workerList.getEmail()
                                 + "" + workerList.getOfficePhone() + "" + workerList.getMobile();

                textToSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }



    @Override
    public int getItemCount() {
        return workerLists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView profileIV;
        private TextView nameTV, postTV, emailTV, officePhoneTV, mobileTV;
        private LinearLayout callOfficePhoneID, callMobileID, smsNumber, soundInformationID;
        private ImageView emailSendIV, saveNumberID;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            profileIV = itemView.findViewById(R.id.profile_image);
            nameTV = itemView.findViewById(R.id.nameTV);
            postTV = itemView.findViewById(R.id.postTV);
            emailTV = itemView.findViewById(R.id.emailTV);
            officePhoneTV = itemView.findViewById(R.id.phoneOfficeTV);
            mobileTV = itemView.findViewById(R.id.mobilTV);
            callOfficePhoneID = itemView.findViewById(R.id.callOfficePhoneID);
            emailSendIV = itemView.findViewById(R.id.emailSendIV);
            smsNumber = itemView.findViewById(R.id.smsNumberID);
            callMobileID = itemView.findViewById(R.id.callMobilID);
            saveNumberID = itemView.findViewById(R.id.saveNumberID);
            soundInformationID = itemView.findViewById(R.id.soundInformationID);


        }
    }

}
