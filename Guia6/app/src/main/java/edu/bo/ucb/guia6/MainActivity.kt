package edu.bo.ucb.guia6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val toolbar: Toolbar get() = findViewById(R.id.toolbar)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportActionBar.let {
        //    setSupportActionBar(toolbar)
        //}
        //Snackbar.make(findViewById(R.id.layout_principal),
        //    getString(R.string.app_name), Snackbar.LENGTH_LONG).show()
        val mySnackbar= Snackbar.make(findViewById(R.id.layout_principal),getString(R.string.app_name),Snackbar.LENGTH_LONG)
        mySnackbar.setAction(R.string.undo_string,MyUndoListener())
        mySnackbar.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_search -> {
                Log.d("TEST", "PRESS ICON SEARCH")
            }
        }
        return super.onOptionsItemSelected(item)
    }
}