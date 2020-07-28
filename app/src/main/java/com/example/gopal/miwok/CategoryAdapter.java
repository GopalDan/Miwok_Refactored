package com.example.gopal.miwok;

/**
 * Created by Gopal on 10/21/2018.
 */


//package com.example.android.miwok;

        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "NumbersActiity";
        } else if (position == 1) {
            return "FamilyActivity";
        } else if (position == 2) {
            return "ColorsActivity";
        } else {
            return "PhraseActivity";
        }
    }
}