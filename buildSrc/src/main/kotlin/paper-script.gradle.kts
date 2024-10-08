plugins {
    kotlin("jvm")
    id("io.papermc.paperweight.userdev")
    id("xyz.jpenilla.run-paper")
}

repositories {
    mavenCentral()
    maven("https://repo.codemc.org/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle("1.20.4-R0.1-SNAPSHOT")
    compileOnly("de.miraculixx:kpaper:1.1.2")
    implementation("dev.jorel:commandapi-bukkit-shade-mojang-mapped:9.5.3")
    implementation("dev.jorel:commandapi-bukkit-kotlin:9.5.3")
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
}
