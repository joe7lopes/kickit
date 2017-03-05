package com.intotech.kickit.scenes.feed;


import android.databinding.DataBindingUtil;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.ItemFeedMatchesBinding;
import com.intotech.kickit.databinding.ItemVpMatchesBinding;
import com.intotech.kickit.model.MatchesFeedVM;

import java.util.List;

public class MatchesFeedAdapter extends PagerAdapter {

    List<MatchesFeedVM> matchesFeed;

    public MatchesFeedAdapter(List<MatchesFeedVM> matchesFeed) {
        this.matchesFeed = matchesFeed;
    }

    @Override
    public int getCount() {
        return matchesFeed.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    public Object instantiateItem(ViewGroup container, int position) {
       LayoutInflater inflater= LayoutInflater.from(container.getContext());
        ItemVpMatchesBinding binding= DataBindingUtil.inflate(inflater, R.layout.item_vp_matches,container,true);
        setBindingValues(position, binding);

        return binding.getRoot();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    private void setBindingValues(int position, ItemVpMatchesBinding binding) {
        //TODO SET images
        MatchesFeedVM match = matchesFeed.get(position);
        binding.tvDate.setText(match.getDate());
        binding.tvHour.setText(match.getHour());
        binding.tvLeague.setText(match.getLeague());
        binding.tvNextMatch.setText(match.getNextMatch());
    }


}
