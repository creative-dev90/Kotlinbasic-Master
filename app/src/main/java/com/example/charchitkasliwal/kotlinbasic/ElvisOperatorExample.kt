package com.example.charchitkasliwal.kotlinbasic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ElvisOperatorExample : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v){
            v -> println("On click 1")

        }
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elvis_operator)
        elvisOperator("")
    }




    private fun elvisOperator(b : String) {
        if (b != null && b.length > 0) {
            print("String of length ${b.length}")
        } else {
            print("Empty string")
        }

        // Safe Call Operator ?.
        val b1 = b?.length

        val l: Int = if (b != null) b.length else -1

        val l1 = b?.length ?: -1     // ?: Elvis Operator
        // If the expression to the left of ?: is not null,
        // the elvis operator returns it, otherwise it returns the expression to the right.
        // Note that the right-hand side expression is evaluated only if the left-hand side is null.


       // val l = b?.length ?: -1
    }
}
