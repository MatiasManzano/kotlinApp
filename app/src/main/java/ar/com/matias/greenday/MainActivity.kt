package ar.com.matias.greenday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cambiarFragment(FragmentLogin())
    }

    fun cambiarFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager
        fragmentTransaction.beginTransaction()
            .replace(R.id.main, fragment)
            .addToBackStack(null)
            .commit()
    }
}