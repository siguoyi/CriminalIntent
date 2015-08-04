package com.buptant.antcl.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by antcl on 2015/8/4.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
