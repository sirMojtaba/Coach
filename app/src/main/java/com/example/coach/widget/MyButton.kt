package com.example.coach.widget

import android.content.Context
import android.util.AttributeSet
import com.example.coach.assistant.utils
import com.google.android.material.button.MaterialButton

class MyButton : MaterialButton {


    constructor(context: Context?) : super(context!!) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!,
        attrs
    ) {
        init()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context!!, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        typeface = utils.iranYekan(context!!)
    }
}