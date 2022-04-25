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
                    R.drawable.urban, "What Is Urban Dance?",
                    "At this point, we all kinda get what the terms urban dance and urban dance choreography refer to.\n" +
                            "\n" +
                            "But, if someone asked you to describe it you probably wouldn't really know what to say.\n" +
                            "\n" +
                            "When someone asks me what kind of dancing I do, I sometimes just say “hip hop,\" because I want to save time...\n" +
                            "\n" +
                            "But that’s not an accurate label!" +
                            "\n" +"\n" +
                            "Hip Hop doesn't include, but is associated with street dance styles like Popping, Waacking, Locking, House, and Krump.\n" +
                            "\n" +
                            "Choreographing and performing pieces is clearly a departure from the freestyle circles at clubs and battles that most Hip Hop and street dancers are used to.\n" +
                            "\n" +
                            "As a result of this, and many other distinctions, we started to separate it as “Urban Dance.”"
                )
            )
            list.add(
                ListItem(
                    R.drawable.house,
                    "What Is House Dance?",
                    "House Dance is a style of dance that originated in the late 70’s and early 80’s from underground clubs in Chicago and New York.\n" +
                            "\n" +
                            "The style was influenced by several types of movement, including Tap, African dance, Latin dance, and martial arts.\n" +
                            "\n" +
                            "House Dance is about freedom, improvisation, and feeling the music." +
                            "\n" +"\n" +
                            "History of House Music\n" +
                            "There are a few different interpretations of how House music and dance started.\n" +
                            "\n" +
                            "It’s important to keep in mind that “dance history” is essentially a collection of people’s life stories.\n" +
                            "\n" +
                            "These aren’t our experiences, and we are not married to any one narrative; these are the ones that were shared with us." +
                            "\n" +
                            "In the late 70’s, the underground heads were starting to get tired of the formulaic cheesiness of Disco music.\n" +
                            "\n" +
                            "Two DJs from New York City, Larry Levan and Frankie Knuckles, started to mix Disco with other musical elements – like breaks, afro beats and electronic music.\n" +
                            "\n" +
                            "Shortly after, they started selling their music in record shops in New York.\n" +
                            "\n" +
                            "The owner of a big club in Chicago called “The Warehouse” found this new music and started playing it there."
                )
            )
            list.add(
                ListItem(
                    R.drawable.hiphop,
                    "What Is Hip Hop Dance?",
                    "From where it all started until now, Hip Hop dance & culture has made, and is still making, a huge impact on our world.\n" +
                            "\n" +
                            "And if you’re a dancer, studying Hip Hop’s undeniably raw and fascinating background should be considered a core part of your education!\n" +
                            "\n" +
                            "To get you started, we’ve put together a Hip Hop dance crash course for you below. \n" +
                            "\n" +
                            "In this article we’ll cover:\n" +
                            "\n" +
                            "The definition of Hip Hop dance\n" +
                            "The 5 elements of Hip Hop\n" +
                            "The history of Hip Hop Culture\n" +
                            "Types of Hip Hop dance\n" +
                            "Mainstream media’s effect on Hip Hop\n" +
                            "Everything you need to know about Hip Hop dance classes\n" +
                            "But first… if you’re looking to do more than read about Hip Hop dance, here’s a shortcut to our online Beginner Hip Hop dance program!\n" +
                            "\n" +
                            "There, your instructor Buddha Stretch will teach you about Hip Hop history in real time, while also showing you the basic moves and foundations of the style, step-by-step.\n" +
                            "\n" +
                            "All right, let’s dive into all things Hip Hop."
                )
            )
            list.add(
                ListItem(
                    R.drawable.waacking,
                    "What is Whacking (Waacking)?",
                    "BOOM. POW. WHACK.\n" +
                            "\n" +
                            "These energetic sounds aren't just onomatopoeias you’d find in a comic book...\n" +
                            "\n" +
                            "They’re the inspiration for Whacking (Waacking) – a dance style characterized by striking arm movements, poses, and footwork!\n" +
                            "\n" +
                            "Wanna learn more about the history and origins of Whacking? Keep reading.\n" +
                            "\n" +"\n" +
                            "The history of Whacking (Waacking)\n" +
                            "\n" +
                            "Whacking found its start in the 1970s gay clubs of Los Angeles where high-energy funk and disco music dominated the airwaves.\n" +
                            "\n" +
                            "It was in these clubs that poor Black, Latino, and Asian men found the freedom to express themselves through movement, despite the oppressive environments they faced in day-to-day life.\n" +
                            "\n" +
                            "Originally called “Punking, Whacking emerged as a style that focused on empowerment and strength.\n" +
                            "\n" +
                            "And while “Punk” was originally a derogatory term, the gay community reclaimed it as a positive action verb." +
                            "\n" +
                            "Punking is the root of Whacking.\n" +
                            "\n" +
                            "The moves were influenced by the glamour and drama of classic Hollywood film actresses, the over-the-top action of 1960s comic book heroes, and the sharp, quick movements of 1970s martial arts films.\n" +
                            "\n" +
                            "In many routines and freestyles, you’ll see arm rolls that originate in the shoulder, elbow, or wrist that travel over the head and back – directly inspired by the use of nunchucks. (Viktor Manoel)"
                )
            )
            list.add(
                ListItem(
                    R.drawable.locking,
                    "What is Locking?",
                    "During his time at college, art student Don Campbellock could often be found by the jukebox in the cafeteria, drawing sketches of the students dancing to the latest 70s funk tunes.\n" +
                            "\n" +
                            "He had always admired the way the dancers moved, but didn’t feel like he could look as good as they did. \n" +
                            "\n" +
                            "And at first? He didn’t.\n" +
                            "\n" +
                            "Don tried his hand at the Robot Shuffle, and struggled so much to get it right that he ended up doing an entirely different move.\n" +
                            "\n" +
                            "But to his surprise, the other dancers loved his move even more.\n" +
                            "\n" +
                            "They started to shout:\n" +
                            "\n" +
                            "“Do that Lock, Campbell, do that Lock!”\n" +
                            "\n" +
                            "And with that, the art of Locking was born.\n" +
                            "\n" +"\n" +
                            "THE SPREAD OF LOCKING\n" +
                            "\n" +
                            "After Don got a taste of dance through that first signature move, he began looking for more ways to explore the art.\n" +
                            "\n" +
                            "His “Lock” move was a playful arm/body freeze that was timed to emphasize striking moments in the music. \n" +
                            "\n" +
                            "In order to fill the space throughout the song, he started experimenting with other movements, like the Hambone, Wrist Rolls, and Points.\n" +
                            "\n" +
                            "From clubs and parties, Don started bringing his most crowd-pleasing moves to local competitions where he and his fellow students would battle for cash."
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