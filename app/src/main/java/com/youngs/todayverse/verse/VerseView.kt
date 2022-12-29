package com.youngs.todayverse.verse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.youngs.database.ConnectDB
import com.youngs.todayverse.databinding.FragmentMainBinding
import java.util.*


class VerseView : Fragment() {

    lateinit var binding: FragmentMainBinding

    val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentMainBinding.inflate(layoutInflater)

        val getVerse = ConnectDB.selectTable(requireContext(),"t_VERSE")
        val randNumber = rand(0,getVerse.count())

        binding.verseContentTextView.text = getVerse.get(randNumber).Content
        binding.verseSpeakerTextView.text = getVerse.get(randNumber).Speaker

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return binding.root
    }

    private fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
}