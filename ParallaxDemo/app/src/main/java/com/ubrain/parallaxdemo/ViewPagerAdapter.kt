package com.ubrain.parallaxdemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter constructor(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    var mFragmentTitleList=ArrayList<String>()
    var fragmentList=ArrayList<Fragment>()

    override fun getCount(): Int {
       return fragmentList.size
    }

    override fun getItem(p0: Int): Fragment {
        return fragmentList.get(p0)
    }

    public fun addFrag(fragment: Fragment,title:String)
    {
        fragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList.get(position)
    }
}