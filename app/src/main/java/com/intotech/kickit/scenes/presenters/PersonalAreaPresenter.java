package com.intotech.kickit.scenes.presenters;

import com.intotech.kickit.scenes.personalarea.FragmentMemberCard;
import com.intotech.kickit.scenes.personalarea.FragmentTickets;
import com.intotech.kickit.scenes.views.IPersonalAreaView;

import java.util.Arrays;

public class PersonalAreaPresenter {

    private final IPersonalAreaView view;

    public PersonalAreaPresenter(IPersonalAreaView view) {
        this.view = view;
    }

    public void onViewCreated() {
        view.setTabs(Arrays.asList(new FragmentMemberCard(), new FragmentTickets()));
    }
}
