package org.example.command.sub;

import picocli.CommandLine;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Callable;


@CommandLine.Command(name="add",
        aliases = {"create", "plus"},
        version = "1.0.0",
        mixinStandardHelpOptions = true,
        requiredOptionMarker = '*',
        description = "This is a Sub Command to 'todo' and adds the task to the list",
        header = "Add Todo SubCommand",
        optionListHeading = "%nOptions are:%n",
        footerHeading = "%nCopyright",
        footer = "%nDeveloped by Stopa")
public class AddTodoCommand implements Callable<Integer> {

    @CommandLine.Option(names={"-m", "--message"},
            required = true,
            description = "a Todo Note or a Message")
    String[] message;


    @CommandLine.Option(
            names={"--create-date"},
            required = false,
            description = "Created data for the Todo[s]")
    Date createdDate;

    @Override
    public Integer call() throws Exception {

        System.out.println("[add] Add Message: ");
        System.out.println("createdData = " + createdDate);
        Arrays.asList(message).forEach(System.out::println);

        return 0;
    }
}
