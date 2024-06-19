package com.example.fibonnacci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonnacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numbers =  addition(100)
        binding.tvNumbers.layoutManager= GridLayoutManager(this,3
        )
        val numAdapt = SequenceNumbers(numbers)
      binding.tvNumbers.adapter=numAdapt
    }
    fun addition(num:Int):List<Int>{
        val numbers = mutableListOf(0,1)
        while (numbers.size< num){
            numbers.add(numbers[numbers.lastIndex]+ numbers[numbers.lastIndex-1])
        }
        return numbers
    }
}