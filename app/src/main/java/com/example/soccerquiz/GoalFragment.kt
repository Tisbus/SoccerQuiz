package com.example.soccerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.soccerquiz.databinding.FragmentGoalBinding


class GoalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentGoalBinding>(inflater, R.layout.fragment_goal, container, false)
        binding.goalFrag = this

        binding.buttonPass.setOnClickListener { view : View ->
            Navigation.findNavController(view).navigate(R.id.action_goalFragment_to_wellcomeFragment)
        }

        return binding.root
    }
}