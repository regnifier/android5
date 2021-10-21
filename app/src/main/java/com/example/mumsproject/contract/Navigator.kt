package com.example.mumsproject.contract

import android.graphics.BitmapFactory
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {

    fun showFirstLvl()

    fun showSecondLvl()

    fun showThridLvl()

    fun showMainScreen()

    fun showMinus1Screen()

    fun showPlus2Screen()

    fun showMinus2Screen()

    fun showPlus3Screen()

    fun showMinus3Screen()

    fun showLostScreen()

    fun showCongratulationsScreen()

    fun goBack()

    fun goToMenu()

    fun showPlus0Screen()

    fun showPlusNumberScreen()

    fun showPlusHalfNumberScreen()

    fun show12NumberScreen()

    fun show34NumberScreen()

    fun show1234NumberScreen()

    fun showFinalScreen()

    fun showFirstFinalScreen()

    fun showSecondFinalScreen()
}