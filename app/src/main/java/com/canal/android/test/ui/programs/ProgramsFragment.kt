package com.canal.android.test.ui.programs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.canal.android.test.R
import com.canal.android.test.ui.programs.view.adapter.ProgramsAdapter
import kotlinx.android.synthetic.main.fragment_programs.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProgramsFragment : Fragment() {

    private val viewModel: ProgramsViewModel by viewModel()
    private val recyclerAdapter = ProgramsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_programs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        programs_recycler.apply {
            layoutManager = LinearLayoutManager(view.context)
            adapter = recyclerAdapter
        }

        viewModel.uiData.observe(viewLifecycleOwner, Observer { pageProgramsUi ->
            recyclerAdapter.submitList(pageProgramsUi.programs)
        })
    }
}