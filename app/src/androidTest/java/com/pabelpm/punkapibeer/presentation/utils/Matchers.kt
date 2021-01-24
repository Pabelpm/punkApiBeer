package com.pabelpm.punkapibeer.presentation.utils

import androidx.test.espresso.matcher.ViewMatchers.withId
import com.pabelpm.punkapibeer.presentation.views.ValueComponent
import com.schibsted.spain.barista.assertion.BaristaAssertions.assertAny
import kotlinx.android.synthetic.main.value_component.view.*

class Matchers {

    companion object {
        fun assertValueComponentView(
            id: Int,
            valueComponentEntity: ValueComponent.ValueComponentEntity
        ) {
            assertAny<ValueComponent>(withId(id), "Assert is different from expected"+
                    "\n Title-> ${valueComponentEntity.title}, " +
                    "\n Value-> ${valueComponentEntity.value.toString()}" +
                    "\n Unit -> ${valueComponentEntity.unit}") {

                it.titleTextView.text == valueComponentEntity.title &&
                        it.valueTextView.text == valueComponentEntity.value.toString() &&
                        it.unitTextView.text == valueComponentEntity.unit
            }
        }
    }
}
