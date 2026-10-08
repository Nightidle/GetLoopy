import java.util.Random;

public class DieRoller
{
    static void main()
    {
        Random rand = new Random();

        int die1, die2, die3, tries;

        die1 = rand.nextInt(6)+1;
        die2 = rand.nextInt(6)+1;
        die3 = rand.nextInt(6)+1;
        tries = 0;


        System.out.printf("%5s\t%5s\t%6s\t%6s\t%6s\n", "tries", "die1", "die2", "die3", "Sum");

        while(die1 != die2 || die2 != die3)
        {
            die1 = rand.nextInt(6)+1;
            die2 = rand.nextInt(6)+1;
            die3 = rand.nextInt(6)+1;
            tries++;
            int sum = die1 + die2 + die3;

            System.out.printf("%5d\t%5d\t%6d\t%6d\t%6d\n", tries, die1, die2, die3, sum);
        }
    }
}
