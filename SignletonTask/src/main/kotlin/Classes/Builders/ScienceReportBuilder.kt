package org.example.Classes.Builders

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.example.Classes.Reports.ScienceReport
import org.example.Classes.Singleton.LoggerReport

@Serializable
class ScienceReportBuilder : ReportBuilder {
    private val result = ScienceReport()
    private val part = "ScienceReportBuilder"
    override fun reset() {
        result.reportString = ""
        result.header = ""
        result.name = ""
        result.task = ""
        result.fieldOfStudy = ""
        result.typeOfResearch = ""
        result.listOfSesources = ""
        result.annotation = ""
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

    fun setFieldOfStudy(fieldOfStudy: String){
        val logger = LoggerReport.GetLogger()
        if (fieldOfStudy == "") {
            logger.WarningLog(part, "Set empty field of study")
        }
        else {
            logger.InfoLog(part, "Set not empty field of study")
        }
        result.fieldOfStudy = fieldOfStudy
    }

    fun setTypeOfResearch(typeofResearch: String){
        val logger = LoggerReport.GetLogger()
        if (typeofResearch == "") {
            logger.WarningLog(part, "Set empty type of research")
        }
        else {
            logger.InfoLog(part, "Set not empty type of research")
        }
        result.typeOfResearch = typeofResearch
    }

    fun getResult(): ScienceReport{
        val logger = LoggerReport.GetLogger()
        logger.InfoLog(part, "Return science report")
        return this.result
    }

    override fun getJSONResult(): String{
        val logger = LoggerReport.GetLogger()
        logger.InfoLog(part, "Returned jsonified stroke with this science report")
        return Json.encodeToString<ScienceReport>(this.result)
    }

}