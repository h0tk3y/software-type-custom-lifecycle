package com.example.sample

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.internal.plugins.software.SoftwareType
import org.gradle.api.internal.plugins.software.CustomSoftwareTypeLifecycle
import org.gradle.api.provider.Property
import org.gradle.declarative.dsl.model.annotations.Restricted
import org.gradle.kotlin.dsl.newInstance
import javax.inject.Inject

class MyPlugin @Inject constructor(private val project: Project) : Plugin<Project> {
    @Suppress("UnstableApiUsage")
    @get:SoftwareType(name = "mySoftwareType")
    @get:CustomSoftwareTypeLifecycle
    val mySoftwareType: MySoftwareType by lazy {
        project.objects.newInstance(MySoftwareType::class)
    }
    
    override fun apply(target: Project) {
        target.extensions.add("mySoftwareType", mySoftwareType)
    }
}

abstract class MySoftwareType {
    @get:Restricted
    abstract val x: Property<Int>
}