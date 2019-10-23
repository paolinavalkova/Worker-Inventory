import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose object type:");
		System.out.println("1 - cloth");
		System.out.println("2 - worker");
		int t = scan.nextInt();
		scan.nextLine();

		if (t == 1) {

			Cloth c1 = createCloth(scan, 1);
			
			System.out.println();
			
			Cloth c2 = createCloth(scan, 2);

			System.out.println("Are cloth sizes the same: " + new SizeableComparator<Cloth>().areSame(c1, c2));
		} else if (t == 2) {

			Worker w1 = createWorker(scan, 1);
			
			System.out.println();
			
			Worker w2 = createWorker(scan, 2);

			System.out.println("Are worker's clothing size the same: " + new SizeableComparator<Worker>().areSame(w1, w2));
		}

		scan.close();
	}

	private static Cloth createCloth(Scanner scan, int clothNum) {
		
		System.out.println("Cloth " + clothNum);

		System.out.println("model:");
		String m = scan.nextLine();
		System.out.println("size:");
		String s = scan.nextLine();
		System.out.println("price:");
		int p = scan.nextInt();
		scan.nextLine();

		return new Cloth(m, s, p);
	}

	private static Worker createWorker(Scanner scan, int workerNum) {

		System.out.println("Worker " + workerNum);

		System.out.println("name:");
		String n = scan.nextLine();

		System.out.println("clothing size:");
		String cs = scan.nextLine();

		System.out.println("salary:");
		int s = scan.nextInt();
		scan.nextLine();

		return new Worker(cs, n, s);
	}

}
