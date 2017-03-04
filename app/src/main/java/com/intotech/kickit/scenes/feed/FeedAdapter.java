package com.intotech.kickit.scenes.feed;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.intotech.kickit.R;
import com.intotech.kickit.databinding.ItemFeedBinding;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedAdapterViewHolder> {

    private final List<String> items;

    public FeedAdapter(List<String> items) {
        this.items = items;

    }

    @Override
    public FeedAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemFeedBinding itemFeedBinding = DataBindingUtil.inflate(inflater, R.layout.item_feed, parent, false);
        return new FeedAdapterViewHolder(itemFeedBinding);
    }

    @Override
    public void onBindViewHolder(FeedAdapterViewHolder holder, int position) {
        holder.bindView(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class FeedAdapterViewHolder extends RecyclerView.ViewHolder {
        ItemFeedBinding binding;

        public FeedAdapterViewHolder(ItemFeedBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }

        public void bindView(String str) {
            binding.tvDescription.setText(str);
        }

    }
}
