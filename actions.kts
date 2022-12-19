#!/usr/bin/env kscript

@file:Include("runCommand.kts")
@file:Include("files.kt")
@file:Include("ks.kts")

val actions = listOf(
  "runCommand.kts",
  "files.kt",
  "ks.kts"
)

for(arg in args) {
  if(  actions.contains(arg) )
    ks(arg)
}

println("v3")

actions.onEach {
  println(it) 
}
