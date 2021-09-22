package com.wtmcodex.samplepaymentapp.features.home

import android.view.LayoutInflater
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wtmcodex.samplepaymentapp.core.data.model.AlertModel
import com.wtmcodex.samplepaymentapp.databinding.FragmentHomeBinding
import com.wtmcodex.samplepaymentapp.features.BaseFragment

class HomeFragment : BaseFragment() {
    private var binding: FragmentHomeBinding? = null
    private lateinit var viewModel: HomeViewModel
    override fun getBindingView(inflater: LayoutInflater?): View {
        binding = FragmentHomeBinding.inflate(inflater!!)
        return binding!!.root
    }


    override fun getOrCreateViewModel() {
        viewModel = ViewModelProvider(this, viewModelFactoryProvider).get(
            HomeViewModel::class.java
        )
    }

    override fun setupUI() {
        setupRecyclerView()
        setupSwipeRefreshLayout()
    }

    override fun setupBindings() {
        viewModel.isLoading.observe(viewLifecycleOwner, { isLoading: Boolean? ->
            if (isLoading!!) {
                binding!!.pbLoading.visibility = View.VISIBLE
            } else {
                binding!!.pbLoading.visibility = View.GONE
            }
        })
        viewModel.showRefreshIndicator.observe(
            viewLifecycleOwner,
            { showRefreshIndicator: Boolean? ->
                binding!!.srLayout.isRefreshing = showRefreshIndicator!!
            })
        viewModel.isRecordFound.observe(viewLifecycleOwner, { isRecordFound: Boolean? ->
            if (isRecordFound!!) {
                binding!!.tvNoResult.visibility = View.GONE
                binding!!.rvPayment.visibility = View.VISIBLE
            } else {
                binding!!.tvNoResult.visibility = View.VISIBLE
                binding!!.rvPayment.visibility = View.GONE
            }
        })
        viewModel.viewItems.observe(viewLifecycleOwner, { viewItems: List<PaymentViewItem?>? ->
            val adapter = binding!!.rvPayment.adapter as PaymentRecyclerViewAdapter?
            adapter!!.setViewItems(viewItems)
        })
        viewModel.showAlertDialog.observe(viewLifecycleOwner, { alertModel: AlertModel? ->
            showAlert(
                alertModel!!
            )
        })
    }

    override fun setListeners() {
        binding!!.srLayout.setOnRefreshListener {
            binding!!.srLayout.isRefreshing = true
            doOnRefresh()
        }
    }

    override fun loadData() {
        viewModel.loadData(arguments)
    }

    private fun setupRecyclerView() {
        val adapter =
            PaymentRecyclerViewAdapter(object : PaymentRecyclerViewAdapter.OnItemClickedListener {
                override fun onItemClicked(item: PaymentViewItem) {
                    // TODO("Not yet implemented")
                }

            })
        val lManager: RecyclerView.LayoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding!!.rvPayment.layoutManager = lManager
        binding!!.rvPayment.adapter = adapter
    }

    private fun setupSwipeRefreshLayout() {
        binding!!.srLayout.setColorSchemeColors(
            ContextCompat.getColor(binding!!.srLayout.context, android.R.color.holo_blue_bright),
            ContextCompat.getColor(binding!!.srLayout.context, android.R.color.holo_green_light),
            ContextCompat.getColor(binding!!.srLayout.context, android.R.color.holo_orange_light),
            ContextCompat.getColor(binding!!.srLayout.context, android.R.color.holo_red_light)
        )
    }

    private fun doOnRefresh() {
        doApiCall()
    }

    private fun doApiCall() {
        viewModel.makeRequestToFetchPaymentMethods(false)
    }
}