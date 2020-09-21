package com.cascer.toaster

import android.app.Activity
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView


class Toaster {

    fun showText(context: Activity, message: String, duration: Int) {
        val inflater: LayoutInflater = context.layoutInflater
        val layout: View =
            inflater.inflate(
                R.layout.toaster,
                context.findViewById(R.id.custom_toast) as ViewGroup?
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
                R.layout.toaster,
                context.findViewById(R.id.custom_toast) as ViewGroup?
            )
        layout.findViewById<TextView>(R.id.tv_toaster).text = message
        layout.findViewById<CardView>(R.id.custom_toast).setCardBackgroundColor(background)
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
                R.layout.toaster,
                context.findViewById(R.id.custom_toast) as ViewGroup?
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
                R.layout.toaster,
                context.findViewById(R.id.custom_toast) as ViewGroup?
            )
        layout.findViewById<TextView>(R.id.tv_toaster).text = message
        layout.findViewById<CardView>(R.id.custom_toast).setCardBackgroundColor(background)
        layout.findViewById<ImageView>(R.id.iv_toaster).setImageResource(icon)

        val toast = Toast(context)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.duration = duration
        toast.view = layout
        toast.show()
    }
}