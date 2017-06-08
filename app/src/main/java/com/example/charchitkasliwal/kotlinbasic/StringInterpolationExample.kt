package com.example.charchitkasliwal.kotlinbasic

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
class StringInterpolationExample : AppCompatActivity() {
    // Delegation Properties : Lazy



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        stringInterpolation()
        stringInterPolationNew()
    }

    /**
     * Method For String interpolation
     */
    fun stringInterpolation() : String{
         var a : String = "Hello"
         println("String concatination Output is Here" + a) // String Concatination
         println("String Interpolation Output is Here $a")
        return a
    }

    fun stringInterPolationNew() : Unit{
        var a = 10
        var b = 20
        println("String Concatination Sum of " + a + " and " + b + " is " + (a+b))
        println("String Interpolation Sum of $a and $b is ${a+b}") // String Interpolation
    }

    companion object{
        private val INTENT_CONTACT_NUMBER = "contact_number"
        fun newMainIntent(context: Context, contactNumber : String): Intent? {
            val intent = Intent(context, StringInterpolationExample::class.java)
            intent.putExtra(INTENT_CONTACT_NUMBER, contactNumber)
            return intent
        }
    }

}
