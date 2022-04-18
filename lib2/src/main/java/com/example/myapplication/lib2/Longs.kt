package com.example.myapplication.lib2

import javax.inject.Inject
/*

@com.squareup.anvil.annotations.ContributesTo(javax.inject.Singleton::class)
@dagger.Module
abstract class LongsModule {
  @dagger.multibindings.Multibinds abstract fun longs(): Set<Long>
}
*/

@com.infotechcorp.gradle.anvilextensions.ConsumesMultibinding(javax.inject.Singleton::class)
class Longs @Inject constructor(
  private val longs: Set<Long>
) {
  fun b() {
    14
  }
}
