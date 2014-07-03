
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

import com.example.indianvegrecipes.adapter.ImageAdapterSNKS;

import java.io.PrintStream;


public class Snacks extends Fragment
{

    GridView gridView;

    public Snacks()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(R.layout.fragment_snacks, viewgroup, false);
        gridView = (GridView)view.findViewById(R.id.gridViewSnacks);
        gridView.setAdapter(new ImageAdapterSNKS(getActivity().getApplicationContext()));
        gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int i,long arg3) {
				int number = 0;
				
        		switch(i){
        		case 0:
        			number=201;
        			break;
        		case 1:
        			number=202;
        			break;
        		case 2:
        			number=203;
        			break;
        		case 3:
        			number=204;
        			break;
        		case 4:
        			number=205;
        			break;
        		case 5:
        			number=206;
        			break;
        		case 6:
        			number=207;
        			break;
        		case 7:
        			number=208;
        			break;
        		case 8:
        			number=209;
        			break;
        		case 9:
        			number=210;
        			break;
        		case 10:
        			number=211;
        			break;
        		case 11:
        			number=212;
        			break;
        		case 12:
        			number=213;
        			break;
        		case 13:
        			number=214;
        			break;
        		case 14:
        			number=215;
        			break;
        		
        		}		
        		Intent intent = new Intent(getActivity().getApplicationContext(),RecipeDetailActivity.class);
				intent.putExtra("number", number);
                startActivity(intent);
			}

            
        });
        return view;
    }

}
