package org.example.Classes.Builders

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.example.Classes.Reports.CourseReport
import org.example.Classes.Singleton.LoggerReport

class CourseReportBuilder : ReportBuilder {
    private val result = CourseReport()
    private val part = "CourseReportBuilder"
    override fun reset() {
        result.reportString = ""
        result.header = ""
        result.name = ""
        result.task = ""
        result.executor = ""
        result.scientificAdviser = ""
        result.listOfSesources = ""
        result.annotation = ""
        val logger = LoggerReport.GetLogger()
        logger.InfoLog(part, "Reset")
    }

    override fun setName(name: String) {
        val logger = LoggerReport.GetLogger()
        if (name == "") {
            logger.WarningLog(part, "Set empty name")
        }
        else {
            logger.InfoLog(part, "Set not empty name")
        }
        result.name = name
    }

    override fun setTask(task: String) {
        val logger = LoggerReport.GetLogger()
        if (task == "") {
            logger.WarningLog(part, "Set empty task")
        }
        else {
            logger.InfoLog(part, "Set not empty task")
        }
        result.task = task
    }

    override fun setAnnotation(annotation: String) {
        val logger = LoggerReport.GetLogger()
        if (annotation == "") {
            logger.WarningLog(part, "Set empty annotation")
        }
        else {
            logger.InfoLog(part, "Set not empty annotation")
        }
        result.annotation = annotation
    }

    override fun setHeader(header: String) {
        val logger = LoggerReport.GetLogger()
        if (header == "") {
            logger.WarningLog(part, "Set empty header")
        }
        else {
            logger.InfoLog(part, "Set not empty header")
        }
        result.header = header
    }

    override fun setReportString(reportString: String) {
        val logger = LoggerReport.GetLogger()
        if (reportString == "") {
            logger.WarningLog(part, "Set empty report")
        }
        else {
            logger.InfoLog(part, "Set not empty report")
        }
        result.reportString = reportString
    }

    override fun setListOfSources(listOfSources: String) {
        val logger = LoggerReport.GetLogger()
        if (listOfSources == "") {
            logger.WarningLog(part, "Set empty list of sources")
        }
        else {
            logger.InfoLog(part, "Set not empty list of sources")
        }
        result.listOfSesources = listOfSources
    }

    fun getResult(): CourseReport {
        val logger = LoggerReport.GetLogger()
        logger.InfoLog(part, "Return science report")
        return this.result
    }

    override fun getJSONResult(): String{
        val logger = LoggerReport.GetLogger()
        logger.InfoLog(part, "Returned jsonified stroke with this Course report")
        return Json.encodeToString<CourseReport>(this.result)
    }

    fun setScientificAdviser(scientificAdviser: String){
        val logger = LoggerReport.GetLogger()
        if (scientificAdviser == "") {
            logger.WarningLog(part, "Set empty scientific adviser")
        }
        else {
            logger.InfoLog(part, "Set not empty scientific adviser")
        }
        result.scientificAdviser = scientificAdviser
    }

    fun setExecutor(executor: String){
        val logger = LoggerReport.GetLogger()
        if (executor == "") {
            logger.WarningLog(part, "Set empty executor")
        }
        else {
            logger.InfoLog(part, "Set not empty executor")
        }
        result.executor = executor
    }
}