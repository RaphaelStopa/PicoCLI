package org.example.command.color;

public class Color {

    // Text color examples (0, 39)
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    // Background (40, 49)
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

// Font Effects
// Code /	Effect /	Note
//0 /	Reset / Normal	/all attributes off
//1 /	Bold or increased intensity
//2 /	Faint / (decreased intensity)	Not widely supported.
//3 /	Italic	/ Not widely supported. Sometimes treated as inverse.
//4 /	Underline
//5 /	Slow Blink /	less than 150 per minute
//6 /	Rapid Blink /	MS-DOS ANSI.SYS; 150+ per minute; not widely supported
//7	/ [[reverse video]] /	swap foreground and background colors
//8	/ Conceal /	Not widely supported.
//9 /	Crossed-out /	Characters legible, but marked for deletion. Not widely supported.
//10 / Primary(default) / font
//11–19 /	Alternate font /	Select alternate font n-10
//20 /	Fraktur /	hardly ever supported
//21 /	Bold off or Double Underline /	Bold off not widely supported; double underline hardly ever supported.
//22 /	Normal color or intensity /	Neither bold nor faint
//23 /	Not italic, not Fraktur
//24 /	Underline off /	Not singly or doubly underlined
//25 /	Blink off
//27 /	Inverse off
//28 /	Reveal /	conceal off
//29 /	Not crossed out
//30–37 /	Set foreground color /	See color table below
//38 /	Set foreground color /	Next arguments are 5;<n> or 2;<r>;<g>;<b>, see below
//39 /	Default foreground color /	implementation defined (according to standard)
//40–47 /	Set background color /	See color table below
//48 /	Set background color /	Next arguments are 5;<n> or 2;<r>;<g>;<b>, see below
//49 /	Default background color /	implementation defined (according to standard)
//51 /	Framed
//52 /	Encircled
//53 /	Overlined
//54 /	Not framed or encircled
//55 /	Not overlined
//60 /	ideogram underline /	hardly ever supported
//61 /	ideogram double underline /	hardly ever supported
//62 /	ideogram overline /	hardly ever supported
//63 /	ideogram double overline /	hardly ever supported
//64 /	ideogram stress marking /	hardly ever supported
//65 /	ideogram attributes off /	reset the effects of all of 60-64
//90–97 /	Set bright foreground color /	aixterm (not in standard)
//100–107	Set bright background color /	aixterm (not in standard)

    public static void main(String[] args) {

        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
        System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);

    }
}
