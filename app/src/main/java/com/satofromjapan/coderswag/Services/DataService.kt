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
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$20", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat0")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$28", "hoodie2"),
            Product("Devslopes Hoodie White", "$28", "hoodie3"),
            Product("Devslopes Hoodie Black", "$28", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$20", "shirt1"),
            Product("Devslopes Badge Light Gray", "$30", "shirt2"),
            Product("Devslopes HLogo Shirt Red", "$28", "shirt3"),
            Product("Devslopes Hustle", "$28", "shirt4"),
            Product("Kickflip Studios", "$28", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}