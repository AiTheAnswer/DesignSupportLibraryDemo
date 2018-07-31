package com.allen.coordinatorlayout.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.allen.coordinatorlayout.R
import com.allen.coordinatorlayout.adapter.RecycleViewAdapter
import com.allen.coordinatorlayout.entity.Entity

class MyFragment : Fragment() {
    private var mRecyclerView: RecyclerView? = null
    private var mView: View? = null
    private var mAdapter: RecycleViewAdapter? = null
    private var mData :ArrayList<Entity>? = null
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mAdapter = RecycleViewAdapter(activity!!, mData!!)
        mRecyclerView?.adapter = mAdapter
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater.inflate(R.layout.fragment_layout, null)
        initView()
        initData()
        return mView
    }

    private fun initData() {
        mRecyclerView?.layoutManager = LinearLayoutManager(activity)
    }

    fun setData(data: ArrayList<Entity>) {
        mData = data
    }

    private fun initView() {
        mRecyclerView = mView?.findViewById(R.id.recycler_view)
    }
}