package org.example.command.autocomplete;

import picocli.CommandLine;

import java.util.concurrent.Callable;

//https://www.youtube.com/watch?v=tCrQqgOYszQ
//
@CommandLine.Command(
        name="userinfo",
        description = "prints user info",
        mixinStandardHelpOptions = true,
        version = "1.0.0"
)
public class Autocomplete implements Callable<Integer> {

    @CommandLine.Option(names = { "-n", "--name"}, description = "name of user", required = true)
    private String name;

    @CommandLine.Option(names = { "-c", "--caps"}, description = "capitalize username", required = false)
    private boolean caps;

    @CommandLine.Option(names = { "-a", "--age"}, description = "age of user")
    private int age;

    @CommandLine.Option(names = { "-p", "--pass"}, description = "passord of user")
    private String password;

    public static void main(String[] args) {
        new CommandLine(new Autocomplete()).execute(args);
    }

    public Integer call() throws Exception{
        System.out.println("your name is " + (this.caps ? this.name.toUpperCase() : this.name));
        System.out.println("your age is " + this.age);
        System.out.println("your password is " + this.password);
        return 0;
    }
}
