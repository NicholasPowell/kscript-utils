#!/usr/bin/env kscript

val actions = listOf('
  "files.kt",
  "ks.kts"
)

for(arg in args) {
  println(arg)
}

println("v2")


actions.onEach {
  println(it) 
}
