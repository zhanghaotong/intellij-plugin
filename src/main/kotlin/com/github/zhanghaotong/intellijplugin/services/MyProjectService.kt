package com.github.zhanghaotong.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.zhanghaotong.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
