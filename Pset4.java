class Raffle
public class Student {
    private String name;

    public Student(String name, int raffleNumber) {
        this.name = name;
        this.raffleNumber = raffleNumber;
    }

    public String getName() {
        return name;
    }

    public int getRaffleNumber() {
        return raffleNumber;
    }

   public void chooseWinner() {
        if (winners.size() == students.size()) {
            System.out.println("All students have won.");
            return;
        }
        Student winner;
        do {
            int index = random.nextInt(students.size());
            winner = students.get(index);
        } while (winners.contains(winner));

        winners.add(winner);
        System.out.println("Winner: " + winner.getName() + " with raffle number: " + winner.getRaffleNumber());
    }

     student = new student ("Alexis", 1234);
     student = new student ("Brian Griffin", 2345);
     student = new student ("Carl Johnson", 3456);
     student a = new student ("Danimals", 4567);
     student a = new student ("Einstein", 5678 );
     student a = new student ("Frank Sinatra", 6789 );
     student a = new student ("Greg Heffley", 7890);
     student a = new student ("Hilton", 1942);
     student a = new student ("Integra", 5621);
     student a = new student ("Jenny", 4561);
	 student[] = {Alexis, Brian Griffin, Carl Johnson, Danimals, Einstein, Frank Sinatra, Greg Heffley, Hilton, Integra, Jenny};

	 Raffle raffle = new Raffle(students);

public class Fibonacci {
    private int[] sequence;
    private int correctNumbers;

    public Fibonacci() {
        this.sequence = new int[20];
        this.sequence[0] = 0;
        this.sequence[1] = 1;
        this.correctNumbers = 2; // Initially, only the first two numbers are correct.
    }

    public void updateSequence(int n) {
        if (n > 2 && n <= sequence.length) {
            for (int i = correctNumbers; i < n; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
            correctNumbers = n;
        }
    }

    public void printSequence() {
        System.out.println(Arrays.toString(sequence));
    }
}

}

