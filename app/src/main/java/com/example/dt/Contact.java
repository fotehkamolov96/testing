package com.example.dt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class Contact extends AppCompatActivity {
    private ViewPager2 viewPager2;
        private Handler sliderHandler=new Handler();
    private Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        backbtn=(Button) findViewById(R.id.backbtn);//nazad
        TextView txt= (TextView) findViewById(R.id.gmail); //txt is object of TextView-gmail
        TextView txt2= (TextView) findViewById(R.id.insta); //txt is object of TextView-insta

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { backbtn(); }});


//почта-gmail
        txt.setMovementMethod(LinkMovementMethod.getInstance());
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] recipients = {"kamolovfoteh@gmail.com"};//Add multiple recipients here
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Дархости Шумо"); //Add Mail Subject
                intent.putExtra(Intent.EXTRA_TEXT, "Бинавсиед савол ё дархости худро инчо...");//Add mail body
               //intent.putExtra(Intent.EXTRA_CC, "mailcc@gmail.com");//Add CC emailid's if any
               //intent.putExtra(Intent.EXTRA_BCC, "mailbcc@gmail.com");//Add BCC email id if any
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");//Added Gmail Package to forcefully open Gmail App
                startActivity(Intent.createChooser(intent, "Отправить письмо"));
                startActivity(browserIntent);


            }});
//instagram
        txt2.setMovementMethod(LinkMovementMethod.getInstance());
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.instagram.com/fkamollov"));
                startActivity(browserIntent);
            }
        });




//slid
        viewPager2=findViewById(R.id.viewpageslider);
        final List<Sliideriteam> sliideriteams = new ArrayList<>();
        sliideriteams.add(new Sliideriteam(R.drawable.slider1));

        sliideriteams.add(new Sliideriteam(R.drawable.slider2));

        sliideriteams.add(new Sliideriteam(R.drawable.slider3));

        sliideriteams.add(new Sliideriteam(R.drawable.slider4));

        sliideriteams.add(new Sliideriteam(R.drawable.slider5));

            viewPager2.setAdapter(new SliderAdp(sliideriteams, viewPager2));

            viewPager2.setClipToPadding(false);
            viewPager2.setClipChildren(false);
            viewPager2.setOffscreenPageLimit(3);
            viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer=new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(30));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r=1-Math.abs(position);
                page.setScaleY(0.75f+r*0.15f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
            //    sliderHandler.postDelayed(sliderRunnable,2500);//3seconds
            }
        });


    }





    public void backbtn(){
        Intent intent = new Intent(this, Main2.class);
        startActivity(intent);
    }



        private Runnable sliderRunnable=new Runnable() {
            @Override
            public void run() {
                viewPager2.setCurrentItem(viewPager2.getCurrentItem()+1);
            }
        };
    @Override
    protected void onPause() {
        super.onPause();
       sliderHandler.removeCallbacks(sliderRunnable);
    }
    @Override
    protected void onResume() {
        super.onResume();
        //sliderHandler.postDelayed(sliderRunnable, 3000);
    }
}
