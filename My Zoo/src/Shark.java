
public class Shark extends SharkFish
	{

		@Override
		public void showThreat()
			{
				System.out
						.println("The " + name + " threatens by opening its mouth wide and showing all of its teeth.");
			}

		@Override
		public void sleepTime()
			{
				System.out.println("The " + name + " likes to hunt at day and night, depending on the species.");
			}

		public Shark()
			{
				name = "Shark";
				food = "Seals";
			}

	}
