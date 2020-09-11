package com.aboutloans.edenrose;

import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class About_Us extends AppCompatActivity
{
    TextView textView,textView1;
    ProgressDialog progressDialog;
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference p1=database.getReference("About_us/P1");
    DatabaseReference p2=database.getReference("About_us/P2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__us);
        textView=findViewById(R.id.idtextabout1);
        getSupportActionBar().setTitle("   About Us ");
        getSupportActionBar().setHomeButtonEnabled(true);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView1=findViewById(R.id.idtextabout2);
        progressDialog=new ProgressDialog(this);
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Data is being loading");
        progressDialog.show();
        p1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {

                String s1=dataSnapshot.getValue(String.class);
                textView.setText(s1);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Toast.makeText(About_Us.this, "No Internet", Toast.LENGTH_SHORT).show();
            }
        });
        p2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s2=dataSnapshot.getValue(String.class);
                textView1.setText(s2);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
