package com.example.myapplication

import com.squareup.anvil.annotations.compat.MergeInterfaces
import com.squareup.anvil.annotations.compat.MergeModules
import javax.inject.Singleton

@MergeModules(Singleton::class)     interface MergedSingletonModule
@MergeInterfaces(Singleton::class)   interface MergedSingletonComponent