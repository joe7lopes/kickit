package com.intotech.kickit;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.intotech.kickit.databinding.ActivityMainBinding;
import com.intotech.kickit.scenes.presenters.MainPresenter;
import com.intotech.kickit.scenes.views.IMainView;


public class MainActivity extends AppCompatActivity implements IMainView {

    ActivityMainBinding binding;

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void showFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, fragment);
        transaction.commit();
    }
}
