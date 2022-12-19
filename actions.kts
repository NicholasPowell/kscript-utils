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
  runCommand("kscript")
}

println("v2")


actions.onEach {
  println(it) 
}
