package com.example.charchitkasliwal.kotlinbasic
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LazyDelegationPropertyExample : AppCompatActivity() {
    val mTextView : TextView by lazy {  // Lazy Operator
        findViewById(R.id.textView) as TextView
    }

    val mButton : Button by lazy {
        findViewById(R.id.button_click) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lazy_delegation_property_example)
        mButton.setOnClickListener {
             mTextView.text = "Hello Android Team || Welcome Here"
        }
    }

    companion object{
        private val INTENT_CONTACT_NUMBER = "contact_number"
        fun newMainIntent(context: Context, contactNumber : String): Intent? {
            val intent = Intent(context, LazyDelegationPropertyExample::class.java)
            intent.putExtra(INTENT_CONTACT_NUMBER, contactNumber)
            return intent
        }
    }
}
