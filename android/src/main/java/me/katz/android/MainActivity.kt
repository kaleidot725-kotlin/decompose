package me.katz.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.arkivanov.decompose.extensions.compose.jetpack.asState
import me.katz.common.Counter

class MainActivity : AppCompatActivity() {
    private val counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterUi(counter)
        }
    }
}

@Composable
fun CounterUi(counter: Counter) {
    Column {
        val state by counter.state.asState()

        Text(text = state.count.toString())

        Button(onClick = counter::increment) {
            Text("Increment")
        }
    }
}