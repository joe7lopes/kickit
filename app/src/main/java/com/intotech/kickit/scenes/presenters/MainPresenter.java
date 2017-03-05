package com.intotech.kickit.scenes.presenters;

import android.view.MenuItem;

import com.intotech.kickit.R;
import com.intotech.kickit.scenes.feed.FragmentFeed;
import com.intotech.kickit.scenes.views.IMainView;

public class MainPresenter {

    IMainView view;

    public MainPresenter(IMainView view) {
        this.view = view;
        view.showFragment(FragmentFeed.getInstance());
    }

    public void onMenuItemSelected(int itemId){
        if(itemId == R.id.action_feed){
            view.showFragment(FragmentFeed.getInstance());
        }
    }

}
