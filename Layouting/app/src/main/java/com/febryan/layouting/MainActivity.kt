package com.febryan.layouting

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.message_box.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_box)

        btn_toast.setOnClickListener {
            val text = "Belajar Android Kotlin Basic"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        btn_alert.setOnClickListener {

            val alertDialog = AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Konfirmasi")
            alertDialog.setMessage("Benar kita beajar sekarang ?")

            alertDialog.setPositiveButton("Ya", DialogInterface.OnClickListener { dialog, which ->
                // Ketika Ya
                val text = "Ya kita sedang belajar"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            })

            alertDialog.setNegativeButton("Tidak", DialogInterface.OnClickListener { dialog, which ->
                // Ketika Tidak
                val text = "Kita tidak sedang belajar"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            })

            alertDialog.setNeutralButton("Tutup", DialogInterface.OnClickListener { dialog, which ->
                // Pesan disini
            })

            alertDialog.show()
        }

        btn_snackbar.setOnClickListener {
            val snackbar = Snackbar.make(findViewById(R.id.layout_snacbar), "Ini Snackbar", Snackbar.LENGTH_SHORT)
            snackbar.setAction("Oke", View.OnClickListener {
                val text = "Ini Toast dari Snacbar"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            })
            snackbar.show()
        }

    }
}