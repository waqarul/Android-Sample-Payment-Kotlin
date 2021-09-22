package com.wtmcodex.samplepaymentapp.core.di.module

import com.wtmcodex.samplepaymentapp.features.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment
}