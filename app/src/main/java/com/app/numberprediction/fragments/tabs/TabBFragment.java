package com.app.numberprediction.fragments.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.numberprediction.R;
import com.app.numberprediction.constant.AppConstant;
import com.app.numberprediction.fragments.Nest1Fragment;

public class TabBFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_tabb, container, false);
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
            return AppConstant.INTABS_INDEX.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return AppConstant.INTABS_INDEX[0];
                case 1:
                    return AppConstant.INTABS_INDEX[1];
                case 2:
                    return AppConstant.INTABS_INDEX[2];
                case 3:
                    return AppConstant.INTABS_INDEX[3];
                case 4:
                    return AppConstant.INTABS_INDEX[4];
                case 5:
                    return AppConstant.INTABS_INDEX[5];
                case 6:
                    return AppConstant.INTABS_INDEX[6];
                case 7:
                    return AppConstant.INTABS_INDEX[7];
                case 8:
                    return AppConstant.INTABS_INDEX[8];
                case 9:
                    return AppConstant.INTABS_INDEX[9];
                case 10:
                    return AppConstant.INTABS_INDEX[10];
                case 11:
                    return AppConstant.INTABS_INDEX[11];
                default:
                    return AppConstant.INTABS_INDEX[12];
            }
        }
    }

}