package com.mutsanna.aplikasibangunruang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.size
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBangunruang : RecyclerView
    private  val list: ArrayList<Bangunruang> = arrayListOf()
    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvBangunruang = findViewById(R.id.rv_bangunruang)
        rvBangunruang.setHasFixedSize(true)

        list.addAll(BangunruangData.lisData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBangunruang.layoutManager = LinearLayoutManager(this)
        val listBangunruangAdapter = ListBangunruangAdapter(list)
        rvBangunruang.adapter = listBangunruangAdapter

        listBangunruangAdapter.setOnItemClickCallback(object : ListBangunruangAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Bangunruang) {
                showSelectedBangunruang(data)
            }
        })
    }

    private fun showRecyclerGrid(){
        rvBangunruang.layoutManager = GridLayoutManager(this,2)
        val gridBangunruangAdapter = GridBangunruangAdapter(list)
        rvBangunruang.adapter = gridBangunruangAdapter
    }

    private fun showRecyclerCardView() {
        rvBangunruang.layoutManager = LinearLayoutManager(this)
        val cardViewBangunruangAdapter = CardViewBangunruangAdapter(list)
        rvBangunruang.adapter = cardViewBangunruangAdapter
    }

    private fun showAbout(){
        val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedBangunruang(bangunruang: Bangunruang) {
        val pindahDetail = Intent(this@MainActivity, DetailActivity::class.java)
        pindahDetail.putExtra(DetailActivity.EXTRA_NAME, bangunruang.name)
        pindahDetail.putExtra(DetailActivity.EXTRA_DETAIL, bangunruang.detail)
        pindahDetail.putExtra(DetailActivity.EXTRA_IMAGE, bangunruang.photo)
        pindahDetail.putExtra(DetailActivity.EXTRA_RUMUS, bangunruang.rumus)
        startActivity(pindahDetail)
//        Toast.makeText(this, "Kamu memilih " + bangunruang.name, Toast.LENGTH_SHORT).show()
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
            R.id.action_about -> {
                title = "About"
                showAbout()
            }
        }
        setActionBarTitle(title)
    }

}