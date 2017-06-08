package com.example.charchitkasliwal.kotlinbasic.iListener

/**
 * Created by charchitkasliwal on 07/06/17.
 */
interface IAdapterClickListener {

     fun onCellItemClick(mesg : String): Unit

     fun onCellItemClick1(mesg : String): Unit{
          println("Hello")
     }



}