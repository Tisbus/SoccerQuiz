package com.example.soccerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.soccerquiz.databinding.ActivityMainBinding
import com.example.soccerquiz.databinding.FragmentWellcomeBinding


class WellcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentWellcomeBinding>(inflater, R.layout.fragment_wellcome, container, false)

        binding.buttonLetsPlay.setOnClickListener { view : View ->
            Navigation.findNavController(view).navigate(R.id.action_wellcomeFragment_to_quizFragment)
        }

        return binding.root
    }
}