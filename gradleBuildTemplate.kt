fun gradleBuildTemplate(dependencies: List<String>) =
    """
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
}

repositories {
    mavenLocal()
    mavenCentral()
    
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.6.21")
    implementation("com.github.holgerbrandl:kscript-annotations:1.4")
    // Dynamically Added from DependsOnMaven
    ${dependencies.joinToString("\n    ") { it }}
}

sourceSets.getByName("main").java.srcDirs("src")
sourceSets.getByName("test").java.srcDirs("src")
        
""".trimIndent()
