package com.intotech.kickit.model;

import java.util.List;

/**
 * Created by joe on 05/03/2017.
 */

public class FeedDataVM {
    private List<FeedVM> listFeedVM;
    private List<MatchesFeedVM> listMatchesVM;

    public FeedDataVM(List<FeedVM> listFeedVM, List<MatchesFeedVM> listMatchesVM) {
        this.listFeedVM = listFeedVM;
        this.listMatchesVM = listMatchesVM;
    }

    public List<FeedVM> getListFeedVM() {
        return listFeedVM;
    }

    public List<MatchesFeedVM> getListMatchesVM() {
        return listMatchesVM;
    }
}
