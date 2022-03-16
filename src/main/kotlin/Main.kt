// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.*
import androidx.compose.ui.Alignment.*
import androidx.compose.ui.window.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.Dp

fun main() = application {
    val windowState = rememberWindowState()
//    windowState.placement = WindowPlacement.Fullscreen;
//    windowState.placement = WindowPlacement.Maximized;
    Window(state = windowState, onCloseRequest = ::exitApplication) {
        App()
    }
}

//@OptIn(ExperimentalComposeUiApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        Column() {
            Row(modifier = Modifier.background(Color.Green).fillMaxWidth().height(20.dp)) {
                Text("Hello World!", modifier = Modifier.padding(2.dp))
                Text("Hello World2!", modifier = Modifier.padding(2.dp))
            }
            Box(modifier = Modifier.background(Color.Yellow)//.fillMaxHeight()
                .wrapContentHeight(align = Alignment.Bottom)
                .weight(1f)
                .fillMaxWidth(),
            ) {

            }
            Row(modifier = Modifier.background(Color.Green).fillMaxWidth().height(20.dp)
                    .wrapContentHeight(align = Alignment.Bottom)) {
                Text("Hello World!", modifier = Modifier.padding(2.dp))
                Text("Hello World2!", modifier = Modifier.padding(2.dp))
            }
            }
        }
    }

//@Composable
//fun ListItem() {
//    Surface(
//        modifier = Modifier.fillMaxWidth(),
//        shape = RoundedCornerShape(8.dp),
//        elevation = 2.dp
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth().preferredHeight(IntrinsicSize.Max),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Column(
//                modifier = Modifier
//                    .padding(8.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "Code")
//                Text(text = "2456")
//            }
//            Spacer(
//                modifier = Modifier
//                    .preferredWidth(1.dp)
//                    .fillMaxHeight()
//                    .background(color = Color.Black.copy(0.12f))
//            )
//            Spacer(modifier = Modifier.weight(1f))
//            Text(
//                modifier = Modifier
//                    .padding(horizontal = 8.dp, vertical = 34.dp),
//                text = "Some name"
//            )
//            Spacer(modifier = Modifier.weight(1f))
//        }
//    }
//}

@Preview
@Composable
fun TwoTextsPreview() {
    MaterialTheme {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there")
        }
    }
}


@Composable
fun TwoTexts(
    text1: String,
    text2: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.Start),
            text = text1
        )

        Divider(
            color = Color.Black,
            modifier = Modifier.fillMaxHeight().width(1.dp)
        )
        Text(
            modifier = Modifier
                .weight(2f)
                .padding(end = 4.dp)
                .wrapContentWidth(Alignment.End),
            text = text2
        )
    }
}
