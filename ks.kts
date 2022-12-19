#!/usr/bin/env kscript

@file:Include("runCommand.kts")
@file:DependsOnMaven("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

val kst = "kscript"
val gistUrl = "https://raw.githubusercontent.com/NicholasPowell/kscript-utils/main/"

println("ks.kts")
println("Kscript utilities")

println("ks {action}")
fun ks(action: String) = 
  runBlocking {
    executeShellCommand(kst, gistUrl + action)
  }

 println("clearCache")
fun clearCache() = 
  runBlocking {
    executeShellCommand("kscript", "--clear-cache")
  }
