package com.cascer.mycustomtoast

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cascer.toaster.Toaster
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_one.setOnClickListener {
            Toaster().showText(
                this@MainActivity,
                "Coba Toaster Lagi Dan Lagi Bro Nih!!!",
                Toast.LENGTH_SHORT
            )
        }
        btn_two.setOnClickListener {
            Toaster().showText(
                this@MainActivity,
                Color.BLUE,
                "Coba Toaster Lagi Dan Lagi Bro Nih!!!",
                Toast.LENGTH_SHORT
            )
        }

        btn_three.setOnClickListener {
            Toaster().showIcon(
                this@MainActivity,
                R.drawable.ic_baseline_info,
                "Coba Toaster Lagi Dan Lagi Bro Nih!!!",
                Toast.LENGTH_SHORT
            )
        }
        btn_four.setOnClickListener {
            Toaster().showIcon(
                this@MainActivity,
                R.drawable.ic_baseline_info,
                Color.BLUE,
                "Coba Toaster Lagi Dan Lagi Bro Nih!!!",
                Toast.LENGTH_SHORT
            )
        }
    }
}