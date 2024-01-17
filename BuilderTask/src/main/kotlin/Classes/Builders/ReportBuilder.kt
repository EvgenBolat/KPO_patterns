package org.example.Classes.Builders

interface ReportBuilder {
    fun reset()
    fun setName(name: String)
    fun setTask(task: String)
    fun setAnnotation(annotation: String)
    fun setHeader(header: String)
    fun setReportString(reportString: String)
    fun setListOfSources(listOfSources: String)
    fun getJSONResult(): String
}