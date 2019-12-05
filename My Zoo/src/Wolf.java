
public class Wolf extends Mammal
	{

		@Override
		public void showThreat()
			{
				System.out.println("The " + name + " threatens by showing its teeth and growling, like the Tiger.");
			}

		public Wolf()
			{
				name = "Wolf";
				food = "Caribou";
			}

		@Override
		public void sleepTime()
			{
				System.out.println("The " + name + " likes to sleep during the day, meaning it is nocturnal.");
			}

	}
