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
import com.app.numberprediction.fragments.nesteda.A11Fragment;

public class TabAFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public TabAFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TabAFragment newInstance() {
        TabAFragment fragment = new TabAFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taba, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        TabAFragment.SectionsPagerAdapter mSectionsPagerAdapter = new TabAFragment.SectionsPagerAdapter(getChildFragmentManager());
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
                    return A11Fragment.newInstance(0);
                case 1:
                    return Nest1Fragment.newInstance(1);
                case 2:
                    return Nest1Fragment.newInstance(2);
                case 3:
                    return Nest1Fragment.newInstance(3);
                case 4:
                    return Nest1Fragment.newInstance(4);
                case 5:
                    return Nest1Fragment.newInstance(5);
                case 6:
                    return Nest1Fragment.newInstance(6);
                case 7:
                    return Nest1Fragment.newInstance(7);
                case 8:
                    return Nest1Fragment.newInstance(8);
                case 9:
                    return Nest1Fragment.newInstance(9);
                case 10:
                    return Nest1Fragment.newInstance(10);
                case 11:
                    return Nest1Fragment.newInstance(11);
                default:
                    return Nest1Fragment.newInstance(12);
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
