import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.*;

public class SayingHello
{
    public static void main(String[] args)
    {
        out.println("What is your name?");
        try(Scanner scanner = new Scanner(in))
        {
            String name = scanner.nextLine();
            String greeting = format("Hello, %s, nice to meet you!", name);
            out.println(greeting);
        }
    }
}
