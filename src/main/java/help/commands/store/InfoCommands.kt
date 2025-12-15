package help.commands.store

import help.commands.HelpCommandType
import help.commands.HelpCommands
import org.springframework.stereotype.Component

@Component
class InfoCommands {
    private val commands: Map<HelpCommandType, HelpCommands> = mapOf(
        HelpCommandType.INFO to HelpCommands(
            type = HelpCommandType.INFO,
            description = "You are in the help service! This command will allow you to watch list of commands",
            command = "/commands"
        )
    )

    fun getInfo(command: HelpCommandType) = commands[command]
}