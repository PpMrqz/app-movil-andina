package com.corsinf.app_movil_andina.data

data class Usuario(
    val id: Int,
    val nombres: String,
    val apellidos: String,
    val email: String,
    val ruc: String,
    val contrasena: String = "",
    var foto_url: String = "",

)