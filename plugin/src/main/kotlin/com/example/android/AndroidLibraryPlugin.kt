package com.example.android

import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.internal.plugins.software.SoftwareType
import org.gradle.api.internal.plugins.software.CustomSoftwareTypeLifecycle
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.provideDelegate
import javax.inject.Inject

class AndroidLibraryPlugin @Inject constructor(private val project: Project) : Plugin<Project> {

    @Suppress("UnstableApiUsage")
    @get:SoftwareType(name = "androidLibrary")
    @get:CustomSoftwareTypeLifecycle
    val androidLibrary: LibraryExtension by lazy {
        project.extensions.getByType(LibraryExtension::class.java)
    }

    override fun apply(target: Project) {
        target.plugins.apply(LibraryPlugin::class)
        
        // minimal requirements to build
        androidLibrary.compileSdk = 31
        androidLibrary.namespace = "com.example.android"
    }
}