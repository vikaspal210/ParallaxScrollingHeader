package com.example.cas.parallaxscrollingheader;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set View Pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.htab_viewpager);
        SimpleFragmentPagerAdapter adapter=new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        //set TabLayout to view pager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.htab_tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling getPageTitle()

        tabLayout.setupWithViewPager(viewPager);
    }
}