package com.ficagna.tcc2.ui.model

data class Group(
    var nameGroup: String,
    var nameCoordenador: String,
    var localReuniao: String,
    var diaReuniao: String,
    var hora: String,
    val img: String
) {

    constructor() : this("", "", "", "", "", "")
}
