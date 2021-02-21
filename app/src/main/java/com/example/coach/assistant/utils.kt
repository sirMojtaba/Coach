package com.example.coach.assistant

import android.content.Context
import android.graphics.Typeface

class utils {

    companion object{

        fun iranYekan(context: Context): Typeface? {
            return Typeface.createFromAsset(context.assets, "fonts/iran_yekan.ttf")
        }

        fun iranYekanBold(context: Context): Typeface? {
            return Typeface.createFromAsset(context.assets, "fonts/IRANYekanMobileBold.ttf")
        }
    }

}