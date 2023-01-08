package com.example.keta

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class IntroFragment : Fragment() {
    private var position = 0

    var currentLayout: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            position = it.getInt(POSITION)
        }

        when(position) {
            0 -> currentLayout = R.layout.intro_one_layout
            1 -> currentLayout = R.layout.intro_two_layout
            2 -> currentLayout = R.layout.intro_three_layout
            else -> currentLayout = R.layout.intro_one_layout
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  currentLayout?.let { inflater.inflate(it, container, false) }
        view?.findViewById<Button>(R.id.mulai_btn)?.setOnClickListener {
            val intent = Intent(context, SignUpActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    companion object {
        private const val POSITION = "position"

        @JvmStatic
        fun newInstance(position: Int) =
            IntroFragment().apply {
                arguments = Bundle().apply {
                    putInt(POSITION, position)
                }
            }
    }
}