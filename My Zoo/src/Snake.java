
public class Snake extends Reptile
	{

		@Override
		public void showThreat()
			{
				System.out.println("The " + name + " threatens by hissing and puffing its body to look bigger.");
			}

		public Snake()
			{
				name = "Snake";
				food = "Mice";
			}

		@Override
		public void sleepTime()
			{
				System.out.println("The " + name
						+ " can be active at day or night, depending on the temperature, meaning they are both diurnal and nocturnal.");
			}

	}
 