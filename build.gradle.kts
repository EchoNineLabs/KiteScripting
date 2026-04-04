plugins {
    id("org.jetbrains.kotlin.jvm") version "2.3.20"
}

repositories {
    mavenLocal()
    mavenCentral()
    // https://github.com/PaperMC/Paper
    maven { url = uri("https://repo.papermc.io/repository/maven-public/") }
}

dependencies {
    // Kite dependency is required for .kite.kts scripts to be properly recognized.
    compileOnly("dev.echonine:kite:1.4.1")
    // Server API can be Paper, Folia, Purpur or any other compatible fork.
    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
    // Other dependencies used in scripts like e.g., LuckPerms or PlaceholderAPI, can be added as well.
}
