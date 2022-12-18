#!/usr/bin/env kscript
@file:Include("files.kt")
@file:Include("gradleBuildTemplate.kt")

import java.io.File

val dependsOnMaven = "@file:DependsOnMaven\\((.*)\\)".toRegex()

@OptIn(ExperimentalStdlibApi::class)
val dependencies = scriptFiles
    .toList()
    .map { it.readLines() }
    .flatMap { lines ->
        lines.filter { line -> line.startsWith("@file:DependsOnMaven(") }
    }
    .toSet()
    .map {dependsOnMaven.matchAt(it,0)!!.groupValues[1] }
    .map { "implementation($it)"}
    .onEach { println(it) }
    

File("../build.gradle.kts")
    .writeText(gradleBuildTemplate(dependencies))
