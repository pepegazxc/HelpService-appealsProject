package help.commands.dto.response;

import help.commands.dto.commands.HelpCommandType;
import help.commands.dto.commands.HelpCommands;

public record CommandsResponse(HelpCommandType type, HelpCommands info) {
}
