plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "BuilderTasl"
include("src:main:files")
findProject(":src:main:files")?.name = "files"
