package com.hfad.networkingdemo
// Dylan Bellinger and Steven Griffin
// Assignment 3
// 4/6/2023

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hfad.networkingdemo.databinding.FragmentDetailBinding


/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {


     //ID variable
     var movie_id: Int = 0

    private var _binding : FragmentDetailBinding? = null
    private  val binding get() = _binding !!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   recipient = arguments!!.getString("recipient")
        val bundle = arguments
        if (bundle == null) {
            Log.e("DetailFragment", "DetailFragment did not receive hero id")

            return
        }
        movie_id = DetailFragmentArgs.fromBundle(bundle).movieId

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        System.out.println(movieList.get(movie_id).title)
        binding.name.text = movieList.get(movie_id).title
        binding.rating.text = movieList.get(movie_id).rating
        binding.description.text = movieList.get(movie_id).description
        binding.year.text = movieList.get(movie_id).year.toString()
        Glide.with(requireContext()).load(movieList.get(movie_id).thumbnail)
            .apply(RequestOptions().centerCrop())
            .into(binding.itemImage)

    }
}