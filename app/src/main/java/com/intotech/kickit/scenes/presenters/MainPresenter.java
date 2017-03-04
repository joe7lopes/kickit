package com.intotech.kickit.scenes.presenters;

import com.intotech.kickit.scenes.feed.FragmentFeed;
import com.intotech.kickit.scenes.views.IMainView;

public class MainPresenter {

    IMainView view;

    public MainPresenter(IMainView view) {
        this.view = view;
        view.showFragment(FragmentFeed.getInstance());
    }


}
