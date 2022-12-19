import java.io.File

println("files.kt")
println("Utilities for parsing kscript source files")

val srcFiles = File(".")
    .listFiles()
    .iterator()
    .asSequence()

val sourceFiles
    get() =
        srcFiles
            .filter { it.extension == "kt" || it.extension == "kts" }
            .toList()

val scriptFiles
    get() =
        srcFiles
            .filter { it.extension == "kts" }
            .toList()

