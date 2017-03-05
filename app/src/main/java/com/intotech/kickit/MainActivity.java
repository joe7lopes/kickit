package com.intotech.kickit;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.intotech.kickit.databinding.ActivityMainBinding;
import com.intotech.kickit.scenes.base.BaseFragment;
import com.intotech.kickit.scenes.presenters.MainPresenter;
import com.intotech.kickit.scenes.views.IMainView;


public class MainActivity extends AppCompatActivity implements IMainView, NavigationView.OnNavigationItemSelectedListener {

    ActivityMainBinding binding;

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);
        binding.navigationView.setNavigationItemSelectedListener(this);
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void showFragment(BaseFragment fragment) {
        String tag = String.valueOf(fragment.getTitle());

        if( getSupportFragmentManager().findFragmentByTag(tag) !=null) return;

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, fragment,tag);
        setTitle(fragment.getTitle());
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mainPresenter.onMenuItemSelected(item.getItemId());
        return true;
    }
}


