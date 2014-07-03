

package com.example.indianvegrecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.indianvegrecipes.*;

import java.util.ArrayList;
import java.util.List;

import com.example.indianvegrecipes.database.Item;



public class ImageAdapterBF extends BaseAdapter
{

    private LayoutInflater inflator;
    private List<Item> items;

    public ImageAdapterBF(Context context)
    {
        items = new ArrayList<Item>();
        inflator = LayoutInflater.from(context);
        items.add(new Item("Aloo gobi paratha", R.drawable.aloo_gobi_paratha));
        items.add(new Item("Dosamade with rice flour", R.drawable.dosamade_with_rice_flour_recipe11));
        items.add(new Item("Gojju avalakki recipe", R.drawable.gojju_avalakki_recipe));
        items.add(new Item("Onion potato poha", R.drawable.kanda_batata_poha));
        items.add(new Item("Masala dosa with coconut chutney", R.drawable.masala_dosa_with_coconut_chutney));
        items.add(new Item("Masala idli", R.drawable.masala_idli));
        items.add(new Item("Masala paddu", R.drawable.masala_paddu));
        items.add(new Item("Methi thepla", R.drawable.methi_thepla_fenugreek_flatbread));
        items.add(new Item("Misal pav", R.drawable.misal_pav_recipe));
        items.add(new Item("Paneer bhurji", R.drawable.paneer_bhurji_recipe));
        items.add(new Item("Poori bhaji", R.drawable.poori_bhaji));
        items.add(new Item("Semiya pulao", R.drawable.semiya_pulao));
        items.add(new Item("Soft idli", R.drawable.soft_idli));
        items.add(new Item("Tomato omelette", R.drawable.tomato_omelette_recipe));
        items.add(new Item("Uttapam", R.drawable.uttapam_med));
        items.add(new Item("Veg grilled sandwich", R.drawable.veg_grilled_sandwich_recipe));
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
