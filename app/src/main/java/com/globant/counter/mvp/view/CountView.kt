package com.globant.counter.mvp.view


import android.app.Activity
import com.globant.counter.utils.bus.RxBus
import com.globant.counter.utils.bus.observer.OnCountButtonPressedBusObserver
import com.globant.counter.utils.bus.observer.OnResetButtonPressedBusObserver
import com.globant.counter.utils.bus.observer.OnRestButtonPressedBusObserver
import kotlinx.android.synthetic.main.activity_main.*


class CountView(activity: Activity) : ActivityView(activity) {

    init {
        activity.count_button.setOnClickListener {
            RxBus.post(OnCountButtonPressedBusObserver.OnCountButtonPressed())
        }

        activity.reset_button.setOnClickListener {
            RxBus.post(OnResetButtonPressedBusObserver.OnResetButtonPressed())
        }

        activity.rest_button.setOnClickListener {
            RxBus.post(OnRestButtonPressedBusObserver.OnRestButtonPressed())
        }
    }

    fun setCount(count: String) {
        activity!!.count_label.text = count
    }
}
