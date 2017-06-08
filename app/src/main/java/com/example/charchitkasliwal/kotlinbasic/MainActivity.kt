package com.example.charchitkasliwal.kotlinbasic

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.charchitkasliwal.kotlinbasic.iListener.IAdapterClickListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener,IAdapterClickListener {
    override fun onCellItemClick(mesg: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCellItemClick1(mesg: String) {
        super.onCellItemClick1(mesg)
        println("In main Activity")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar)
                as Toolbar
        setSupportActionBar(toolbar)
        button.findViewById(R.id.button) as Button
        button.setOnClickListener(this@MainActivity)
        fab.findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener(this@MainActivity)
        lazy_operator.setOnClickListener(this@MainActivity)
    }


    override fun onClick(v: View?) {
        // On Click Switching to New Activity
        when(v){
            button ->  {
                val intent =  StringInterpolationExample.newMainIntent(this@MainActivity,"9584060485")
                intent?.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
                finish()
            }
            fab -> Toast.makeText(this,"Floating button pressed",Toast.LENGTH_SHORT).show()

            lazy_operator -> {
                val intent =  LazyDelegationPropertyExample.newMainIntent(this@MainActivity,"9584060485")
                startActivity(intent)
                finish()
            }

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
