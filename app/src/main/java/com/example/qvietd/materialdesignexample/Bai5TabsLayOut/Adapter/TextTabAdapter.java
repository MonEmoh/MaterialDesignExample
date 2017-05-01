package com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by qvietd on 29-04-17.
 */

public class TextTabAdapter extends FragmentStatePagerAdapter{

    private List<Fragment>listFragment;
    private List<String>listTitle;
    public TextTabAdapter(FragmentManager fm) {
        super(fm);
    }

    public TextTabAdapter(FragmentManager fm, List<Fragment> listFragment, List<String> listTitle) {
        super(fm);
        this.listFragment = listFragment;
        this.listTitle = listTitle;
    }


    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position);
    }
}
