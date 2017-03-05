package com.intotech.kickit.scenes.personalarea;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.FragmentPersonalAreaBinding;
import com.intotech.kickit.scenes.base.BaseFragment;
import com.intotech.kickit.scenes.presenters.PersonalAreaPresenter;
import com.intotech.kickit.scenes.views.IPersonalAreaView;

import java.util.List;

public class FragmentPersonalArea extends BaseFragment implements IPersonalAreaView {

    private FragmentPersonalAreaBinding binding;
    private PersonalAreaPresenter presenter;

    public static BaseFragment getInstance() {
        return new FragmentPersonalArea();
    }

    @Override
    public int getTitle() {
        return R.string.title_personal_area;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        presenter = new PersonalAreaPresenter(this);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_personal_area, container, false);


        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.onViewCreated();
    }


    @Override
    public void setTabs(List<BaseFragment> fragments) {
        PersonalAreaAdapter personalAreaAdapter = new PersonalAreaAdapter(getFragmentManager(), fragments);
        binding.vpPersonalArea.setAdapter(personalAreaAdapter);

        TabLayout tabLayout = binding.tbPersonalArea;
        for (BaseFragment frag : fragments) {
            tabLayout.addTab(tabLayout.newTab().setText(frag.getTitle()));
        }

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(binding.vpPersonalArea);
    }
}
