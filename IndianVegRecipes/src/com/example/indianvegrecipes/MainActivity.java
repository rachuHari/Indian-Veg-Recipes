
package com.example.indianvegrecipes;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.indianvegrecipes.adapter.TabsPagerAdapter;


@SuppressLint("NewApi")
public class MainActivity extends FragmentActivity
    implements android.app.ActionBar.TabListener
{

    private ActionBar actionBar;
    private TabsPagerAdapter mAdapter;
    private String tabs[] = {
        "Breakfast", "Starters", "Snacks", "No onion, No garlic"
    };
    
    private ViewPager viewPager;


    @SuppressLint("NewApi")
	protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.pager);
        actionBar = getActionBar();
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(2);
        String as[] = tabs;
        int i = as.length;
        int j = 0;
        do
        {
            if (j >= i)
            {
                viewPager.setOnPageChangeListener(new OnPageChangeListener() {


                   

                    public void onPageSelected(int k)
                    {
                        actionBar.setSelectedNavigationItem(k);
                    }

					@Override
					public void onPageScrollStateChanged(int arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onPageScrolled(int arg0, float arg1, int arg2) {
						// TODO Auto-generated method stub
						
					}
           
                });
                return;
            }
            String s = as[j];
            actionBar.addTab(actionBar.newTab().setText(s).setTabListener(this));
            j++;
        } while (true);
    }

   

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
        viewPager.setCurrentItem(tab.getPosition());
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }

}
