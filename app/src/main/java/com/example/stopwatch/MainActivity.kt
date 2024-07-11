package com.example.stopwatch

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.stopwatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private var timerSeconds = 0
    private var isRunning = false

    private val handler = Handler(Looper.getMainLooper())
    private val runnable = object : Runnable {
        override fun run() {
            timerSeconds++
            val hours = timerSeconds / 3600
            val minutes = (timerSeconds % 3600) / 60
            val seconds = timerSeconds % 60

            val time = String.format("%02d:%02d:%02d", hours, minutes, seconds)
            binding.textViewTimer.text = time
            handler.postDelayed(this, 1000)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            buttonStart.setOnClickListener {
                startTime()
            }
            buttonStop.setOnClickListener {
                stopTime()
            }
            buttonReset.setOnClickListener {
                resetTimer()
            }
        }
    }

    private fun startTime() {
        if (!isRunning) {
            handler.postDelayed(runnable, 1000)
            isRunning = true
            binding.buttonStart.isEnabled = false
            binding.buttonStop.isEnabled = true
            binding.buttonReset.isEnabled = true
        }
    }

    private fun stopTime() {
        if (isRunning) {
            handler.removeCallbacks(runnable)
            binding.buttonStart.isEnabled = true
            binding.buttonStart.text = "Resume"
            binding.buttonStop.isEnabled = false
            binding.buttonReset.isEnabled = true
            isRunning = false
        }
    }

    private fun resetTimer() {
        stopTime()
        timerSeconds = 0
        binding.textViewTimer.text = "00:00:00"
        binding.buttonStart.isEnabled = true
        binding.buttonStart.text = "Start"
        binding.buttonReset.isEnabled = false
    }
}
