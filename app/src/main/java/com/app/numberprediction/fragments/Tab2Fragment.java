package com.app.numberprediction.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.numberprediction.R;

public class Tab2Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }


    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Nest1Fragment.newInstance(1);
                case 1:
                    return Nest1Fragment.newInstance(2);
                case 2:
                    return Nest1Fragment.newInstance(3);
                case 3:
                    return Nest1Fragment.newInstance(1);
                case 4:
                    return Nest1Fragment.newInstance(2);
                case 5:
                    return Nest1Fragment.newInstance(3);
                case 6:
                    return Nest1Fragment.newInstance(1);
                case 7:
                    return Nest1Fragment.newInstance(2);
                case 8:
                    return Nest1Fragment.newInstance(3);
                case 9:
                    return Nest1Fragment.newInstance(1);
                case 10:
                    return Nest1Fragment.newInstance(2);
                case 11:
                    return Nest1Fragment.newInstance(3);
                    default:
                        return Nest1Fragment.newInstance(4);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 12;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Nested 1";
                case 1:
                    return "Nested 2";
                case 2:
                    return "Nested 3";
                case 3:
                    return "Nested 3";
                case 4:
                    return "Nested 4";
                case 5:
                    return "Nested 5";
                case 6:
                    return "Nested 6";
                case 7:
                    return "Nested 7";
                case 8:
                    return "Nested 8";
                case 9:
                    return "Nested 9";
                case 10:
                    return "Nested 10";
                case 11:
                    return "Nested 11";
                    default:
                    return "Nested 4";
            }


        }
    }


}