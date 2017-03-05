package com.intotech.kickit.scenes.personalarea;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.intotech.kickit.scenes.base.BaseFragment;

import java.util.List;

public class PersonalAreaAdapter extends FragmentStatePagerAdapter {

    private List<BaseFragment> frags;

    public PersonalAreaAdapter(FragmentManager fm, List<BaseFragment> frags) {
        super(fm);
        this.frags = frags;
    }

    @Override
    public Fragment getItem(int position) {
        return frags.get(position);
    }

    @Override
    public int getCount() {
        return frags.size();
    }
}
