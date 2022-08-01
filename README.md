# Romans In Decimal Numbers

This is a challenge project builded in Intellij IDEA.

To see this working do a little steps:

1. You can clone this project using "git clone https://github.com/Lucas-VReal/RomansInDecimalNumbers" in your Git Bash Terminal;
2. Open the project with Intellij or Ecclpse IDEA;
3. Run the class in src/main/java/br/com/conversor/action/TestConversor;
4. Inform a Roman number and press Enter;
5. See the result in the console.

About the project:

I used math addition operations to add the simple numbers (Not starting with "I", "X" or "C") see the values of the letters (Strings) and a example:

I = 1;
IV = 4; *
V = 5;
IX = 9; *
X = 10;
XL = 40;
L = 50;
XC = 90;
C = 100;
D = 500;
M = 1000;

Addicion example: X = 10 -> XXX = 10 + 10 + 10 => 30 

I used simple mathematical operations and the switch case flow control in the Converter class, filtering with if and else the numbers starting whith:

- I (Because they can indicate to be the number 4 "IV" or 9 "IX"),
- Also the numbers starting in X (Because they can indicate 40 "XL" or 90 "XC")
- And finally the numbers starting with "C" (because they can indicate 900 "CM"). 
