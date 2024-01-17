package org.example.Classes.Builders

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.example.Classes.Reports.ScienceReport

@Serializable
class ScienceReportBuilder : ReportBuilder {
    private val result = ScienceReport()
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

    fun setFieldOfStudy(fieldOfStudy: String){
        result.fieldOfStudy = fieldOfStudy
    }

    fun setTypeOfResearch(typeofResearch: String){
        result.typeOfResearch = typeofResearch
    }

    fun getResult(): ScienceReport{
        return this.result
    }

    override fun getJSONResult(): String{
        return Json.encodeToString<ScienceReport>(this.result)
    }

}