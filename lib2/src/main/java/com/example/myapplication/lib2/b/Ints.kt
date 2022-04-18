package com.example.myapplication.lib2.b

import javax.inject.Inject
/*

@com.squareup.anvil.annotations.ContributesTo(javax.inject.Singleton::class)
@dagger.Module
abstract class LongsModule {
  @dagger.multibindings.Multibinds abstract fun longs(): Set<Int>
}
*/

@com.infotechcorp.gradle.anvilextensions.ConsumesMultibinding(javax.inject.Singleton::class)
class Ints @Inject constructor(
  private val ints: Set<Int>
)
