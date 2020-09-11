package com.aboutloans.edenrose;

import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Services extends AppCompatActivity
{
    ProgressDialog progressDialog;
    TextView cc1,cc2,inv1,inv2,ins1,ins2;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference CC1=firebaseDatabase.getReference("Credit/P1");
    DatabaseReference CC2=firebaseDatabase.getReference("Credit/P2");
    DatabaseReference INV1=firebaseDatabase.getReference("Investments/P1");
    DatabaseReference INV2=firebaseDatabase.getReference("Investments/P2");
    DatabaseReference INSU1=firebaseDatabase.getReference("Insurance/P1");
    DatabaseReference INSU2=firebaseDatabase.getReference("Insurance/P2");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        cc1=findViewById(R.id.CCidtext1);
        cc2=findViewById(R.id.CCidtext2);
        inv1=findViewById(R.id.inverstmentidtext1);
        inv2=findViewById(R.id.invertmentidtext2);
        ins1=findViewById(R.id.Iidtext1);
        ins2=findViewById(R.id.Iidtext2);
        getSupportActionBar().setTitle("   Services ");
        getSupportActionBar().setHomeButtonEnabled(true);
        progressDialog=new ProgressDialog(this);
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Data is being Loading");
        progressDialog.show();
        CC1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                cc1.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        CC2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                cc2.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        INV1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                inv1.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        INV2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                inv2.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        INSU1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ins1.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        INSU2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ins2.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
