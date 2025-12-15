package help.controller;

import help.commands.HelpCommandType;
import help.commands.HelpCommands;
import help.commands.dto.User;
import help.commands.store.InfoCommands;
import help.commands.store.UserCommands;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping
public class HelpController {

    private final InfoCommands store;
    private final UserCommands user;

    public HelpController(InfoCommands store, UserCommands user) {
        this.store = store;
        this.user = user;
    }

    @GetMapping("/info")
    public HelpCommands info() {
        return store.getInfo(HelpCommandType.INFO);
    }

    @GetMapping("/userCommands")
    public Collection<HelpCommands> registration() {
            return user.getAll();
    }
}
