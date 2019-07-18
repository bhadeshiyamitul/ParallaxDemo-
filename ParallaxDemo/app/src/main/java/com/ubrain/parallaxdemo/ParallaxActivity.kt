package com.ubrain.parallaxdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.example.samllprogram.ParallaxFragment
import com.example.samllprogram.ParallaxFragmentSecond
import com.example.samllprogram.ParallaxFragmentThird

class ParallaxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parallax)

        var tabLayout=findViewById(R.id.tab_layout) as TabLayout

        var parallalViewPager=findViewById(R.id.viewpager_layout) as ViewPager


        var firstTab :TabLayout.Tab=tabLayout.newTab()
        firstTab.setText("ONE")
        tabLayout.addTab(firstTab)

        var secondTab=tabLayout.newTab()
        secondTab.setText("TWO")
        tabLayout.addTab(secondTab)

        var thirdTab=tabLayout.newTab()
        thirdTab.setText("THREE")
        tabLayout.addTab(thirdTab)
        var viewPagerAdapter=ViewPagerAdapter(getSupportFragmentManager())
        viewPagerAdapter.addFrag(ParallaxFragment(),"First")
        viewPagerAdapter.addFrag(ParallaxFragmentSecond(),"Second")
        viewPagerAdapter.addFrag(ParallaxFragmentThird(),"Third")
        parallalViewPager.setAdapter(viewPagerAdapter)
        parallalViewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{



            override fun onTabSelected(p0: TabLayout.Tab?) {

                parallalViewPager.currentItem=p0!!.position

            }
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }
            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }
        }


        )


    }
}
