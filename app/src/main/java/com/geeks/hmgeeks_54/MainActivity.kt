package com.geeks.hmgeeks_54

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.geeks.hmgeeks_54.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel: CountViewModel by lazy {
        ViewModelProvider(this)[CountViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnIncrement.setOnClickListener {
            viewModel.increment()
        }

        binding.btnDecrement.setOnClickListener {
            viewModel.decrement()
        }

        viewModel.counterData.observe(this) { counter ->
            binding.tvCount.text = counter.toString()

            when (counter) {
                10 -> {
                    Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
                }
                15 -> {
                    binding.tvCount.setTextColor(Color.GREEN)
                }
                else -> {
                    binding.tvCount.setTextColor(Color.BLACK) // Сброс цвета для других чисел
                }
            }
        }
    }
}