import java.io.File

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

