package com.divineventures.lautech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 1/11/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    String fac_list[];
    int IMAGE [];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] faculty_list, int IMAGES[]) {
        this.context = context;
        this.fac_list = faculty_list;
        this.IMAGE = IMAGES;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return fac_list.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.faculty_list,null);
        TextView fac_name = (TextView)  view.findViewById(R.id.textView);
        ImageView icon = (ImageView)   view.findViewById(R.id.imageView);
        fac_name.setText(fac_list[i]);
        icon.setImageResource(IMAGE[i]);
        return view;
    }
}
