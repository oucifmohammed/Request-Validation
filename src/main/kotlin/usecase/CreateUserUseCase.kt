package usecase

class CreateUserUseCase {

    operator fun invoke(request: Request): String {
        when(request) {
            is Request.InvalidRequest -> {
                /*  In this case, we need to format an error message and return it.
                *   I will keep it simple and just join the list of Strings
                */
                return request.errors.joinToString(",")
            }
            is Request.ValidRequest -> {
                /*
                *   In this case, we will process the request data like using repository
                *   to call a backend api to create a user account.
                *   I will keep it simple and just return a String containing the request data.
                */

                return "Request data : ${request.fullName}, ${request.age} ${request.password}"
            }
        }
    }
}