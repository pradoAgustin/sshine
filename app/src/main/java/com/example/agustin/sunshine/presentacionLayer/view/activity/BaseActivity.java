package com.example.agustin.sunshine.presentacionLayer.view.activity;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class BaseActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    /**
     * Adds a {@link Fragment} to this activity's layout.
     *
     * @param containerViewId The container view to where add the fragment.
     * @param fragment The fragment to be added.
     */
    protected void addFragment(int containerViewId, Fragment fragment) {
            getSupportFragmentManager().beginTransaction()
                    .add(containerViewId, fragment).commit();
    }

}
