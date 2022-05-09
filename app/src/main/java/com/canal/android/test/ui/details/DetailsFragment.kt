package com.canal.android.test.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.canal.android.test.R
import com.canal.android.test.ui.MainActivity
import kotlinx.android.synthetic.main.fragment_details.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailsFragment : Fragment() {

    private val viewModel: DetailsViewModel by viewModel()
    private val urlArgs: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_details, container, false)
        //(requireActivity() as MainActivity?)!!.supportActionBar!!.hide()
        initObservers()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getDetails(urlArgs.url)
        initListeners()
    }

    private fun loadImage(url: String) {
        Glide.with(this)
            .load(url)
            .into(detailsImageView)
    }

    private fun initListeners() {
        back_arrow.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun initObservers() {
        viewModel.uiData.observe(viewLifecycleOwner, Observer { pageDetailsUi ->
            detailsTitleTextView.text = pageDetailsUi.details.title
            loadImage(pageDetailsUi.details.URLImage)
            detailsSubTitleTextView.text = pageDetailsUi.details.subtitle
            detailsDescriptionTextView.text = pageDetailsUi.details.summary
        })
    }

}