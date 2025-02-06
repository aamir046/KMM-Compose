package org.kmmcompose.demo.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform