package org.example.command;

import picocli.CommandLine;

@CommandLine.Command(name="hello",
        version = "1.0.0",
        mixinStandardHelpOptions = true,
        requiredOptionMarker = '*',
        description = "This is a simple CLI Command",
        header = "Sample Command",
        optionListHeading = "%nOptions are:%n")
public class HelloCommand implements Runnable{

//    Este eh um jeto de fazer help, mas usei mixinStandardHelpOptions
//    @CommandLine.Option(names={"-h","--help"}, usageHelp = true)
//    boolean help;

    @CommandLine.Option(names={"-u", "--user"},
            required = true,
            description = "Provide User Name",
            paramLabel = "username")
    String user;

    //Puxei o main para ca
    public static void main( String[] args )
    {
//        Dava para por uma variveil de args no projeto
//        new CommandLine(new HelloCommand()).execute("--user=Stopa");
        new CommandLine(new HelloCommand()).execute("-h");
    }

    @Override
    public void run(){
        if(user == null || user.length() == 0) {
            System.out.println( "Hello World!" );
        } else {
            System.out.println("[hello] Hello " + user);
        }

    }
}
