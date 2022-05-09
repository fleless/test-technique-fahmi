package com.canal.android.test.ui.programs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.canal.android.test.R
import com.canal.android.test.ui.MainActivity
import com.canal.android.test.ui.programs.view.adapter.ProgramsAdapter
import com.canal.android.test.ui.programs.view.adapter.ProgramsDecorator
import kotlinx.android.synthetic.main.fragment_programs.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProgramsFragment : Fragment() {

    private val viewModel: ProgramsViewModel by viewModel()
    private lateinit var recyclerAdapter: ProgramsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //(requireActivity() as MainActivity?)!!.supportActionBar!!.show()
        return inflater.inflate(R.layout.fragment_programs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerAdapter = ProgramsAdapter(listener)
        programs_recycler.apply {
            layoutManager = LinearLayoutManager(view.context)
            adapter = recyclerAdapter
            addItemDecoration(ProgramsDecorator(view.context))
        }

        viewModel.uiData.observe(viewLifecycleOwner, Observer { pageProgramsUi ->
            recyclerAdapter.submitList(pageProgramsUi.programs)
        })
    }

    private val listener = ProgramsAdapter.OnClickListener { url ->
        findNavController().navigate(
            ProgramsFragmentDirections.actionFragmentProgramsToDetailsFragment2(url)
        )
    }
}