package com.allen.coordinatorlayout.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * ViewPager的适配器
 */
class ViewPagerAdapter(fm: FragmentManager, var data: ArrayList<Fragment>, private var mTitle: ArrayList<String>) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return data[position]
    }

    override fun getCount(): Int {
        return data.size
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return mTitle[position]
    }
}