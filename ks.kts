#!/usr/bin/env kscript

@file:Include("runCommand.kts")

val kst = "kscript"
val gistUrl = "https://raw.githubusercontent.com/NicholasPowell/kscript-utils/main/"

fun ks(action: String) = runShellCommand(kst, gistUrl + action)

