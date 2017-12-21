package com.satofromjapan.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.satofromjapan.coderswag.Model.Product
import com.satofromjapan.coderswag.R
import com.satofromjapan.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        productImage.setImageResource(resourceId)
        productTitle.text = product.title
        productPrice.text = product.price

    }
}
