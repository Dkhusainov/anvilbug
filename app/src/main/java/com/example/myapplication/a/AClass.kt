package com.example.myapplication.a

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class AClass @Inject constructor() : AutoCloseable {
  override fun close() {
    TODO("Not yet implemented")
  }
}