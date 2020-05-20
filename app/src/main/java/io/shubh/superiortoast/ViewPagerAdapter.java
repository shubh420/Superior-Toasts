package io.shubh.superiortoast;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new FragmentA();
        }
        else if (position == 1)
        {
            fragment = new FragmentB();
        }
        else if (position == 2)
        {
            fragment = new FragmentC();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Toast";
        }
        else if (position == 1)
        {
            title = "Toast pre designed";
        }
        else if (position == 2)
        {
            title = "Customizations";
        }

        return title;
    }
}
