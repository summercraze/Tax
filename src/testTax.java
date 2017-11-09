
public class testTax
{
	public static void main(String[] args)
	{
		int [][] taxRate01SingleFiler = 

			{
					{0,27050},
					{27051,65550},
					{65551,136750},
					{136751,297350},
					{297351,Integer.MAX_VALUE}
			};
		int [][] taxRate01MarriedJointly = 
			{
					{0,45200},
					{45201,109250},
					{109251,166500},
					{166501,297350},
					{297351,Integer.MAX_VALUE}
			};
		int [][] taxRate01MarriedSeperately =
			{
					{0,22600},
					{22601,54625},
					{54626,83250},
					{83251,148675},
					{148676,Integer.MAX_VALUE}
			};
		int [][] taxRate01Head =

			{
					{0,36250},
					{36251,93650},
					{93651,151650},
					{151651,297350},
					{297351,Integer.MAX_VALUE}
			};

		double[] rate01 = {15,27.5,30.5,35.5,39.1};
		System.out.println("This is taxable income for 2001:");
		System.out.format("%12s%25s%32s%25s%25s", "Income","Single Filers", 
				" Married Filing Jointly",
				" Married Filing"," Head Of");
		System.out.format("\n%27s%44s%23s%28s", "Tax", 
				"Qualifying Widow(er) Tax",
				"Separately Tax","Household ");
		for(double income = 50000;income <= 60000;income += 1000)
		{
			System.out.format("\n%6s%.2f","$",income);
			Tax single = new Tax(Tax.SINGLE_FILER, taxRate01SingleFiler, rate01, income);
			System.out.format("%11s%.2f","$",single.getTax());
			Tax marriedJoinly = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, taxRate01MarriedJointly, rate01, income);
			System.out.format("%15s%.2f","$",marriedJoinly.getTax());
			Tax marriedSeperately = new Tax(Tax.MARRIED_SEPARATELY, taxRate01MarriedSeperately, rate01, income);
			System.out.format("%25s%.2f","$",marriedSeperately.getTax());
			Tax headOfFamily = new Tax(Tax.HEAD_OF_HOUSEHOLD, taxRate01Head, rate01, income);
			System.out.format("%24s%.2f","$",headOfFamily.getTax());
		};
		int [][] taxRate09SingleFiler = 

			{
					{0,8350},
					{8351,33950},
					{33951,82250},
					{82251,171550},
					{171551,372950},
					{372951,Integer.MAX_VALUE}
			};
		int [][] taxRate09MarriedJointly = 
			{
					{0,16700},
					{16701,67900},
					{67901,137050},
					{137051,208850},
					{208851,372950},
					{372951,Integer.MAX_VALUE}
			};
		int [][] taxRate09MarriedSeperately =
			{
					{0,8350},
					{8351,33950},
					{33951,68525},
					{68526,104425},
					{104426,186475},
					{186476,Integer.MAX_VALUE}
			};
		int [][] taxRate09Head =

			{
					{0,11950},
					{11951,45500},
					{45501,117450},
					{117451,190200},
					{190201,372950},
					{37951,Integer.MAX_VALUE}
			};

		double[] rate09 = {10.0,15.0,25.0,28.0,33.0,35.0};
		System.out.println("\nThis is taxable income for 2009:");
		System.out.format("%12s%25s%32s%25s%25s", "Income","Single Filers", 
				" Married Filing Jointly",
				" Married Filing"," Head Of");
		System.out.format("\n%27s%44s%23s%28s", "Tax", 
				"Qualifying Widow(er) Tax",
				"Separately Tax","Household ");
		for(double income = 50000;income <= 60000;income += 1000)
		{
			System.out.format("\n%6s%.2f","$",income);
			Tax single = new Tax(Tax.SINGLE_FILER, taxRate09SingleFiler, rate09, income);
			System.out.format("%11s%.2f","$",single.getTax());
			Tax marriedJoinly = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, taxRate09MarriedJointly, rate09, income);
			System.out.format("%15s%.2f","$",marriedJoinly.getTax());
			Tax marriedSeperately = new Tax(Tax.MARRIED_SEPARATELY, taxRate09MarriedSeperately, rate09, income);
			System.out.format("%26s%.2f","$",marriedSeperately.getTax());
			Tax headOfFamily = new Tax(Tax.HEAD_OF_HOUSEHOLD, taxRate09Head, rate09, income);
			System.out.format("%24s%.2f","$",headOfFamily.getTax());
		};

	}
}
