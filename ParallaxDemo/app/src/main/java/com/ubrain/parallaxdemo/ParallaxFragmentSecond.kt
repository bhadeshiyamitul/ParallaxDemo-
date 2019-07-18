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

class ParallaxFragmentSecond : Fragment() {


    var country = arrayListOf<String>(
        "India",
        "USA",
        "UK",
        "Japan",
        "Nepal",
        "China",
        "Singapor",
        "Dubai",
        "Iran",
        "Irak",
        "Austraia",
        "Rasia",
        "Ceneda",
        "Pune"
    )


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.parallal_framelayout, container, false)

        var frameLayout = view.findViewById(R.id.frame_layout) as FrameLayout

        var recyclerView = view.findViewById(R.id.recycle_view_parallax) as RecyclerView

        var linearLayoutManager = LinearLayoutManager(context)
        recyclerView.setLayoutManager(linearLayoutManager)

        recyclerView.setHasFixedSize(true)

        var recycleAdapter = RecycleAdapter(country)
        recyclerView.setAdapter(recycleAdapter)
        return view


    }
}