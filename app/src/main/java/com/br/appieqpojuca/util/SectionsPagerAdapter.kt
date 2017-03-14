package com.br.appieqpojuca.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.br.appieqpojuca.activitys.CultoActivity
import com.br.appieqpojuca.activitys.HistoriaActivity

/**
 * Created by faro on 09/02/17.
 */
class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> {

                val historia = HistoriaActivity()
                return historia
            }

            1 -> {
                val culto = CultoActivity()
                return culto
            }

            else ->

                return null
        }


    }

    override fun getCount(): Int {

        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "História"
            1 -> return "Cultos"
        }
        return null
    }
}
