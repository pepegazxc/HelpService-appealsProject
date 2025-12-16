package help.commands.store

import help.commands.HelpCommandType
import help.commands.HelpCommands
import org.springframework.stereotype.Component

@Component
class UserCommands {
    private val commands: Map<HelpCommandType, HelpCommands> = mapOf(
        HelpCommandType.REGISTRATION to HelpCommands(
            description = "This command will allow you to register yourself, or register your new account",
            command = "--register",
        ),
        HelpCommandType.CHOOSE_CITY to HelpCommands(
            description = "This command will allow you to select a city if your registered in the application",
            command = "--choose-city"
        ),
        HelpCommandType.WRITE_APPEAL to HelpCommands(
            description = "This command will allow you to write an appeal if you have selected your city",
            command = "--write-appeal"
        ),
        HelpCommandType.CHANGE_INFO to HelpCommands(
            description = "This command will allow you to change information in your profile",
            command = "--change-info"
        )
    )

    fun getAll() = commands
}