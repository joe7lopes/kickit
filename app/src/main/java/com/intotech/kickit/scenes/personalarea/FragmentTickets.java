package com.intotech.kickit.scenes.personalarea;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.FragmentTicketsBinding;
import com.intotech.kickit.scenes.base.BaseFragment;

public class FragmentTickets extends BaseFragment {

    private FragmentTicketsBinding binding;

    public static FragmentTickets getInstance() {
        return new FragmentTickets();
    }

    @Override
    public int getTitle() {
        return R.string.title_tickets;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tickets, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
