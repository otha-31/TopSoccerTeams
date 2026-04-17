package com.example.topsoccerteams

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays



fun getShortestString(arr: Array<String>, ) {
    var ShortestLength = arr[0].length
    val Element =arr[0]

    for (element in arr) {
        if (element.count()) < ShortestLength) {
            ShortestLength = element.count()
            ShortestElement = element
        }
    }
    val ShortestElement = Unit
    return ShortestElement

class MainActivity : AppCompatActivity() {

    // Teams from https://footballdatabase.com/ranking/south-africa/1
    //retrieved on 21 May2022
    val teams = arrayOf<String>("Mamelodi Sundowns FC",
        "Bidvest Wits",
        "Orlando Pirates",
        "Kaizer Chiefs",
        "Cape Town City FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //creating variable to hold textview text
        val teamsTxt =findViewById<TextView>(R.id.SATeams)

        //display array item in textview
        teams[0]= "Mamelodi Sundowns :)"

        //calling function to display all values from the teams array
        logArrayValues(teams)
        logArrayValues(teams,3)

        //assigning array content to a variable
        val SATeams =""
        val counter = 0

        //add all the teams to the display screen
        var teamsdisplay=""
        for (team in teams ) {
            teamsdisplay += "${team}\n"
        }



//        while (counter <teams.count()){
//            SATeams += "${teams[counter]}\n"
//            counter++
//        }
//        SATeams = "${teams[0]}\n"
//        SATeams = "${teams[1]}\n"
//        SATeams = "${teams[2]}\n"
//        SATeams = "${teams[3]}\n"
//        SATeams = "${teams[4]}\n"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun logArrayValues(teams: Array<String>) {}
}