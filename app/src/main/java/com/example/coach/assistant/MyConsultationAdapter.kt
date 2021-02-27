/*
package com.daya.setapp.View.Adapter

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.coach.widget.MyTextView
import com.example.coach.widget.MyTextViewBold
import com.daya.setapp.Assistant.UnitConverter
import com.daya.setapp.Model.Consultation.MyConsultationModel
import com.daya.setapp.R
import com.daya.setapp.View.Widget.MyTextView
import com.daya.setapp.View.Widget.MyTextViewBold
import com.example.coach.R
import com.github.abdularis.civ.CircleImageView
import java.text.SimpleDateFormat
import java.util.*


class MyConsultationAdapter(
    private val myConsultationModel: List<MyConsultationModel>,
    private val mContext: Context,
    private val activity: Activity
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var inflater: LayoutInflater? = null
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(mContext)
        return MyViewHolder(
            inflater.inflate(R.layout.my_consultation_item_card, parent, false),
            mContext
        )
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        (holder as MyViewHolder).bindData(myConsultationModel[position], position)
    }

    override fun getItemCount(): Int {
        return myConsultationModel.size
    }

    inner class MyViewHolder(
        inflate: View,
        mContext: Context?
    ) : RecyclerView.ViewHolder(inflate) {
        var avatarImg: CircleImageView = inflate.findViewById(R.id.mcic_coach_img)
        var titleTxtBld: MyTextViewBold = inflate.findViewById(R.id.mcic_title_txt_bld)
        var dateTxt: MyTextView = inflate.findViewById(R.id.mcic_date_txt)
        var timeTxt: MyTextView = inflate.findViewById(R.id.mcic_time_txt)
        var counterTxt: MyTextView = inflate.findViewById(R.id.mcic_counter_txt)
        var callImg: AppCompatImageView = inflate.findViewById(R.id.mcic_call_img)
        fun bindData(model: MyConsultationModel?, position: Int) {
            val displayMetrics = DisplayMetrics()
            activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
            var height: Int = displayMetrics.heightPixels
            var width: Int = displayMetrics.widthPixels
            if ((height - width) > 750) {
                val params = ConstraintLayout.LayoutParams(140, 140)
                params.topToTop = R.id.mcic_main_img
                params.bottomToBottom = R.id.mcic_main_img
                params.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
                params.rightMargin = 110
                avatarImg.layoutParams = params

                val txtParams = ConstraintLayout.LayoutParams(
                    0,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                txtParams.topToTop = R.id.mcic_call_img
                txtParams.bottomToBottom = R.id.mcic_call_img
                txtParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
                txtParams.rightMargin = 400
                txtParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
                txtParams.leftMargin = 12

                titleTxtBld.layoutParams = txtParams
            } else if ((height - width) > 450) {
                val params = ConstraintLayout.LayoutParams(90, 90)
                params.topToTop = R.id.mcic_main_img
                params.bottomToBottom = R.id.mcic_main_img
                params.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
                params.rightMargin = 40
                avatarImg.layoutParams = params

                val txtParams = ConstraintLayout.LayoutParams(
                    0,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                txtParams.topToTop = R.id.mcic_call_img
                txtParams.bottomToBottom = R.id.mcic_call_img
                txtParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
                txtParams.rightMargin = 196
                txtParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
                txtParams.leftMargin = 12

                titleTxtBld.layoutParams = txtParams
            }

            if (model!!.dateShow != null)
                dateTxt.text = "تاریخ مشاوره: " + model!!.dateShow

            if (model!!.timeStartShow != null && model!!.timeEndShow != null)
                timeTxt.text =
                    "زمان مشاوره: از" + model!!.timeStartShow + " تا " + model!!.timeEndShow

            val format = SimpleDateFormat("yyyy-MM-dd")
            counterTxt.text = UnitConverter.getTextFromDateDiffrence(Calendar.getInstance().time , format.parse(model.date.split("T")[0]) , model.timeStart)

            if (counterTxt.text == "نوبت شماست"){
                counterTxt.setTextColor(mContext.resources.getColor(android.R.color.holo_green_dark))
                callImg.background.setColorFilter(Color.parseColor("#0380a0"), PorterDuff.Mode.SRC_ATOP)
            }else if (counterTxt.text == "پایان نوبت"){
                counterTxt.setTextColor(mContext.resources.getColor(android.R.color.holo_red_dark))
            }
        }
    }
}
*/
