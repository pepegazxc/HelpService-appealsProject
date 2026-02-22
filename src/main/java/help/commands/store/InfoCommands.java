package help.commands.store;

import help.commands.dto.commands.HelpCommandType;
import help.commands.dto.commands.HelpCommands;
import help.commands.dto.response.CommandsResponse;
import help.commands.dto.response.CommandsResponseItem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InfoCommands {

    public ResponseEntity<CommandsResponse> getInfo(){
        return commands();
    }

    private ResponseEntity<CommandsResponse> commands(){
        return ResponseEntity.ok().body(new CommandsResponse(
                List.of(
                        new CommandsResponseItem(
                HelpCommandType.INFO,
                new HelpCommands(
                        "You are in the help service! Those commands will allow you to watch list of commands",
                        "user -commands <- will show you commands for your account"
                )
                )
                )
        ));
    }
}
