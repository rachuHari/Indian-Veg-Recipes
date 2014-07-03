
package com.example.indianvegrecipes.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.indianvegrecipes.BreakFast;
import com.example.indianvegrecipes.NoGarlicOnion;
import com.example.indianvegrecipes.Snacks;
import com.example.indianvegrecipes.Starters;

public class TabsPagerAdapter extends FragmentPagerAdapter
{

    public TabsPagerAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public int getCount()
    {
        return 4;
    }

    public Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0:
            return new BreakFast();

        case 1: 
            return new Starters();

        case 2: 
            return new Snacks();

        case 3: 
            return new NoGarlicOnion();
        }
    }
}
