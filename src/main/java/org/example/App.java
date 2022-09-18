package org.example;

import org.example.command.HelloCommand;
import picocli.CommandLine;


public class App 
{
    public static void main( String[] args )
    {
        new CommandLine(new HelloCommand()).execute("--user=Stopa");
        new CommandLine(new HelloCommand()).execute("-h");
    }
}

