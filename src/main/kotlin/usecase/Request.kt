package usecase

sealed interface Request {
    data class InvalidRequest(val errors: List<String>): Request
    data class ValidRequest(
        val fullName: String,
        val age: Byte,
        val password: String
    ): Request
}

fun buildRequest(fullName: String, age: Byte, password: String): Request {
    val errorsList = mutableListOf<String>()

    if(age < 20) {
      errorsList.add("User age must be above 20")
    }

    if(password.length < 5) {
        errorsList.add("Minimum password length is 5")
    }

    return if(errorsList.size > 0) {
        Request.InvalidRequest(errorsList)
    } else {
        Request.ValidRequest(fullName, age, password)
    }
}