package com.youngs.todayverse.verse

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.youngs.database.ConnectDB
import com.youngs.todayverse.R
import com.youngs.todayverse.databinding.FragmentMainBinding
import java.util.*


class VerseView : Fragment() {

    lateinit var binding: FragmentMainBinding
    val random = Random()
    var randBackgroundNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentMainBinding.inflate(layoutInflater)

        val getVerse = ConnectDB.selectTable(requireContext(),"t_VERSE")
        val randVerseNumber = rand(0,getVerse.count())
        randBackgroundNumber = rand(0,4)

        binding.verseContentTextView.text = getVerse.get(randVerseNumber).Content
        binding.verseSpeakerTextView.text = getVerse.get(randVerseNumber).Speaker

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        when(randBackgroundNumber){
            0 -> {
                binding.rootBackground.setBackgroundResource(R.drawable.bg_star_night)
                binding.verseContentTextView.setTextColor(Color.WHITE)
                binding.verseSpeakerTextView.setTextColor(Color.WHITE)
            }
            1 -> {
                binding.rootBackground.setBackgroundResource(R.drawable.bg_jeju)
                binding.verseContentTextView.setTextColor(Color.WHITE)
                binding.verseSpeakerTextView.setTextColor(Color.WHITE)
            }
            2 -> {
                binding.rootBackground.setBackgroundResource(R.drawable.bg_dawn)
            }
            3 -> {
                binding.rootBackground.setBackgroundResource(R.drawable.bg_paper_airplane)
                binding.verseContentTextView.setTextColor(Color.WHITE)
                binding.verseSpeakerTextView.setTextColor(Color.WHITE)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        loadAD(requireContext(),binding.adBanner)
    }

    fun loadAD(context: Context, adBinding : AdView){

//        MobileAds.initialize( context, context.getString(R.string.app_ad_id));

        val adRequest = AdRequest.Builder().build()
        adBinding?.loadAd(adRequest)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return binding.root
    }

    private fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
}