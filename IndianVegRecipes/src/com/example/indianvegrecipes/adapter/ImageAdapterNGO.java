

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



public class ImageAdapterNGO extends BaseAdapter
{

    private LayoutInflater inflator;
    private List<Item> items;

    public ImageAdapterNGO(Context context)
    {
        items = new ArrayList<Item>();
        inflator = LayoutInflater.from(context);
        items.add(new Item("Bisibele bhath", R.drawable.bisibelebhath));
        items.add(new Item("Cauliflower peas curry", R.drawable.cauliflowerpeascurry));
        items.add(new Item("Cucumber curry", R.drawable.cucumbercurry));
        items.add(new Item("Curd rice", R.drawable.curdrice));
        items.add(new Item("Mixed vegetable kurma", R.drawable.mixedvegetablekurma));
        items.add(new Item("Paneer potato patties", R.drawable.paneerpotatopatties));
        items.add(new Item("Paneer spring rolls", R.drawable.paneerspringrolls));
        items.add(new Item("Poha bread vada", R.drawable.pohabreadvada));
        items.add(new Item("Sabudana khichdi", R.drawable.sabudanakhichdi));
        items.add(new Item("Sabudana vada", R.drawable.sabudanavada1));
        items.add(new Item("Samosa", R.drawable.samosa));
        items.add(new Item("Spicy almonds", R.drawable.spicyalmonds));
        items.add(new Item("Spicy puffed rice", R.drawable.spicypuffedrice));
        items.add(new Item("Spicy rice noodles", R.drawable.spicyricenoodles));
        items.add(new Item("Spinach vada", R.drawable.spinachvada));
        items.add(new Item("Stuffed eggplant", R.drawable.stuffedeggplant));
        items.add(new Item("Sweet potato curry", R.drawable.sweetpotatocurry));
        items.add(new Item("Tindora tomato gravy curry(Tondekayi)", R.drawable.tindoratomatogravycurry));
        items.add(new Item("Vangibath", R.drawable.vangibath));
        items.add(new Item("Vegetable vermicelli upma", R.drawable.vegetablevermicelliupma));
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
