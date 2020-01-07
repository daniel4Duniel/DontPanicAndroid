package xyz.danielindie.dontpanic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainCurrencyView : AppCompatActivity() {

   // getSupportActionBar().hide();
    
    
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_currency_view)
        val supportActionBar = supportActionBar
        if (supportActionBar != null) supportActionBar.hide()
    }
}
