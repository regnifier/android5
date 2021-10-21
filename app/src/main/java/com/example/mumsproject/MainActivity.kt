package com.example.mumsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.mumsproject.Fragments.*
import com.example.mumsproject.contract.Navigator

class MainActivity : AppCompatActivity(), Navigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, LevelsFragment())
                .commit()
        }

    }

    override fun onBackPressed() {

    }

    private fun launchFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .addToBackStack(null)
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    override fun showFirstLvl() {
        launchFragment(FirstLvlFragment())
    }

    override fun showSecondLvl() {
        launchFragment(SecondLvlFragment())
    }

    override fun showThridLvl() {
        launchFragment(ThirdLvlFragment())
    }

    override fun showMainScreen() {
        launchFragment(MainFragment())
    }

    override fun showMinus1Screen() {
        launchFragment(minusOneFragment())
    }

    override fun showPlus2Screen() {
        launchFragment(PlusTwoFragment())
    }

    override fun showMinus2Screen() {
        launchFragment(MinusTwoFragment())
    }

    override fun showPlus3Screen() {
        launchFragment(PlusThreeFragment())
    }

    override fun showMinus3Screen() {
        launchFragment(MinusThreeFragment())
    }

    override fun showLostScreen() {
        launchFragment(LostFragment())
    }

    override fun showCongratulationsScreen() {
        launchFragment(WinFragment())
    }

    override fun goBack() {
        onBackPressed()
    }

    override fun goToMenu() {
        supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }

    override fun showPlus0Screen() {
        launchFragment(PlusMinusZeroFragment())
    }

    override fun showPlusNumberScreen() {
        launchFragment(PlusMinusNumberFragment())
    }

    override fun showPlusHalfNumberScreen() {
        launchFragment(PlusMinusHalfNumberFragment())
    }

    override fun show12NumberScreen() {
        launchFragment(OneTwoNumberFragment())
    }

    override fun show34NumberScreen() {
        launchFragment(ThreeFourFragment())
    }

    override fun show1234NumberScreen() {
        launchFragment(OneTwoThreeFourFragment())
    }

    override fun showFinalScreen() {
        launchFragment(FinalFragment())
    }

    override fun showFirstFinalScreen() {
        launchFragment(FirstLvlFinalFragment())
    }

    override fun showSecondFinalScreen() {
        launchFragment(SecondFinalFragment())
    }
}