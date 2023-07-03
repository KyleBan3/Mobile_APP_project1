package com.example.seunghyeonban_comp304section003_lab1_ex1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EmployeeDetails : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)

        val usernameTextView = findViewById<TextView>(R.id.usernameTextView)
        val username = intent.getStringExtra("username")
        usernameTextView.text = "Welcome, $username!"

        val yearlySalaryEditText = findViewById<EditText>(R.id.yearlySalaryEditText)
        val taxRateEditText = findViewById<EditText>(R.id.taxRateEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val netSalaryTextView = findViewById<TextView>(R.id.netSalaryTextView)

        calculateButton.setOnClickListener {
            val yearlySalary = yearlySalaryEditText.text.toString().toDouble()
            val taxRate = taxRateEditText.text.toString().toDouble() / 100
            val netSalary = yearlySalary * (1 - taxRate)

            netSalaryTextView.text = "Net salary: $netSalary"

            Toast.makeText(this, "Net salary: $netSalary", Toast.LENGTH_SHORT).show()
        }
    }
}


