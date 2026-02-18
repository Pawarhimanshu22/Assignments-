package Singleton_Design_Pattern.Way_to_Break;

public class Computer {
private static Computer computer = new Computer();
// Not Threat Safe
public static Computer getInstanceOfComputer()
{
    return computer;
}
}
