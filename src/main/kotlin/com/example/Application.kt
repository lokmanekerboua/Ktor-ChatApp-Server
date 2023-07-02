package com.example

import com.example.di.mainModule
import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.util.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger


fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    install(Koin) {
        slf4jLogger()
        modules(mainModule)
    }

    configureSockets()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSecurity()

}