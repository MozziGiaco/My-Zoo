
public class Crocodile extends Reptile
	{

		@Override
		public void showThreat()
			{
				System.out.println("The " + name + " threatens by slamming its mouth shut and hissing.");
			}

		public Crocodile()
			{
				name = "Crocodile";
				food = "Antelope";
			}

		@Override
		public void sleepTime()
			{
				System.out.println("The " + name + " primarily hunt at night, meaning they are nocturnal.");
			}

	}
 