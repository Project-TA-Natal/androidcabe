package com.example.androidcabe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcabe.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import fragments.HomeFragment
import fragments.NotificationFragment
import fragments.SettingFragment
import fragments.StatisticFragment

class MainActivity : AppCompatActivity() {

    private val homeFragment            = HomeFragment()
    private val statisticFragment       = StatisticFragment()
    private val notificationFragment    = NotificationFragment()
    private val settingFragment         = SettingFragment()
    private lateinit var binding: ActivityMainBinding

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter :RecyclerView.Adapter<RecyclerView.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(homeFragment)

        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.itemHome -> replaceFragment(homeFragment)
                R.id.itemStatistic -> replaceFragment(statisticFragment)
                R.id.itemNotification -> replaceFragment(notificationFragment)
                R.id.itemSetting -> replaceFragment(settingFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
    if(fragment !=null){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
    }
}

