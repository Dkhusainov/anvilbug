package com.example.myapplication.b

import com.squareup.anvil.annotations.ContributesBinding
import java.io.Closeable
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class BClass @Inject constructor(): Closeable {
  override fun close() {
    TODO("Not yet implemented")
  }
}