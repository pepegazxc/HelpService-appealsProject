package help.commands.store

import help.commands.HelpCommandType
import help.commands.HelpCommands
import org.springframework.stereotype.Component

@Component
class UserCommands {
    private val commands: Map<HelpCommandType, HelpCommands> = mapOf(
        HelpCommandType.REGISTRATION to HelpCommands(
            description = "This command will allow you to register yourself, or register your new account",
            command = "/register",
        ),
        HelpCommandType.CHOOSECITY to HelpCommands(
            description = "This command will allow you to select a city if your registered in the application",
            command = "/chooseCity"
        ),
        HelpCommandType.WRITEAPPEAL to HelpCommands(
            description = "This command will allow you to write an appeal if you have selected your city",
            command = "/writeAppeal"
        )
    )

    fun getAll() = commands
}