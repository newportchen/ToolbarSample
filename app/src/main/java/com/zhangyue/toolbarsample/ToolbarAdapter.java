package com.zhangyue.toolbarsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sanwe_000 on 2016/2/16.
 */
public class ToolbarAdapter extends FragmentPagerAdapter {
    private final static String[] TOOLBAR_TITLES = new String[] {"书架","精选","分类","排行","我的"};

    public ToolbarAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return BookshelfFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return TOOLBAR_TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TOOLBAR_TITLES[position % TOOLBAR_TITLES.length];
    }
}
