package com.example.myapplication.lib2

import javax.inject.Inject
/*

@com.squareup.anvil.annotations.ContributesTo(javax.inject.Singleton::class)
@dagger.Module
abstract class StringsModule {
  @dagger.multibindings.Multibinds abstract fun strings(): Set<String>
}
*/

@com.infotechcorp.gradle.anvilextensions.ConsumesMultibinding(javax.inject.Singleton::class)
class Strings @Inject constructor(
  private val strings: Set<String>
)