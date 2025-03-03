package com.plcoding.jetpackcomposepokedex.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import app.netlify.dev4rju9.pokedex.R

val Roboto = FontFamily(
    fonts = listOf(
        Font(resId = R.font.roboto_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(resId = R.font.roboto_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
        Font(resId = R.font.roboto_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(resId = R.font.roboto_bold, weight = FontWeight.Bold, style = FontStyle.Normal)
    )
)

val RobotoCondensed = FontFamily(
    fonts = listOf(
        Font(resId = R.font.roboto_condensed_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(resId = R.font.roboto_condensed_regular, weight = FontWeight.Normal, style = FontStyle.Normal)
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    displaySmall = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)