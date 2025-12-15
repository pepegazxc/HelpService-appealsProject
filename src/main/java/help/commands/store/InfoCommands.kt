package help.commands.store

import help.commands.HelpCommandType
import help.commands.HelpCommands
import org.springframework.stereotype.Component

@Component
class InfoCommands {
    private val commands: Map<HelpCommandType, HelpCommands> = mapOf(
        HelpCommandType.INFO to HelpCommands(
            description = "You are in the help service! Those commands will allow you to watch list of commands",
            command = "/--user-commands"
        )
    )

    fun getInfo() = commands
}