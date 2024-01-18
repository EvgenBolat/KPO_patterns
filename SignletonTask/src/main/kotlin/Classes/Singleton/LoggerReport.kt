package org.example.Classes.Singleton

import java.time.LocalDateTime
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption


class LoggerReport private constructor() {

    companion object{
        private var Instance: LoggerReport? = null

        private  var path: String = "src/main/files/output.txt"
        private var json_path: String = "src/main/files/output.json"

        private var path_path: Path? = null
        private var json_path_path: Path? = null

        fun GetLogger() : LoggerReport {
            if (Instance == null) {
                Instance = LoggerReport()
                if (File(path).exists()) {
                    File(path).writeText("")
                }
                else {
                    val file = File(path)
                    file.createNewFile()
                }
                if (!File(json_path).exists()) {
                    val file = File(json_path)
                    file.createNewFile()
                }
                else {
                    File(path).writeText("")
                }
                path_path = Paths.get(path)
                json_path_path = Paths.get(json_path)
            }
            return Instance!!
        }
    }

    fun InfoLog(module:String, message:String) {
        val localDateTime = LocalDateTime.now()
        val date = localDateTime.dayOfMonth.toString() + "." +
                localDateTime.monthValue.toString() + "." +
                localDateTime.year.toString() + " " +
                localDateTime.hour.toString() + ":" +
                localDateTime.minute.toString()
        val Path = path_path!!
        val Json_Path = json_path_path!!
        val text = Json.encodeToString<Array<String>>(arrayOf("inf", date, module, message))
        Files.write(Path, (text + "\n").toByteArray(), StandardOpenOption.APPEND)
        Files.write(Json_Path, (text + "\n").toByteArray(), StandardOpenOption.APPEND)
    }

    fun WarningLog(part:String, message:String) {
        val localDateTime = LocalDateTime.now()
        val date = localDateTime.dayOfMonth.toString() + "." +
                localDateTime.monthValue.toString() + "." +
                localDateTime.year.toString() + " " +
                localDateTime.hour.toString() + ":" +
                localDateTime.minute.toString()
        val Path = path_path!!
        val Json_Path = json_path_path!!
        val text = Json.encodeToString<Array<String>>(arrayOf("wrn", date, part, message))
        Files.write(Path, (text + "\n").toByteArray(), StandardOpenOption.APPEND)
        Files.write(Json_Path, (text + "\n").toByteArray(), StandardOpenOption.APPEND)
    }

    fun ErrorLog(part:String, message:String) {
        val localDateTime = LocalDateTime.now()
        val date = localDateTime.dayOfMonth.toString() + "." +
                localDateTime.monthValue.toString() + "." +
                localDateTime.year.toString() + " " +
                localDateTime.hour.toString() + ":" +
                localDateTime.minute.toString()
        val Path = path_path!!
        val Json_Path = json_path_path!!
        val text = Json.encodeToString<Array<String>>(arrayOf("err", date, part, message))
        Files.write(Path, (text + "\n").toByteArray(), StandardOpenOption.APPEND)
        Files.write(Json_Path, (text + "\n").toByteArray(), StandardOpenOption.APPEND)
    }
}