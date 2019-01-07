package exceptions

/**
 * Created by Albert Sendros on 06/01/2019. Project -> ProductManager Package exceptions
 */
class DuplicatedAgentException(string: String) : Exception("The agent $string is duplicated")
class DuplicatedClientException(string: String) : Exception("The client $string is duplicated")