package com.nhatvm.rice

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class GitCloneTask : DefaultTask(){

    @get:Input
    var repositoryUrl: String = ""

    @get:Input
    var branch: String = ""

    @get:Input
    var repoDir : String = ""

    @TaskAction
    fun cloneRepository(){
        logger.lifecycle("Cloning from $repositoryUrl branch $branch to directory $repoDir")
    }

}