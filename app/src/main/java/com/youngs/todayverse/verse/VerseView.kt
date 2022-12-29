package com.youngs.todayverse.verse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.youngs.database.ConnectDB
import com.youngs.todayverse.databinding.FragmentMainBinding


class VerseView : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentMainBinding.inflate(layoutInflater)

        val getVerse = ConnectDB.selectTable(requireContext(),"t_VERSE")

        binding.verseContentTextView.text = getVerse.get(0).Content
        binding.verseSpeakerTextView.text = getVerse.get(0).Speaker

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return binding.root
    }
}