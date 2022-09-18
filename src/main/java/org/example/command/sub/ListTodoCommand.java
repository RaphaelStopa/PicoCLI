package org.example.command.sub;

import picocli.CommandLine;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Callable;


@CommandLine.Command(name="list",
        aliases = {"ls", "show"},
        version = "1.0.0",
        mixinStandardHelpOptions = true,
        requiredOptionMarker = '*',
        description = "This is a Sub Command and lists all the tasks as per the parameters",
        header = "Add Todo SubCommand",
        optionListHeading = "%nOptions are:%n",
        footerHeading = "%nCopyright",
        footer = "%nDeveloped by Stopa")
public class ListTodoCommand implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        System.out.println("[List] Listing tasks: ");

        return 0;
    }
}
