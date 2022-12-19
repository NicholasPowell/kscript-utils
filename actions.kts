#!/usr/bin/env kscript

@file:Include("runCommand.kts")
@file:Include("files.kt")
@file:Include("ks.kts")



println("v4")

val actions = listOf(
  "runCommand.kts",
  "files.kt",
  "ks.kts"
)

for(arg in args) {
  if(  actions.contains(arg) )
    ks(arg)
}



actions.onEach {
  println(it) 
}
