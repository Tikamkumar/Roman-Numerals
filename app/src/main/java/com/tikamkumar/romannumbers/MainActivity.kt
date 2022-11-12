package com.tikamkumar.romannumbers

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.GravityCompat
import com.tikamkumar.romannumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigationDrawer()

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.send, R.id.developer, R.id.moreApps, R.id.exit
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setNavigationItemSelectedListener(this)

        // Animation All Buttons when Start Reach MainActivity
        animation(binding.One, 500)
        animation(binding.Two)
        animation(binding.Three, 500)
        animation(binding.Four)
        animation(binding.Five, 500)
        animation(binding.Six)
        animation(binding.Seven, 500)
        animation(binding.Eight)
        animation(binding.Nine, 500)
        animation(binding.Ten)

        // Button Click Event for go to target Activity
        binding.One.setOnClickListener {
            val intent = Intent(this@MainActivity, Hundred::class.java)
            startActivity(intent)
            shrink(binding.One)
        }

        binding.Two.setOnClickListener {
            val intent = Intent(this@MainActivity, TwoHundred::class.java)
            startActivity(intent)
            shrink(binding.Two)
        }

        binding.Three.setOnClickListener {
            val intent = Intent(this@MainActivity, ThreeHundred::class.java)
            startActivity(intent)
            shrink(binding.Three)
        }

        binding.Four.setOnClickListener {
            val intent = Intent(this@MainActivity, FourHundred::class.java)
            startActivity(intent)
            shrink(binding.Four)
        }

        binding.Five.setOnClickListener {
            val intent = Intent(this@MainActivity, FiveHundred::class.java)
            startActivity(intent)
            shrink(binding.Five)
        }

        binding.Six.setOnClickListener {
            val intent = Intent(this@MainActivity, SixHundred::class.java)
            startActivity(intent)
            shrink(binding.Six)
        }

        binding.Seven.setOnClickListener {
            val intent = Intent(this@MainActivity, SevenHundred::class.java)
            startActivity(intent)
            shrink(binding.Seven)
        }

        binding.Eight.setOnClickListener {
            val intent = Intent(this@MainActivity, EightHundred::class.java)
            startActivity(intent)
            shrink(binding.Eight)
        }

        binding.Nine.setOnClickListener {
            val intent = Intent(this@MainActivity, NineHundred::class.java)
            startActivity(intent)
            shrink(binding.Nine)
        }

        binding.Ten.setOnClickListener {
            val intent = Intent(this@MainActivity, Thousand::class.java)
            startActivity(intent)
            shrink(binding.Ten)
        }
        onBackPressedDispatcher.addCallback(this,object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START)
                } else {
                    finish()
                }
            }
        })
    }

    private fun animation(view: View, Duration: Long = 1000) {
        view.alpha = 0f
        view.scaleX = 0f
        view.scaleY = 0f
        view.animate().apply {
            duration = Duration
            alpha(1f)
            scaleX(1f)
            scaleY(1f)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun navigationDrawer() {
        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        setSupportActionBar(binding.toolbar)
        val toggle = ActionBarDrawerToggle(
            this, drawer, binding.toolbar,
            R.string.Open,
            R.string.Close
        )
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle.isDrawerIndicatorEnabled = true
        drawer.addDrawerListener(toggle)
        toggle.drawerArrowDrawable.color = ResourcesCompat.getColor(resources, R.color.Blue, null)
        toggle.syncState()
    }




    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.exit -> {
                finish()
            }
            R.id.developer -> {
                val intent = Intent(this@MainActivity, Developer::class.java)
                startActivity(intent)
                finish()
            }
            R.id.send -> {
                val intent = Intent()
                val data =
                    "This is Roman Numerals App:-\n https://play.google.com/store/apps/details?id=com.tikamkumar.romannumbers&hl=en"
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, data)
                intent.type = "text/plain"
                startActivity(intent)
            }
            R.id.moreApps -> {
                val intent = Intent()
                val data = "https://play.google.com/store/apps/developer?id=TIKAM+KUMAR&hl=en"
                intent.action = Intent.ACTION_VIEW
                intent.addCategory(Intent.CATEGORY_BROWSABLE)
                intent.data = Uri.parse(data)
                startActivity(intent)
            }
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun shrink(view: View, Duration: Long = 20) {
        view.alpha = 0.9f
        view.scaleX = 0.9f
        view.scaleY = 0.9f
        view.animate().apply {
            duration = Duration
            alpha(1f)
            scaleX(1f)
            scaleY(1f)
        }
    }
}