package com.satofromjapan.coderswag.Services

import com.satofromjapan.coderswag.Model.Category
import com.satofromjapan.coderswag.Model.Product

/**
 * Created by SATO on 12/18/17.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$20", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$28", "hoodie02"),
            Product("Devslopes Hoodie White", "$28", "hoodie03"),
            Product("Devslopes Hoodie Black", "$28", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$20", "shirt01"),
            Product("Devslopes Badge Light Gray", "$30", "shirt02"),
            Product("Devslopes HLogo Shirt Red", "$28", "shirt3"),
            Product("Devslopes Hustle", "$28", "shirt04"),
            Product("Kickflip Studios", "$28", "shirt05")
    )
}