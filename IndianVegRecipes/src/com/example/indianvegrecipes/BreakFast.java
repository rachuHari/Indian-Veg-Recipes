
package com.example.indianvegrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.indianvegrecipes.adapter.ImageAdapterBF;


public class BreakFast extends Fragment
{

    
    GridView gridView;

    public BreakFast()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(R.layout.fragment_break_fast, viewgroup, false);
        gridView = (GridView)view.findViewById(R.id.gridViewBreakfast);
        gridView.setAdapter(new ImageAdapterBF(getActivity().getApplicationContext()));
        
        gridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

           

        	public void onItemClick(AdapterView<?> arg0, View arg1, int i,long arg3) {
        		
        		int number = 0;
			
        		switch(i){
        		case 0:
        			number=101;
        			break;
        		case 1:
        			number=102;
        			break;
        		case 2:
        			number=103;
        			break;
        		case 3:
        			number=104;
        			break;
        		case 4:
        			number=105;
        			break;
        		case 5:
        			number=106;
        			break;
        		case 6:
        			number=107;
        			break;
        		case 7:
        			number=108;
        			break;
        		case 8:
        			number=109;
        			break;
        		case 9:
        			number=110;
        			break;
        		case 10:
        			number=111;
        			break;
        		case 11:
        			number=112;
        			break;
        		case 12:
        			number=113;
        			break;
        		case 13:
        			number=114;
        			break;
        		case 14:
        			number=115;
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
