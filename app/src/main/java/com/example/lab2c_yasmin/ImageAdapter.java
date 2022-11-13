package com.example.lab2c_yasmin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.cat_1, R.drawable.cat_2, R.drawable.cat_3, R.drawable.cat_4, R.drawable.cat_5, R.drawable.cat_6, R.drawable.cat_7,
            R.drawable.cat_8, R.drawable.cat_9,

    };

    public ImageAdapter (Context c){mContext = c;}

    @Override
    public int getCount(){ return thumbImages.length; }

    @Override
    public Object getItem(int position){ return thumbImages[position];}

    @Override
    public long getItemId(int position){ return 0;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
