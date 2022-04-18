package com.example.newsfeed

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

internal var bol : Boolean = false
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvContent = findViewById<RecyclerView>(R.id.lvContent)
        val list = ArrayList<ListItem>()
        if (!bol) {
            val intent = Intent(this, Login::class.java).apply {}
            startActivity(intent)
        } else {
            login = pref?.getString("login", "")!!
            pass = pref?.getString("pass", "")!!
            val tvUserName = findViewById<TextView>(R.id.tvUserName)
            tvUserName.text = login
            Toast.makeText(this, "Приятных новостей, $login", Toast.LENGTH_SHORT).show()
            list.add(
                ListItem(
                    R.drawable.ponchic, "Новая диета для \"подготовки\" к лету",
                    "\"У меня новая диета, очень эффективная: я вообще ничего не ем, а когда чувствую, " +
                            "что вот-вот упаду в обморок, грызу кусочек сыра.\n- Она явно действует.\n" +
                            "- Да, еще пара приступов гастрита, и я буду у цели\"\n\nДьявол носит Prada\n\n\nДиета - один из самых распространенных видов похудения. " +
                            "Длительность диеты - фактор, зависящий от степени тяжести лишнего веса, возраста, наличие сопутствующих заболеваний, образа жизни и тд.\n\n" +
                            "Является ли диета полезным вариантом поддержания вашего здоровья? Это спорный вопрос.Ограничить себя в полноценных приемах пищи один день или " +
                            "целую неделю, съесть пару ложек каши или заменить еду водой -  индивидуальное право каждого человека.Главным  аспектом при выборе диеты — не навредить себе!\n\n" +
                            "В статье разберем трендовый набор диет на 2021 год; рассмотрим пример ориентировочного меню на неделю одной из диет; обозначим важность наличия спорта в жизни " +
                            "худеющего человека; проанализируем эффективность и значимость диеты при правильном похудении"
                )
            )
            list.add(
                ListItem(
                    R.drawable.ponchic,
                    "What Is House Dance?",
                    "kjbnsrb kjnsbksrngb dkjbfvfjbvj"
                )
            )
            list.add(
                ListItem(
                    R.drawable.ponchic,
                    "Новая диета для подготовки к лету",
                    "kjbnsrb kjnsbksrngb dkjbfvfjbvj"
                )
            )
            list.add(
                ListItem(
                    R.drawable.ponchic,
                    "Новая диета для подготовки к лету",
                    "kjbnsrb kjnsbksrngb dkjbfvfjbvj"
                )
            )
            list.add(
                ListItem(
                    R.drawable.ponchic,
                    "Новая диета для подготовки к лету",
                    "kjbnsrb kjnsbksrngb dkjbfvfjbvj"
                )
            )
            lvContent.hasFixedSize()
            lvContent.layoutManager = LinearLayoutManager(this)
            lvContent.adapter = Adapter(list, this)
        }
    }

    fun onClickEntry(view: View) {
        pref?.edit()?.clear()?.apply()
        bol = false
        val intent = Intent(this, Login::class.java).apply {}
        startActivity(intent)
    }
}