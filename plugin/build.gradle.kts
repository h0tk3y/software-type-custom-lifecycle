plugins {
    kotlin("jvm")
    `kotlin-dsl`
    `java-gradle-plugin`
}

dependencies {
    implementation("com.android.tools.build:gradle:8.6.0-alpha07")
}

gradlePlugin {
    plugins { 
        create("com.example.my.sample.ecosystem") {
            id = "com.example.my.sample.ecosystem"
            implementationClass = "com.example.sample.MyEcosystem"
        }
        create("com.example.my.sample.plugin") {
            id = "com.example.my.sample.plugin"
            implementationClass = "com.example.sample.MyPlugin"
        }

        create("com.example.my.android.ecosystem") {
            id = "com.example.my.android.ecosystem"
            implementationClass = "com.example.android.AndroidEcosystem"
        }
        create("com.example.my.android.plugin") {
            id = "com.example.my.android.plugin"
            implementationClass = "com.example.android.AndroidPlugin"
        }
    }
}