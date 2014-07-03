
package com.example.indianvegrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.example.indianvegrecipes.adapter.ImageAdapterST;

import java.io.PrintStream;


public class Starters extends Fragment
{

    GridView gridView;

    public Starters()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(R.layout.fragment_starters, viewgroup, false);
        gridView = (GridView)view.findViewById(R.id.gridViewStarters);
        gridView.setAdapter(new ImageAdapterST(getActivity().getApplicationContext()));
        gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int i,long arg3) {
			
				
				Intent intent = new Intent(getActivity().getApplicationContext(),RecipeDetailActivity.class);
				intent.putExtra("number", i);
                startActivity(intent);
				
			}

        });
        return view;
    }

}
