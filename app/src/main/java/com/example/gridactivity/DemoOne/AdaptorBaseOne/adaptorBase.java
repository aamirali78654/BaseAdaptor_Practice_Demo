package com.example.gridactivity.DemoOne.AdaptorBaseOne;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.gridactivity.R;

public class adaptorBase extends BaseAdapter
{
    Context context;
    int[] data;
    LayoutInflater lf ;

    public adaptorBase(Context context, int[] data)
    {
        this.context = context;
        this.data = data;
        lf = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.length;
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
    public View getView(int i, View view, ViewGroup viewGroup)
    {
    view = lf.inflate(R.layout.image_one_adaptor, null);
        ImageView img = view.findViewById(R.id.image_idAdaptor);
        img.setImageResource(data[i]);
        return view;
    }
}
