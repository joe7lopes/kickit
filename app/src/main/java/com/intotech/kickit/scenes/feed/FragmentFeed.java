package com.intotech.kickit.scenes.feed;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.FragmentFeedBinding;

import java.util.Arrays;

public class FragmentFeed extends Fragment {

    private FragmentFeedBinding binding;


    public static FragmentFeed getInstance() {
        return new FragmentFeed();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_feed, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.feedRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.feedRecycler.setAdapter(new FeedAdapter(Arrays.asList("something","benfica vai ganhar")));
    }
}
