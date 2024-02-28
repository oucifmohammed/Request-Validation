package presenter

import usecase.CreateUserUseCase
import usecase.buildRequest

class Presenter(private val createUserUseCase: CreateUserUseCase) {

    fun createUser(
        fullName: String,
        age: Byte,
        password: String
    ): String {
        val request = buildRequest(fullName, age, password)
        return createUserUseCase(request)
    }
}