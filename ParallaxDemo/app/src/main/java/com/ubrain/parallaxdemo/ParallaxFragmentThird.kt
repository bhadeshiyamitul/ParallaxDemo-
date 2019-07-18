package com.example.samllprogram

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.ubrain.parallaxdemo.R
import com.ubrain.parallaxdemo.RecycleAdapter

class ParallaxFragmentThird : Fragment() {


    var items = arrayListOf<String>(
        "items 1",
        "items 2",
        "items 3",
        "items 4",
        "items 5",
        "items 6",
        "items 7",
        "items 8",
        "items 9",
        "items 10",
        "items 11",
        "items 12",
        "items 13",
        "items 14",
        "items 15"
    )


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.parallal_framelayout, container, false)

        var frameLayout = view.findViewById(R.id.frame_layout) as FrameLayout

        var recyclerView = view.findViewById(R.id.recycle_view_parallax) as RecyclerView

        var linearLayoutManager = LinearLayoutManager(context)
        recyclerView.setLayoutManager(linearLayoutManager)

        recyclerView.setHasFixedSize(true)

        var recycleAdapter = RecycleAdapter(items)
        recyclerView.setAdapter(recycleAdapter)
        return view


    }
}