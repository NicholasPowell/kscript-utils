#!/usr/bin/env kscript

val actions = listOf('
  "files.kt",
  "ks.kts"
)

for(arg in args) {
  println(arg)
}



actions.onEach {
  println(it) 
}
