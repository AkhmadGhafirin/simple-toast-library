package com.cascer.mycustomtoast

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_one.setOnClickListener {
            showText(this@MainActivity, "Coba Toaster Lagi Dan Lagi Bro Nih!!!", Toast.LENGTH_SHORT)
        }
        btn_two.setOnClickListener {
            showText(this@MainActivity, Color.BLUE, "Coba Toaster Lagi Dan Lagi Bro Nih!!!", Toast.LENGTH_SHORT)
        }

        btn_three.setOnClickListener {
            showIcon(
                this@MainActivity,
                R.drawable.ic_baseline_info,
                "Coba Toaster Lagi Dan Lagi Bro Nih!!!",
                Toast.LENGTH_SHORT
            )
        }

        btn_four.setOnClickListener {
            showIcon(
                this@MainActivity,
                R.drawable.ic_baseline_info,
                Color.BLUE,
                "Coba Toaster Lagi Dan Lagi Bro Nih!!!",
                Toast.LENGTH_SHORT
            )
        }
    }

    fun showText(context: Activity, message: String, duration: Int) {
        val inflater: LayoutInflater = context.layoutInflater
        val layout: View =
            inflater.inflate(
                R.layout.test,
                context.findViewById(R.id.custom_toast_container) as ViewGroup?
            )
        layout.findViewById<TextView>(R.id.tv_toaster).text = message
        layout.findViewById<ImageView>(R.id.iv_toaster).visibility = View.GONE

        val toast = Toast(context)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.duration = duration
        toast.view = layout
        toast.show()
    }

    fun showText(context: Activity, background: Int, message: String, duration: Int) {
        val inflater: LayoutInflater = context.layoutInflater
        val layout: View =
            inflater.inflate(
                R.layout.test,
                context.findViewById(R.id.custom_toast_container) as ViewGroup?
            )
        layout.findViewById<TextView>(R.id.tv_toaster).text = message
        layout.findViewById<CardView>(R.id.custom_toast_container).setCardBackgroundColor(background)
        layout.findViewById<ImageView>(R.id.iv_toaster).visibility = View.GONE

        val toast = Toast(context)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.duration = duration
        toast.view = layout
        toast.show()
    }

    fun showIcon(context: Activity, icon: Int, message: String, duration: Int) {
        val inflater: LayoutInflater = context.layoutInflater
        val layout: View =
            inflater.inflate(
                R.layout.test,
                context.findViewById(R.id.custom_toast_container) as ViewGroup?
            )
        layout.findViewById<TextView>(R.id.tv_toaster).text = message
        layout.findViewById<ImageView>(R.id.iv_toaster).setImageResource(icon)

        val toast = Toast(context)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.duration = duration
        toast.view = layout
        toast.show()
    }

    fun showIcon(context: Activity, icon: Int, background: Int, message: String, duration: Int) {
        val inflater: LayoutInflater = context.layoutInflater
        val layout: View =
            inflater.inflate(
                R.layout.test,
                context.findViewById(R.id.custom_toast_container) as ViewGroup?
            )
        layout.findViewById<TextView>(R.id.tv_toaster).text = message
        layout.findViewById<CardView>(R.id.custom_toast_container).setCardBackgroundColor(background)
        layout.findViewById<ImageView>(R.id.iv_toaster).setImageResource(icon)

        val toast = Toast(context)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.duration = duration
        toast.view = layout
        toast.show()
    }
}