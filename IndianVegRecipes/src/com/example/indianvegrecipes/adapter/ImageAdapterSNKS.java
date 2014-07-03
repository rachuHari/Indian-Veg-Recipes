

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


public class ImageAdapterSNKS extends BaseAdapter
{

    private LayoutInflater inflator;
    private List<Item> items;

    public ImageAdapterSNKS(Context context)
    {
        items = new ArrayList<Item>();
        inflator = LayoutInflater.from(context);
        items.add(new Item("Aloo vada(Batata vada)", R.drawable.aloovada_batatavada));
        items.add(new Item("Bhel puri chat", R.drawable.bhel_puri_chat));
        items.add(new Item("Corn fingers", R.drawable.corn_fingers));
        items.add(new Item("Corn vada", R.drawable.corn_vada));
        items.add(new Item("Dabeli spicy potato sandwich", R.drawable.dabeli_spicy_potato_sandwich));
        items.add(new Item("Dahi vada recipe", R.drawable.dahi_vada_recipe));
        items.add(new Item("Mirchi vada chili fritters", R.drawable.mirchi_vada_chili_fritters));
        items.add(new Item("Moong dal vada", R.drawable.moong_dal_vada));
        items.add(new Item("Murukku", R.drawable.murukku));
        items.add(new Item("Peanut chaat", R.drawable.peanut_chaat));
        items.add(new Item("Potato paneer tots", R.drawable.potato_paneer_tots));
        items.add(new Item("Potato skins", R.drawable.potato_skins));
        items.add(new Item("Rava dhokla", R.drawable.rava_dhokla));
        items.add(new Item("Vada pav", R.drawable.vada_pav));
        items.add(new Item("Vegetable pakora", R.drawable.vegetable_pakora));
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
