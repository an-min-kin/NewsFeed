package com.example.newsfeed

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

internal var login = ""
internal var pass = ""
internal var pref: SharedPreferences? = null
class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        pref = getSharedPreferences("TABLE", Context.MODE_PRIVATE) // создаем таблицу
        login = pref?.getString("login","")!!//записываем значения по ключевым словам
        pass = pref?.getString("pass","")!! // если ничего нет, то будет пуста строка ""
        //Toast.makeText(this, login, Toast.LENGTH_SHORT).show()
    }
        fun onClickExit(view: View) {
            bol = true // переменная показывает, что регистрируемся первый раз
            var tvLogin = findViewById<TextView>(R.id.tvLogin).text.toString()
            var tvPass = findViewById<TextView>(R.id.tvPass).text.toString()
            if ( tvLogin.isNotEmpty() && tvPass.isNotEmpty()) { // если юзер заполнил поля, то сохраняем
            save(tvLogin,tvPass)
            val intent = Intent(this, MainActivity::class.java).apply {}
            startActivity(intent)} // сохранили логин и пароль, переходим к осн контенту
            else Toast.makeText(this, "Заполните поля ввода", Toast.LENGTH_SHORT).show()
        }
    fun save(log: String, pas: String){ // сохраняет поступившее интовое число
        pref?.edit()?.putString("login",log)?.apply()
        pref?.edit()?.putString("pass",pas)?.apply()
    }

}