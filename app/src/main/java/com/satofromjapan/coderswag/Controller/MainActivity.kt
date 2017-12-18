package com.satofromjapan.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.satofromjapan.coderswag.Adapters.CategoryAdapater
import com.satofromjapan.coderswag.Model.Category
import com.satofromjapan.coderswag.R
import com.satofromjapan.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapater(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}
