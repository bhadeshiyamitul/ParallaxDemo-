package com.ubrain.parallaxdemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RecycleAdapter constructor(var cityname:ArrayList<String>) :RecyclerView.Adapter<RecycleAdapter.MyviewHolder>() {



    override fun getItemCount(): Int {
            return cityname.size
    }

    override fun onBindViewHolder(p0: MyviewHolder, p1: Int) {

        p0.paraText.setText(cityname.get(p1))

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyviewHolder {

        var v: View = LayoutInflater.from(p0.context).inflate(R.layout.parallax_recycle_layout, p0, false)
        var myViewHolder: MyviewHolder = MyviewHolder(v)
        return myViewHolder

    }
    class MyviewHolder(view: View):RecyclerView.ViewHolder(view)
    {
            var paraText=view.findViewById(R.id.para_txt) as TextView
    }
}