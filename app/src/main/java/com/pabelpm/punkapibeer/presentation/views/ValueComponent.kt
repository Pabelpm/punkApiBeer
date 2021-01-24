package com.pabelpm.punkapibeer.presentation.views

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.pabelpm.punkapibeer.R
import kotlinx.android.synthetic.main.value_component.view.*


class ValueComponent(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {
    private lateinit var title: String
    private lateinit var value: String
    private lateinit var unit: String

    init {
        //Use synthetic
        inflate(context, R.layout.value_component, this)
    }


    fun updateComponent(valueComponentEntity: ValueComponentEntity) {
        title = valueComponentEntity.title
        titleTextView.text = title

        value = valueComponentEntity.value.toString()
        valueTextView.text = value

        unit = valueComponentEntity.unit
        unitTextView.text = unit
    }

    data class ValueComponentEntity(
        val title: String,
        val value: Double,
        val unit: String
    )
}