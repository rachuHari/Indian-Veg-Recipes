
package com.example.indianvegrecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.example.indianvegrecipes.R;
import com.example.indianvegrecipes.database.Item;


public class ImageAdapterST extends BaseAdapter
{

    private LayoutInflater inflator;
    private List<Item> items;

    public ImageAdapterST(Context context)
    {
        items = new ArrayList<Item>();
        inflator = LayoutInflater.from(context);
        items.add(new Item("Baby corn manchurian", R.drawable.baby_corn_manchuria));
        items.add(new Item("Chilli paneer", R.drawable.chilli_paneer));
        items.add(new Item("Chinese bhel", R.drawable.chinese_bhel));
        items.add(new Item("Idli manchurian", R.drawable.idli_manchurian));
        items.add(new Item("Manchow soup", R.drawable.manchow_soup));
        items.add(new Item("Masala papad", R.drawable.masala_papad));
        items.add(new Item("Paneer tikka", R.drawable.paneer_tikka));
        items.add(new Item("Sweet corn soup", R.drawable.sweet_corn_veg_soup));
        items.add(new Item("Tomato soup", R.drawable.tomato_soup));
        items.add(new Item("Vegetable manchurian dry", R.drawable.vegetable_manchurian_dry));
        items.add(new Item("Vegetable soup", R.drawable.vegetable_soup));
    }

    public int getCount()
    {
        return items.size();
    }

    public Object getItem(int i)
    {
        return items.get(i);
    }

    public long getItemId(int i)
    {
        return (long)((Item)items.get(i)).drawableId;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view1 == null)
        {
            view1 = inflator.inflate(R.layout.activity_image, viewgroup, false);
            view1.setTag(R.string.image, view1.findViewById(R.id.picture));
            view1.setTag(R.string.text, view1.findViewById(R.id.text));
        }
        ImageView imageview = (ImageView)view1.getTag(R.string.image);
        TextView textview = (TextView)view1.getTag(R.string.text);
        Item item = (Item)getItem(i);
        imageview.setImageResource(item.drawableId);
        textview.setText(item.name);
        return view1;
    }
}
