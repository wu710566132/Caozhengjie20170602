package com.bwie.test.caozhengjie20170602;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Date：2017/6/2
 * author: 曹政杰Administrator.
 * function：
 */

public class MyFragPageAdper extends FragmentPagerAdapter {
    private List<Fragment> list;
    public MyFragPageAdper(FragmentManager fm,List<Fragment> list) {
        super(fm);
        this.list=list;

    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
