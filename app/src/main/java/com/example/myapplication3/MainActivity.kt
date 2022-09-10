package com.example.myapplication3

import android.content.Intent
import android.content.Intent.ACTION_CALL
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.material.snackbar.Snackbar
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toggle name
        val textView:TextView=findViewById(R.id.name)
        val btn:Button=findViewById(R.id.show_name)

        var showed=0
        btn.setOnClickListener{
            if(showed==0)
            {
                textView.text=getString(R.string.name)
                showed=1
            }
            else{
                textView.text=getString(R.string.empty)
                showed=0
            }

        }
        //showing list view
        val listbtn: Button=findViewById(R.id.show_list_view)
        listbtn.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java).apply{}
            startActivity(intent)
        }

        val editText:EditText=findViewById(R.id.message)
        //passing data to next activity
        val nextscreenbtn:Button=findViewById(R.id.shownext)
        nextscreenbtn.setOnClickListener{
            val intent=Intent(this,MainActivity2::class.java).apply{putExtra("NAME",editText.text.toString())}
            startActivity(intent)
        }






    }
}