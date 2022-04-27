package ca.temi.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ca.temi.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val quoteObj = Quote("Do or do not Ther is try","Yoda")

        binding.quote = quoteObj


    }
}