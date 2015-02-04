package com.gravitybd.navigationtemplate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by adnan on 2/2/15.
 */
class CustomAdapter extends BaseAdapter {

    private Context context;

    String[] item;
    int[] images = {R.drawable.now, R.drawable.overview, R.drawable.bybar, R.drawable.bydate};

    public CustomAdapter(Context context) {

        this.context = context;
        item = context.getResources().getStringArray(R.array.items);
    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return item[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = null;
        if (convertView == null) {


            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.custom_list_row, parent, false);

        } else {
            row = convertView;

        }

        TextView itemName = (TextView) row.findViewById(R.id.txtNavItem);
        ImageView imageView = (ImageView) row.findViewById(R.id.imgNavItem);

        itemName.setText(item[position]);
        imageView.setImageResource(images[position]);

        return row;
    }








}

