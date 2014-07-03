
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

import com.example.indianvegrecipes.adapter.ImageAdapterNGO;

import java.io.PrintStream;


public class NoGarlicOnion extends Fragment
{

    
    GridView gridView;

    public NoGarlicOnion()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(R.layout.fragment_no_garlic_onion, viewgroup, false);
        gridView = (GridView)view.findViewById(R.id.gridViewNgo);
        gridView.setAdapter(new ImageAdapterNGO(getActivity().getApplicationContext()));
        gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int i,long arg3) {

				int number = 0;
				
        		switch(i){
        		case 0:
        			number=301;
        			break;
        		case 1:
        			number=302;
        			break;
        		case 2:
        			number=303;
        			break;
        		case 3:
        			number=304;
        			break;
        		case 4:
        			number=305;
        			break;
        		case 5:
        			number=306;
        			break;
        		case 6:
        			number=307;
        			break;
        		case 7:
        			number=308;
        			break;
        		case 8:
        			number=309;
        			break;
        		case 9:
        			number=310;
        			break;
        		case 10:
        			number=311;
        			break;
        		case 11:
        			number=312;
        			break;
        		case 12:
        			number=313;
        			break;
        		case 13:
        			number=314;
        			break;
        		case 14:
        			number=315;
        			break;
        		case 15:
        			number=316;
        			break;
        		case 16:
        			number=317;
        			break;
        		case 17:
        			number=318;
        			break;
        		case 18:
        			number=319;
        			break;
        		case 19:
        			number=320;
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
