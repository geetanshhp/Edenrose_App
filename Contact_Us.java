package com.aboutloans.edenrose;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Contact_Us extends AppCompatActivity
{
    FloatingActionButton c1,s;
    ProgressDialog progressDialog;
    TextView n,textView_phone1,e,textView_phone2;
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference name=database.getReference("Details/Name");
    DatabaseReference phone1=database.getReference("Details/Phone");
    DatabaseReference mail=database.getReference("Details/email");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__us);
        s=findViewById(R.id.floatingShare);
        n=findViewById(R.id.idname);
        getSupportActionBar().setTitle("   Contact Us ");
        getSupportActionBar().setHomeButtonEnabled(true);
        progressDialog=new ProgressDialog(this);
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Data is being loading");
        progressDialog.show();
        c1=findViewById(R.id.floatingcall1);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView_phone1=findViewById(R.id.idphone1);
        e=findViewById(R.id.idemail);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                callnumbertwo();

            }
        });

        name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                n.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        phone1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                textView_phone1.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {

            }
        });

        mail.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                e.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }
    private void share()
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String v="We are here to answere any question you may have about our sevices \nFeel free to ask:\n Name: Suresh Soni\n Mobile No1: 8369466696 \n  Email: info@edenrose.co.in \n ";
        intent.putExtra(Intent.EXTRA_TEXT,v);
        //intent.putExtra(Intent.EXTRA_TEXT,v1);
        startActivity(Intent.createChooser(intent,"Share Via"));
    }

    private void callnumbertwo()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8369466696"));
        startActivity(i);
    }


}
