package am2023.pong.activity

import am2023.pong.R
import am2023.pong.pong.Settings
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    lateinit var settings: Settings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        settings = intent.getSerializableExtra("settings") as Settings
        setContentView(R.layout.activity_game)
    }

    override fun onRestart() {
        super.onRestart()
        this.onDestroy()
        this.onCreate(null)
    }
}
