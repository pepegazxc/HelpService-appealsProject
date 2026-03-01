package help.commands.store;

import help.commands.dto.commands.HelpCommandType;
import help.commands.dto.commands.HelpCommands;
import help.commands.dto.response.CommandsResponse;
import help.commands.dto.response.CommandsResponseItem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCommands {

    public ResponseEntity<CommandsResponse> userCommands(){
        return ResponseEntity.ok().body(
                new CommandsResponse(
                    List.of(
                        new CommandsResponseItem(
                            HelpCommandType.REGISTRATION,
                            new HelpCommands(
                                   "This link will allow you to register",
                                    "/auth/registration"
                            )
                    ),
                            new CommandsResponseItem(
                                    HelpCommandType.REFRESH_TOKEN,
                                    new HelpCommands(
                                            "This link will allow you to refresh your JWT",
                                            "/auth//token/refresh"
                                    )
                            ),
                            new CommandsResponseItem(
                                    HelpCommandType.WRITE,
                                    new HelpCommands(
                                            "This link will allow you to write an appeal",
                                            "/appeal/write"
                                    )
                            )
                    )

                )
        );
    }
}
