package com.example.custom_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {

    Context context;
    List<UserPojo> userPojoList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public UserAdapter(Context context, List<UserPojo> userPojoList) {
        this.context = context;
        this.userPojoList = userPojoList;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return userPojoList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root=layoutInflater.inflate(R.layout.custom_user,null);
        ImageView cimage=root.findViewById(R.id.country_image);
        TextView cname=root.findViewById(R.id.country_name);
        TextView ccapital=root.findViewById(R.id.capital_name);
        TextView cpopulation=root.findViewById(R.id.country_population);

        cimage.setImageResource(userPojoList.get(i).getCountryImage());
        cname.setText(userPojoList.get(i).getCountryName());
        ccapital.setText(userPojoList.get(i).getCapital());
        cpopulation.setText(userPojoList.get(i).getPopulation());
        return root;
    }
}
