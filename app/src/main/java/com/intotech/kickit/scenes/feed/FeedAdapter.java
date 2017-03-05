package com.intotech.kickit.scenes.feed;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.ItemFeedBinding;
import com.intotech.kickit.databinding.ItemFeedMatchesBinding;
import com.intotech.kickit.model.FeedDataVM;
import com.intotech.kickit.model.FeedVM;
import com.intotech.kickit.model.MatchesFeedVM;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final FeedDataVM feedData;
    private final int MATCHES = 0;
    private final int FEED = 1;

    public FeedAdapter(FeedDataVM feedData) {
        this.feedData = feedData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if(viewType == MATCHES){
            ItemFeedMatchesBinding itemMatches = DataBindingUtil.inflate(inflater, R.layout.item_feed_matches, parent, false);
            return new FeedMatchesViewHolder(itemMatches);
        }else{
            ItemFeedBinding itemFeedBinding = DataBindingUtil.inflate(inflater, R.layout.item_feed, parent, false);
            return new FeedAdapterViewHolder(itemFeedBinding);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return (position==0)? MATCHES:FEED;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(position==0){
            ((FeedMatchesViewHolder)holder).bindView(feedData.getListMatchesVM());
        }else{
            ((FeedAdapterViewHolder)holder).bindView(feedData.getListFeedVM().get(position));
        }
    }

    @Override
    public int getItemCount() {
        return feedData.getListFeedVM().size();
    }

    static class FeedAdapterViewHolder extends RecyclerView.ViewHolder {
        private ItemFeedBinding binding;

        public FeedAdapterViewHolder(ItemFeedBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }

        public void bindView(FeedVM feed) {
            //TODO set image
            binding.tvTag.setText(feed.getTag());
            binding.tvHours.setText(feed.getHour());
            binding.tvDescription.setText(feed.getDescription());
        }

    }


    static class FeedMatchesViewHolder extends RecyclerView.ViewHolder{
        private ItemFeedMatchesBinding binding;

        public FeedMatchesViewHolder(ItemFeedMatchesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindView(List<MatchesFeedVM> matches) {
            binding.vpMatches.setAdapter(new MatchesFeedAdapter(matches));
        }

    }
}
