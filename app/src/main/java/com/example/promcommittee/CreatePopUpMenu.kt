package com.example.promcommittee

import android.content.Context
import android.content.Intent
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.isVisible
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CreatePopUpMenu {
    var visibility = false
    constructor(context: Context, layout:RelativeLayout){
        var fabPopUp = layout.findViewById<FloatingActionButton>(R.id.fabPopUp)
        var txtMyProm=layout.findViewById<TextView>(R.id.txtMyProm)
        var fabMyProm=layout.findViewById<FloatingActionButton>(R.id.fabMyProm)
        var txtPromSummary=layout.findViewById<TextView>(R.id.txtPromSummary)
        var fabPromSummary=layout.findViewById<FloatingActionButton>(R.id.fabPromSummary)
        var txtMenu=layout.findViewById<TextView>(R.id.txtMenu)
        var fabMenu=layout.findViewById<FloatingActionButton>(R.id.fabMenu)
        var txtSeatingChart=layout.findViewById<TextView>(R.id.txtSeatingChart)
        var fabSeatingChart=layout.findViewById<FloatingActionButton>(R.id.fabSeatingChart)
        var txtSongRequest=layout.findViewById<TextView>(R.id.txtSongRequest)
        var fabSongRequest=layout.findViewById<FloatingActionButton>(R.id.fabSongRequest)

        fabMyProm.setOnClickListener {
            var intent = Intent(context,MyPromPage::class.java)
            context.startActivity(intent)
        }
        fabPromSummary.setOnClickListener {
            var intent = Intent(context, PromSummaryPage::class.java)
            context.startActivity(intent)
        }
        fabMenu.setOnClickListener {
            var intent = Intent(context,MenuPage::class.java)
            context.startActivity(intent)
        }
        fabSeatingChart.setOnClickListener {
            var intent = Intent(context,SeatingChartPage::class.java)
            context.startActivity(intent)
        }
        fabSongRequest.setOnClickListener {
            var intent = Intent(context,SongRequestPage::class.java)
            context.startActivity(intent)
        }

        fabPopUp.setOnClickListener {
            visibility=!visibility
            txtMyProm.isVisible=visibility
            fabMyProm.isVisible=visibility

            txtPromSummary.isVisible=visibility
            fabPromSummary.isVisible=visibility

            txtMenu.isVisible=visibility
            fabMenu.isVisible=visibility

            txtSeatingChart.isVisible=visibility
            fabSeatingChart.isVisible=visibility

            txtSongRequest.isVisible=visibility
            fabSongRequest.isVisible=visibility

            when(visibility){
                false->fabPopUp.setImageResource(R.drawable.menu_open)
                true->fabPopUp.setImageResource(R.drawable.menu_closed)
            }
        }
    }
}