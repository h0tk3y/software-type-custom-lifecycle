@file:Suppress("UnstableApiUsage")

package com.example.sample

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.internal.plugins.software.RegistersSoftwareTypes

@RegistersSoftwareTypes(MyPlugin::class)
class MyEcosystem : Plugin<Settings> {
    override fun apply(target: Settings) = Unit
}