package com.example.tabbedlayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = MainActivity.class.getSimpleName();
    private final String[] PAGE_TITLES = new String[] {
            "Page 1",
            "Page 2",
            "Page 3",
            "Page 4"
    };
    private final Fragment[] PAGES = new Fragment[] {
            new Page1Fragment(),
            new Page2Fragment(),
            new Page3Fragment(),
            new Page4Fragment()
    };
    private ViewPager mViewPager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }
        @Override
        public Fragment getItem(int position) {
            return PAGES[position];
        }
        @Override
        public int getCount() {
            return PAGES.length;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return PAGE_TITLES[position];
        }
    }
}