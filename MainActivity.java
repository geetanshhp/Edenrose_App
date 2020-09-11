package com.aboutloans.edenrose;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
{

    ImageView imageView;
    //WHY WE IS CONTACT US
    CardView homeloan,emii,eligibility,why_we,apply,about,services,faq;
    Toolbar toolbar;
    Intent intent;
    ViewFlipper viewFlipper;
    ActionBarDrawerToggle actionBarDrawerToggle;
    int a[]={R.drawable.image11,R.drawable.image12,R.drawable.image1,R.drawable.image22,R.drawable.image3,R.drawable.image4,R.drawable.image13,
            R.drawable.image5,R.drawable.image16,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.homw};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeloan=findViewById(R.id.idhomeloan);
        about=findViewById(R.id.idabout_Us);
        services=findViewById(R.id.idservices);
        emii=findViewById(R.id.idemical);
        eligibility=findViewById(R.id.ideligibility);
        apply=findViewById(R.id.idapply);
        faq=findViewById(R.id.idFAQ);
        viewFlipper=findViewById(R.id.idviewflipper);
        for(int i=0;i<a.length;i++)
        {
            Slideimage(a[i]);
        }
        why_we=findViewById(R.id.idwhywe);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        imageView=findViewById(R.id.sharelink);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String s1="https://docs.google.com/forms/d/e/1FAIpQLSdzUforuLgTqUGERLhrJcSmrxR2OBxWSIg_mW32qYkhLzAk9Q/viewform?usp=sf_link";
                intent.putExtra(Intent.EXTRA_TEXT,s1);
                startActivity(Intent.createChooser(intent,"Share Via"));

            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                intent=new Intent(MainActivity.this,Faq.class);
                startActivity(intent);

            }
        });
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Services.class);
                startActivity(intent);

            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                intent=new Intent(MainActivity.this,About_Us.class);
                startActivity(intent);

            }
        });
        emii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, EMI.class);
                startActivity(intent);

            }
        });
        //WHY WE IS CONTACT US
        why_we.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Contact_Us.class);
                startActivity(intent);
            }
        });
        homeloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Homeloans.class);
                startActivity(intent);

            }
        });
        eligibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Eligibility.class);
                startActivity(intent);
            }
        });
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                intent =new Intent(MainActivity.this,Apply.class);
                startActivity(intent);

            }
        });

    }

    private void Slideimage(int i)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(i);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }


    public void onBackPressed() {


            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("CONFRIM EXIT");
            builder.setIcon(R.drawable.crosss);
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();
        }
    }

