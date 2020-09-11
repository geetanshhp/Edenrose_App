package com.aboutloans.edenrose;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Homeloans extends AppCompatActivity
{
    ProgressDialog progressDialog;
    Button button;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,bl1,bl2,bl3,cl1,cl2,cl3,sc1,sc2,sc3,el1,el2,pl1,pl2;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference Wp1=firebaseDatabase.getReference("Home Loan/What is Home Loan");
    DatabaseReference Wp2=firebaseDatabase.getReference("Home Loan/What is Home loan2");
    DatabaseReference Wp3=firebaseDatabase.getReference("Home Loan/What is Home loan3");
    DatabaseReference Tp1=firebaseDatabase.getReference("Home Loan/T1");
    DatabaseReference Tp2=firebaseDatabase.getReference("Home Loan/T2");
    DatabaseReference Tp3=firebaseDatabase.getReference("Home Loan/T3");
    DatabaseReference Tp4=firebaseDatabase.getReference("Home Loan/T4");
    DatabaseReference Tp5=firebaseDatabase.getReference("Home Loan/T5");
    DatabaseReference Tp6=firebaseDatabase.getReference("Home Loan/T6");
    DatabaseReference Tp7=firebaseDatabase.getReference("Home Loan/T7");
    DatabaseReference Tp8=firebaseDatabase.getReference("Home Loan/T8");
    DatabaseReference BL1=firebaseDatabase.getReference("Business_loan/P1");
    DatabaseReference BL2=firebaseDatabase.getReference("Business_loan/P2");
    DatabaseReference BL3=firebaseDatabase.getReference("Business_loan/P3");
    DatabaseReference CL1=firebaseDatabase.getReference("Car_Loan/P1");
    DatabaseReference CL2=firebaseDatabase.getReference("Car_Loan/P2");
    DatabaseReference CL3=firebaseDatabase.getReference("Car_Loan/P3");
    DatabaseReference SC1=firebaseDatabase.getReference("Small_Cash/P1");
    DatabaseReference SC2=firebaseDatabase.getReference("Small_Cash/P2");
    DatabaseReference SC3=firebaseDatabase.getReference("Small_Cash/P3");
    DatabaseReference EL1=firebaseDatabase.getReference("Education_Loan/P1");
    DatabaseReference EL2=firebaseDatabase.getReference("Education_Loan/P2");
    DatabaseReference PL1=firebaseDatabase.getReference("Personal_Loan/P1");
    DatabaseReference PL2=firebaseDatabase.getReference("Personal_Loan/P2");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeloans);
        progressDialog=new ProgressDialog(this);
        progressDialog.setTitle("Please wait");
        progressDialog.setMessage("Data is being loading");
        progressDialog.show();
        getSupportActionBar().setTitle(" Type of Loans ");
        getSupportActionBar().setHomeButtonEnabled(true);
        t1=findViewById(R.id.idtext1);
        t2=findViewById(R.id.idtext2);
        t3=findViewById(R.id.idtext3);
        t4=findViewById(R.id.idType1);
        t5=findViewById(R.id.idType2    );
        t6=findViewById(R.id.idType3);
        t7=findViewById(R.id.idType4);
        t8=findViewById(R.id.idType5);
        t9=findViewById(R.id.idType6);
        t10=findViewById(R.id.idType7);
        t11=findViewById(R.id.idType8);
        bl1=findViewById(R.id.BLidtext1);
        bl2=findViewById(R.id.BLidtext2);
        bl3=findViewById(R.id.BLidtext3);
        cl1=findViewById(R.id.CLidtext1);
        cl2=findViewById(R.id.CLidtext2);
        cl3=findViewById(R.id.CLidtext3);
        sc1=findViewById(R.id.SCidtext1);
        sc2=findViewById(R.id.SCidtext2);
        sc3=findViewById(R.id.SCidtext3);
        el1=findViewById(R.id.ELidtext1);
        el2=findViewById(R.id.ELidtext2);
        pl1=findViewById(R.id.PLidtext1);
        pl2=findViewById(R.id.PLidtext2);
        button=findViewById(R.id.idhelp);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                help();

            }
        });
        PL1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                pl1.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        PL2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                pl2.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        CL1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                cl1.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        CL2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                cl2.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        CL3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                cl3.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        EL1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                el1.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        EL2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                el2.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        SC1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sc1.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SC2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sc2.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SC3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sc3.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



        Wp1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s1=dataSnapshot.getValue(String.class);
                t1.setText(s1);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wp2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s2=dataSnapshot.getValue(String.class);
                t2.setText(s2);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wp3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s3=dataSnapshot.getValue(String.class);
                t3.setText(s3);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s4=dataSnapshot.getValue(String.class);
                t4.setText(s4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s1=dataSnapshot.getValue(String.class);
                t5.setText(s1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s2=dataSnapshot.getValue(String.class);
                t6.setText(s2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s3=dataSnapshot.getValue(String.class);
                t7.setText(s3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s5=dataSnapshot.getValue(String.class);
                t8.setText(s5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s9=dataSnapshot.getValue(String.class);
                t9.setText(s9);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s10=dataSnapshot.getValue(String.class);
                t10.setText(s10);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Tp8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s0=dataSnapshot.getValue(String.class);
                t11.setText(s0);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BL1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                bl1.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BL2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                bl2.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BL3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                bl3.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    private void help()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8369466696"));
        startActivity(i);

    }
}
