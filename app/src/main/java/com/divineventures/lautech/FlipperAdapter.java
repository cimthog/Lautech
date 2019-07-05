package com.divineventures.lautech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 1/12/2018.
 */

public class FlipperAdapter extends BaseAdapter {
    Context ctx;
    int [] images;
    String[] text;
    LayoutInflater inflater;

    public FlipperAdapter(Context context, String[] myText, int[] myImages) {
        this.ctx = context;
        this.images = myImages;
        this.text = myText;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {

        return text.length;
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
        view = inflater.inflate(R.layout.flipper_items,null);
        TextView txt = (TextView) view.findViewById(R.id.infoTxt);
        ImageView flipImage = (ImageView) view.findViewById(R.id.animImage);
        txt.setText(text[i]);
        flipImage.setImageResource(images[i]);
        return view;
    }
}
