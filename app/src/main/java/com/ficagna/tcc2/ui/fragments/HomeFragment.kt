package com.ficagna.tcc2.ui.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ficagna.tcc2.R
import com.ficagna.tcc2.databinding.FragmentHomeBinding
import com.ficagna.tcc2.ui.adapter.GroupListAdapter
import com.google.firebase.database.FirebaseDatabase

class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun initClicks() {
        binding.button1.setOnClickListener {
            it.hideKeyboard();
            findNavController().navigate(R.id.action_homeFragment_to_historyFragment)
        }
        binding.button3.setOnClickListener {
            it.hideKeyboard();
            findNavController().navigate(R.id.action_homeFragment_to_groupListFragment)
        }
    }

    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClicks()



            }
    }








