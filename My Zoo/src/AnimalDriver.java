
public class AnimalDriver
	{

		public static void main(String[] args)
			{
				Animal[] zoo = new Animal[7];
				zoo[0] = new Tiger();
				zoo[1] = new Buffalo();
				zoo[2] = new Wolf();
				zoo[3] = new Crocodile();
				zoo[4] = new Snake();
				zoo[5] = new Shark();
				zoo[6] = new GoliathGrouper();

				for (Animal z : zoo)
					{
						z.bearYoung();
						z.showThreat();
						z.sleepTime();
						z.eat();

						System.out.println();
					}
			}

	}
