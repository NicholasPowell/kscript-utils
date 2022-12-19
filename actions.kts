#!/usr/bin/env kscript

val actions = listOf(
  "files.kt",
  "ks.kts"
)

for(arg in args) {
  actions.contains(arg)
  
}

println("v2")


actions.onEach {
  println(it) 
}
