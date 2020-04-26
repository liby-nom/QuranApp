package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import java.util.*

class ViewPageAdapter(private val context: Context) : PagerAdapter(){
    private var layoutInflater:LayoutInflater?= null
    private val images = arrayOf(R.drawable.page001,R.drawable.page002,R.drawable.page003,R.drawable.page004,R.drawable.page005
    ,R.drawable.page006,R.drawable.page007,R.drawable.page008,R.drawable.page009,R.drawable.page010,R.drawable.page011,R.drawable.page012,R.drawable.page013,R.drawable.page014,R.drawable.page015)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view=== `object`
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custum_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp = container as ViewPager
        vp.addView(v, 0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}


