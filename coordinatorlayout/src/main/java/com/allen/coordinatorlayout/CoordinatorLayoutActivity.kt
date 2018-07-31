package com.allen.coordinatorlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import com.allen.coordinatorlayout.adapter.ViewPagerAdapter
import com.allen.coordinatorlayout.entity.Entity
import com.allen.coordinatorlayout.fragment.MyFragment

class CoordinatorLayoutActivity : AppCompatActivity() {

    private var mToolbar: Toolbar? = null
    private var mViewPager: ViewPager? = null
    private var mTabLayout: TabLayout? = null
    private var mAdapter: ViewPagerAdapter? = null
    private var mFragments: ArrayList<Fragment>? = null
    private var mTitle: ArrayList<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator_layout)
        setSupportActionBar(mToolbar)
        initView()
        initData()
    }

    private fun initData() {
        mFragments = ArrayList()
        mTitle = ArrayList()
        for (i in 0..2) {
            val fragment = MyFragment()
            val list = ArrayList<Entity>()
            mTitle?.add("标题$i")
            for (j in 0..100){
                list.add(Entity("内容$j"))
            }
            fragment.setData(list)
            mFragments?.add(fragment)
        }
        mAdapter = ViewPagerAdapter(supportFragmentManager, mFragments!!,mTitle!!)
        mViewPager?.adapter = mAdapter
        mTabLayout?.setupWithViewPager(mViewPager)
    }

    private fun initView() {
        mToolbar = findViewById(R.id.toolbar)
        mTabLayout = findViewById(R.id.tab_layout)
        mViewPager = findViewById(R.id.view_pager)
    }
}
