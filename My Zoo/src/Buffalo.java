
public class Buffalo extends Mammal
	{

		@Override
		public void showThreat()
			{
				System.out.println("The " + name + " threatens by stomping the ground and charging.");
			}

		public Buffalo()
			{
				name = "Buffalo";
				food = "Grass";
			}

		@Override
		public void sleepTime()
			{
				System.out.println("The " + name
						+ " are active at both night and day, meaning they are both diurnal and nocturnal.");
			}

	} 
