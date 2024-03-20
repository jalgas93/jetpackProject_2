package com.compose.jetpack.ui.components

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.compose.jetpack.model.Result

@Composable
fun RecipeListItem(result: Result) {
    var expanded by remember { mutableStateOf(false) }
          print(Result)
    Log.i("result",result.name)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        colors = CardDefaults.cardColors(Color.White)
    ) {

        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            if(result.profile_path !=null) {
                AsyncImage(
                    model = result.profile_path,
                    contentDescription = "thumbnail",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
            }

            Spacer(modifier = Modifier.padding(4.dp))
            Text(text = result.name ?: "", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(8.dp))
            Text(text = "Ingredients", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
            Text(text = getIngredients(result))
            Spacer(modifier = Modifier.padding(8.dp))

            AnimatedVisibility(visible = expanded) {
                Column {
                    Text(
                        text = "Instructions",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(text = "")
                }

            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    expanded = !expanded
                }) {
                Icon(
                    imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = "Clear",
                    tint = Color.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }

    }
}

fun getIngredients(meal: Result): String{
    var ingredients = ""

    with(meal){
        meal.name
    }
    return  ingredients.trimEnd();

}
