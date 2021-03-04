package com.example.designingfiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adaptersnap extends BaseAdapter {

    Context sContext;
    String [] sList1;
    String [] sList2;
    String [] sList3;
    String [] sList4;
    int [] simage1;


    public Adaptersnap(Context sContext, String[] name1, String[] name2, String[] name3, String[] name4, int[] snapImages) {
        this.sContext=sContext;
        this.sList1=name1;
        this.sList2=name2;
        this.sList3=name3;
        this.sList4=name4;
        this.simage1=snapImages;

    }

    @Override
    public int getCount() {
        return sList1.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view;
        if (convertView==null){

            LayoutInflater inflater = LayoutInflater.from(sContext);
            view=inflater.inflate(R.layout.snaplist,null);
        } else {
            view =convertView;
        }
        TextView text1 = view.findViewById(R.id.txtsnap1);
        TextView text2 =view.findViewById(R.id.Txtsnap2);
        TextView text3 = view.findViewById(R.id.Txtsnap3);
        TextView text4= view.findViewById(R.id.txtsnap4);
        CircleImageView Image1= view.findViewById(R.id.ImageSnap);
        text1.setText(sList1[position]);
        text2.setText(sList2[position]);
        text3.setText(sList3[position]);
        text4.setText(sList4[position]);
        Image1.setImageResource(simage1[position]);

        return view;

    }



}
