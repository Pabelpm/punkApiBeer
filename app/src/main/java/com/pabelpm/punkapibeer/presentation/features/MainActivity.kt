package com.pabelpm.punkapibeer.presentation.features

import androidx.activity.viewModels
import com.pabelpm.punkapibeer.databinding.ActivityMainBinding
import com.pabelpm.punkapibeer.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun initializeView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getPageOfBeers(1)
    }

    override fun bindViewActions() {
        super.bindViewActions()
    }

    override fun observeViewModel() {
        super.observeViewModel()
    }
}