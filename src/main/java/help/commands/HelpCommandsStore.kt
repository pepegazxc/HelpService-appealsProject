package help.commands

import org.springframework.stereotype.Component

@Component
class HelpCommandsStore {
    private val commands: Map<HelpCommandType, HelpCommands> = mapOf(
        HelpCommandType.INFO to HelpCommands(
            type = HelpCommandType.INFO,
            description = "You are in the help service! This command will allow you to watch list of commands",
            command = "/commands"
        ),
        HelpCommandType.CHOOSECITY to HelpCommands(
            type = HelpCommandType.CHOOSECITY,
            description = "This command will allow you to select a city if your registered in the application",
            command = "/chooseCity"
        ),
        HelpCommandType.WRITEAPPEAL to HelpCommands(
            type = HelpCommandType.WRITEAPPEAL,
            description = "This command will allow you to write an appeal if you have selected your city",
            command = "/writeAppeal"
        )
    )

    fun getInfo(command: HelpCommandType) = commands[command]
}