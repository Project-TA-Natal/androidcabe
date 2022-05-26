package com.example.androidcabe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.androidcabe.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //isi fragment//
        val fragment = HomeFragment.newInstance(param1 = "testi1", param2 = "testi2")
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(menuItemSelected)
        addFragment(fragment)
    }
    //Deteksi Menu Item yang DiKlik//
    private val menuItemSelected = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.itemSetting-> {
             val fragment = SettingFragment.newInstance(param1 = "test1", param2 = "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemSetting-> {
                val fragment = NotificationFragment.newInstance(param1 = "test1", param2 = "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemSetting-> {
                val fragment = StatisticFragment.newInstance(param1 = "test1", param2 = "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    //Memanggil Fragment ke frame layout di activity main//
    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(com.google.android.material.R.anim.design_bottom_sheet_slide_in,
                com.google.android.material.R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.simpleName)
            .commit()
    }
}
