import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.arkivanov.decompose.extensions.compose.jetbrains.asState
import me.katz.common.Counter

private val counter = Counter()

fun main() = Window {
    MaterialTheme {
        CounterUi(counter)
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