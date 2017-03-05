package com.intotech.kickit.scenes.feed;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.FragmentFeedBinding;
import com.intotech.kickit.model.FeedDataVM;
import com.intotech.kickit.model.FeedVM;
import com.intotech.kickit.model.MatchesFeedVM;
import com.intotech.kickit.scenes.base.BaseFragment;

import java.util.Arrays;

public class FragmentFeed extends BaseFragment {

    private FragmentFeedBinding binding;


    public static FragmentFeed getInstance() {
        return new FragmentFeed();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_feed, container, false);
        Log.e("TAG", "onCreateView");
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.feedRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        FeedDataVM feedVMList = getFeeds();
        binding.feedRecycler.setAdapter(new FeedAdapter(feedVMList));
    }

    @NonNull
    private FeedDataVM getFeeds() {
        //TODO get from server
        FeedVM one = new FeedVM("tag name", "13:50", "description", "img url");
        FeedVM two = new FeedVM("tag name", "13:50", "description", "img url");
        FeedVM three = new FeedVM("tag name", "13:50", "description", "img url");

        MatchesFeedVM mf1 = new MatchesFeedVM("url1", "url2", "FRI 02/03", "15:30", "Liga NOS", "");
        MatchesFeedVM mf2 = new MatchesFeedVM("url1", "url2", "FRI 02/03", "15:30", "Liga NOS", "");
        MatchesFeedVM mf3 = new MatchesFeedVM("url1", "url2", "FRI 02/03", "15:30", "Liga NOS", "");

        return new FeedDataVM(
                Arrays.asList(one, two, three),
                Arrays.asList(mf1, mf2, mf3)
        );
    }

    @Override
    public int getTitle() {
        return R.string.title_feed;

    }
}
