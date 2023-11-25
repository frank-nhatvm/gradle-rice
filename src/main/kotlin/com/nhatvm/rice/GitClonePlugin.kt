package com.nhatvm.rice

import org.gradle.api.Plugin
import org.gradle.api.Project

class GitClonePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.create("gitClone", GitCloneTask::class.java) {
            // Configure the task as needed
        }
    }
}