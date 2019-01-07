package model

import java.time.Instant
import java.util.*

/**
 * Created by Beruto on 27/3/18. Project -> ProductManager
 */
data class AgentBean(val id: Int = 0,
                     val nombre: String = "",
                     val nif: String = "",
                     val direccion: String = "",
                     val poblacion: String = "",
                     val cp: Int = 0,
                     val provincia: String = "",
                     val etiqueta: Int = 0)

data class ClientBean(val idCliente: Int = 0, val cif: String = "", val name: String = "",
                      val cdircli: String = "", val cppobcli: String = "", val province: String = "",
                      val ccodprov: String = "", val cnaccli: String = "", val gasto: Float = 0.0f,
                      val formaContacto: String = "", val contacto: String = "", val fax: String = "",
                      val email: String = "", val serie: String = "", val ccodcli: String = "", val re: Int = 0,
                      val ntipoiva: Int = 0, val tipoFacturacion: String = "", val devuelveEnv: String = "",
                      val fechaAlta: Date = Date.from(Instant.now()),
                      val fechaBaja: Date = Date.from(Instant.now()),
                      val observaciones: String = "", val tcomision: String = "", val pagaenv: Int = 0,
                      val idAgent: Int = 0)

//data class ClientDirBean()