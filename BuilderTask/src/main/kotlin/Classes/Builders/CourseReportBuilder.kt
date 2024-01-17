package org.example.Classes.Builders

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.example.Classes.Reports.CourseReport
import org.example.Classes.Reports.ScienceReport

class CourseReportBuilder : ReportBuilder {
    private val result = CourseReport()
    override fun reset() {
        result.reportString = ""
        result.header = ""
        result.name = ""
        result.task = ""
        result.executor = ""
        result.scientificAdviser = ""
        result.listOfSesources = ""
        result.annotation = ""
    }

    override fun setName(name: String) {
        result.name = name
    }

    override fun setTask(task: String) {
        result.task = task
    }

    override fun setAnnotation(annotation: String) {
        result.annotation = annotation
    }

    override fun setHeader(header: String) {
        result.header = header
    }

    override fun setReportString(reportString: String) {
        result.reportString = reportString
    }

    override fun setListOfSources(listOfSources: String) {
        result.listOfSesources = listOfSources
    }

    override fun getJSONResult(): String{
        return Json.encodeToString<CourseReport>(this.result)
    }

    fun setScientificAdviser(scientificAdviser: String){
        result.scientificAdviser = scientificAdviser
    }

    fun setExecutor(executor: String){
        result.executor = executor
    }
}