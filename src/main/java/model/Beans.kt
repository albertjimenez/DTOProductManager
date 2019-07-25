package model

import org.joda.time.DateTime

/**
 * Created by Beruto on 27/3/18. Project -> ProductManager
 */
data class AgentBean(val id: Int = 0,
                     val nombre: String? = "",
                     val nif: String? = "",
                     val direccion: String? = "",
                     val poblacion: String? = "",
                     val cp: String? = "",
                     val provincia: String? = "",
                     val etiqueta: Int? = 0)

data class ClientBean(val idCliente: Int = 0, val cif: String? = "", val nombre: String? = "",
                      val cdircli: String? = "", val cppobcli: String? = "", val provincia: String? = "",
                      val ccodprov: String? = "", val cnaccli: String? = "", val gasto: Float? = 0.0f,
                      val formaContacto: String? = "", val contacto: String? = "", val fax: String? = "",
                      val email: String? = "", val serie: String? = "", val ccodcli: String? = "", val re: Boolean? = false,
                      val ntipoiva: Int? = 0, val tipoFacturacion: String? = "", val devuelveEnv: Boolean? = false,
                      val fechaAlta: DateTime? = DateTime.now(),
                      val fechaBaja: DateTime? = DateTime.now(),
                      val observaciones: String? = "", val tcomision: String? = "", val pagaenv: Boolean? = true,
                      val idAgente: Int? = 0)

data class ClientDirBean(val idDir: Int = 0, val idCliente: Int = 0, val alias: String? = "",
                         val direccion: String? = "", val poblacion: String? = "", val cp: String? = "",
                         val provincia: String? = "", val gasto: Float? = 0f, val etiqueta: Int? = 0,
                         val email: String? = "", val telefono: String? = "", val portes: Float? = 0f,
                         val idTransportista: Int? = 0, val porDefecto: Boolean? = false)

data class CofradiaBean(val idCofradia: Int = 0, val poblacion: String? = "", val direccion: String? = "",
                        val ciudad: String? = "", val provincia: String? = "", val nrs: String? = "", val cp: String? = "",
                        val cif: String? = "", val gastoSubasta: Float? = 0f, val gastoKg: Float? = 0f,
                        val gastoCaja: Float? = 0f, val gastoVenta: Float? = 0f, val porteIncluido: Boolean? = false,
                        val idZona: Int? = 0)

data class CompraBean(val idCompra: Int = 0, val fecha: DateTime? = DateTime.now(), val idCofradia: Int = 0,
                      val salb: String? = "", val gastoSubasta: Float? = 0f, val idZona: Int? = 0,
                      val porteIncluido: Boolean? = false)

data class FamiliaBean(val idFamilia: String = "", val familia: String? = "", val cientifico: String? = "",
                       val fao: String? = "", val tipoIva: String? = "", val etiqueta: Int? = 0,
                       val precioDefecto: Float? = 0f, val idArte: Int? = 0)


data class LineaCompraBean(val linCompra: Int = 0, val idCompra: Int = 0, val idPescado: Int = 0,
                           val kilos: Float? = 0f, val precio: Float? = 0f, val importe: Float? = 0f,
                           val idBarco: Int? = 0, val lote: String? = "", val cajas: String? = "",
                           val suFao: String? = "", val suLote: String? = "", val suDescripcion: String? = "",
                           val cifBuque: String? = "", val nombreBuque: String? = "", val idFamilia: String? = "",
                           val calibre: Int? = 0, val calidad: Int? = 0, val tipoCaja: String? = "",
                           val gasto: String? = "", val kgUd: Int? = 0, val idArte: Int? = 0)

data class LineaPedidoBean(val linPedido: Int = 0, val idPedido: Int = 0, val fecha: DateTime? = DateTime.now(),
                           val cantidad: Float? = 0f, val idFamilia: String? = "", val calibre: Int? = 0, val calidad: Int? = 0,
                           val precio: Float? = 0f, val concepto: String? = "", val kilos: Float? = 0f)

data class PedidoBean(val idPedido: Int = 0, val fecha: DateTime = DateTime.now(), val idComprador: String? = "",
                      val idVenta: Int? = 0,
                      val estado: String? = "", val portes: Float? = 0f, val idTransportista: Int? = 0)

data class TarifaPortesBean(val idTransportista: Int = 0, val idDir: Int = 0, val tarifa: Float? = 0f)

data class TipoCajaBean(val idCaja: String = "", val descripcion: String? = "", val kgUd: Float? = 0f, val gasto: Float? = 0f)

data class TransportistaBean(val idTransportista: Int = 0, val nombre: String? = "", val cif: String? = "", val direccion: String? = "",
                             val poblacion: String? = "", val provincia: String? = "", val cp: String? = "", val perContacto: String? = "",
                             val telefono: String? = "", val email: String? = "")

data class PartyMongoBean(val idPartida: Int = 0, val dateTime: String, val linCompra: Int = 0, val idCompra: Int = 0, val idPescado: Int? = 0,
                          val kilos: Float? = 0f, val precio: Float? = 0f, val importe: Float? = 0f,
                          val idBarco: Int? = 0, val lote: String? = "", val cajas: String? = "",
                          val suFao: String? = "", val suLote: String? = "", val suDescripcion: String? = "",
                          val cifBuque: String? = "", val nombreBuque: String? = "", val idFamilia: String? = "",
                          val calibre: Int? = 0, var calidad: Int? = 0, val tipoCaja: String? = "",
                          val gasto: String? = "", val kgUd: Int? = 0, val idArte: Int? = 0) {
    fun changeParty(party: Int) {
        this.calidad = party
    }
}