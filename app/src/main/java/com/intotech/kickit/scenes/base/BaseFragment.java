package com.intotech.kickit.scenes.base;

import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;

public abstract class BaseFragment extends Fragment{

    public abstract @StringRes int getTitle();
}
