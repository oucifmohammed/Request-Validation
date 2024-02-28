import presenter.Presenter
import usecase.CreateUserUseCase

fun main(args: Array<String>) {

    val useCase = CreateUserUseCase()

    val presenter = Presenter(useCase)

    val result1 = presenter.createUser("Hello Hello", 15, "123")
    val result2 = presenter.createUser("Hi Hi", 25, "123456")

    println(result1)
    println(result2)
}