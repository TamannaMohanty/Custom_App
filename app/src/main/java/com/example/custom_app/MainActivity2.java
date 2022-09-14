package com.example.custom_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView countryImage;
    TextView  countryName,capitalName,population,description;

    String countryImageStr, countryNameStr,capitalNameStr,populationStr,descriptionStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


       countryImage=findViewById(R.id.imagedisplay);
        countryName=findViewById(R.id.nameTxt);
        capitalName=findViewById(R.id.capitalTxt);
        population=findViewById(R.id.populationTxt);
        description=findViewById(R.id.descriptionTxt);


        countryNameStr=getIntent().getStringExtra("countrykey");
        capitalNameStr=getIntent().getStringExtra("capitalkey");
        populationStr=getIntent().getStringExtra("populationkey");
        descriptionStr=getIntent().getStringExtra("descriptionkey");







        countryName.setText(""+countryNameStr);
        capitalName.setText(""+capitalNameStr);
        population.setText(""+populationStr);
        description.setText(""+descriptionStr);

        int imageid = getIntent().getIntExtra("countryImageKey",0);
        countryImage.setImageResource(imageid);



    }
}