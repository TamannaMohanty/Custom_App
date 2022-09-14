package com.example.custom_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView customlist;
    UserPojo userPojo;
    UserAdapter userAdapter;
    List<UserPojo> userPojoList=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customlist = findViewById(R.id.customList);
        userAdapter=new UserAdapter(this,userPojoList);
        customlist.setAdapter(userAdapter);

        //loadUserData();
        loadUserData1();



        customlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("countryImageKey",userPojoList.get(i).getCountryImage());
                intent.putExtra("countrykey",userPojoList.get(i).getCountryName());
                intent.putExtra("capitalkey",userPojoList.get(i).getCapital());
                intent.putExtra("populationkey",userPojoList.get(i).getPopulation());
                intent.putExtra("descriptionkey",userPojoList.get(i).getDescription());
                startActivity(intent);

            }
        });
    }

    private void loadUserData1() {

        userPojo=new UserPojo(R.drawable.india,"India","Delhi","1.38billion","The capital of India is New Delhi");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.unitedkingdom,"United Kingdom","London","67.89million","The capital of UK is London");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.germany1,"Germany","Berlin","83.13million","The capital of Germany is Berlin");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.australia,"Australia","Canberra","25.36million","The capital of Australia is Canberra");
        userPojoList.add(userPojo);

        userAdapter.notifyDataSetChanged();
    }
}