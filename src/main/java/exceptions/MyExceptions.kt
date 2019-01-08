package exceptions

/**
 * Created by Albert Sendros on 06/01/2019. Project -> ProductManager Package exceptions
 */
// Duplication Exceptions
class DuplicatedAgentException(string: String) : Exception("The agent $string is duplicated")

class DuplicatedClientException(string: String) : Exception("The client $string is duplicated")

// Format Exceptions
class StringTooLongException(attribute: String, numCharacters: Int = 30) :
        Exception("The attribute $attribute exceed the limit of $numCharacters characters")

