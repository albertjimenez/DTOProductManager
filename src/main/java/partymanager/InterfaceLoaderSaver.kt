package partymanager

import model.LineaCompraBean

/**
 * Created by Albert Sendros on 2019-07-05. Project -> dtosproductmanager Package partymanager
 */
interface InterfaceLoaderSaver {
    /**
     * Interface Loader Saver for managing the Parties Fragment number 2.
     */
    val mapParties: MutableMap<Int, MutableList<LineaCompraBean>>
        get() = HashMap()

    /**
     * Loads the model into the Android Persistence
     * @return the entire model
     */
    fun loadModel(): Map<Int, List<LineaCompraBean>>

    /**
     * Saves the model into the Android Persistence
     */
    fun saveModel()

    /**
     * The list of parties, Int numbers
     * @return The list of parties
     */
    fun getParties(): List<Int> = this.mapParties.keys.toList()

    /**
     * The amount of parties
     * @return Number of parties
     */
    fun numberOfParties(): Int = this.mapParties.size

    /**
     * Get the list of lines if any by giving the number of party
     * @param party the integer or index of the party
     * @return an optional List of lines
     */
    fun getLinesByParty(party: Int): List<LineaCompraBean>? = mapParties[party]

    /**
     * Clear and removes the entire model
     */
    fun clearModel() {
        mapParties.clear()
        saveModel()
    }

    /**
     * Adds a new line into the model and save it
     * @param party the integer or index of the party
     * @param lineaCompraBean vararg of amount of lines
     */
    fun addNewLines(party: Int, vararg lineaCompraBean: LineaCompraBean) {
        for (l in lineaCompraBean) {
            if (party in mapParties)
                mapParties[party]?.add(l)
            else
                mapParties[party] = mutableListOf(l)
        }
        saveModel()
    }

    /**
     * Removes a new line into the model and save it
     * @param party the integer or index of the party
     * @param lineaCompraBean vararg of amount of lines
     */
    fun removeLineByParty(party: Int, lineaCompraBean: LineaCompraBean) {
        val list: MutableList<LineaCompraBean>? = mapParties[party]
        list?.let {
            if (lineaCompraBean in list)
                mapParties[party] = list.filter { it != lineaCompraBean }.toMutableList()
            saveModel()
        }
    }

}
