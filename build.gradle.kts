plugins {
    id("org.jetbrains.kotlin.jvm") version "2.3.0"
}

repositories {
    mavenLocal()
    mavenCentral()
    // https://github.com/PaperMC/Paper
    maven { url = uri("https://repo.papermc.io/repository/maven-public/") }
    // https://github.com/EchoNineLabs/Kite or https://codeberg.org/EchoNine/Kite/
    maven { url = uri("https://codeberg.org/api/packages/EchoNine/maven") }
}

dependencies {
    // Kite dependency is required for .kite.kts scripts to be properly recognized.
    compileOnly("dev.echonine.kite:kite:1.1.0")
    // Server API can be Paper, Folia, Purpur or any other compatible fork.
    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
    // Other dependencies used in scripts like e.g., LuckPerms or PlaceholderAPI, can be added as well.
}
