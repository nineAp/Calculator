package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*Объявление и поиск всех View элементов по id*/
        val etNum1 = findViewById<EditText>(R.id.etNum1)
        val etNum2 = findViewById<EditText>(R.id.etNum2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val tvResult = findViewById<TextView>(R.id.tvResult)


        /* Создание обработчиков событий */
        btnAdd.setOnClickListener {
            /* Взятие из input, перевод в двоичный integer */
            val num1 = Integer.parseInt(etNum1.text.toString(), 2)
            val num2 = Integer.parseInt(etNum2.text.toString(), 2)
            /* Операция над двумя числами */
            val result = num1 + num2
            /* Парсинг в string в виде двоичного числа и присвоение значения TextView  */
            tvResult.text = Integer.toBinaryString(result)
        }

        btnSubtract.setOnClickListener {
            val num1 = Integer.parseInt(etNum1.text.toString(), 2)
            val num2 = Integer.parseInt(etNum2.text.toString(), 2)
            val result = num1 - num2
            tvResult.text = Integer.toBinaryString(result)
        }

        btnMultiply.setOnClickListener {
            val num1 = Integer.parseInt(etNum1.text.toString(), 2)
            val num2 = Integer.parseInt(etNum2.text.toString(), 2)
            val result = num1 * num2
            tvResult.text = Integer.toBinaryString(result)
        }

        btnDivide.setOnClickListener {
            val num1 = Integer.parseInt(etNum1.text.toString(), 2)
            val num2 = Integer.parseInt(etNum2.text.toString(), 2)
            val result = num1 / num2
            tvResult.text = Integer.toBinaryString(result)
        }
    }
}