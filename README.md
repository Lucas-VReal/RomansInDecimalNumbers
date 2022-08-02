# Romans In Decimal Numbers

This is a challenge project builded in Intellij IDEA.

To see this working do a little steps in your Git Bash Terminal:

1. You can clone this project using "git clone https://github.com/Lucas-VReal/RomansInDecimalNumbers";
2. use the comand "cd" to go in the project local file and use "cd Convert-Romans";
3. use comand "mvn clean install" to create the jar executable file;
4. use the comand "cd target" to access the local of your jar file;
5. use the comand "java -jar Converter-Romanos-1.jar";
6. Inform a Roman number and press Enter;
7. See the result in the console.

About the project:

I have used math addition operations to add the simple numbers and see the values of the letters (Strings) as a result. Look a example next:

I = 1;
*IV = 4;
V = 5;
*IX = 9;
X = 10;
XL = 40;
L = 50;
XC = 90;
C = 100;
D = 500;
M = 1000;

Addicion example: X = 10 -> XXX = 10 + 10 + 10 => 30

Obs: The numbers starting with "I", "X" or "C" have to take more attention, see the explanation about why in the next topic.

I used simple mathematical operations and the switch case flow control in the Converter class, filtering with if and else the numbers starting whith:

- I (Because they can indicate to be the number 4 "IV" or 9 "IX"),
- Also the numbers starting in X (Because they can indicate 40 "XL" or 90 "XC")
- And finally the numbers starting with "C" (because they can indicate 900 "CM"). 
