package com.intotech.kickit.scenes.personalarea;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.FragmentMemberCardBinding;
import com.intotech.kickit.scenes.base.BaseFragment;

public class FragmentMemberCard extends BaseFragment {

    private FragmentMemberCardBinding binding;

    public static FragmentMemberCard getInstance() {
        return new FragmentMemberCard();
    }

    @Override
    public int getTitle() {
        return R.string.title_member_card;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_member_card, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.tvDoor.setText("Door");
        binding.tvDoorNumber.setText("24");
        binding.tvSector.setText("Sector");
        binding.tvSectorNumber.setText("21");
    }
}
