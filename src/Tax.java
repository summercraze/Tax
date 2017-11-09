
public class Tax 
{
  public final static int SINGLE_FILER = 0;
  public final static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
  public final static int MARRIED_SEPARATELY = 2;
  public final static int HEAD_OF_HOUSEHOLD = 3;
  
  private int filingStatus;
  private int[][] brackets;
  private double[] rates;
  private double taxableIncome,taxPaid;
  
  Tax(int filingStatus, int[][] brackets, double[] rates , double taxableIncome)
  {
	  this.filingStatus = filingStatus;
	  this.brackets = brackets;
	  this.rates = rates;
	  this.taxableIncome = taxableIncome;
  }
  Tax()
  {
	 
	 
  }
  
  public void setFilingStatus(int filingStatus)
  {
	  this.filingStatus = filingStatus;
  }
  public void setBrackets(int[][] brackets)
  {
	  this.brackets = brackets;
  }
  public void setRates(double[] rates)
  {
	  this.rates = rates;
  }
  public void setTaxableIncome(double income)
  {
	  this.taxableIncome = income;
  }
  
  public int getFilingStatus()
  {
	  return this.filingStatus;
  }
  public int[][] getBrackets()
  {
	 return this.brackets;
  }
  public double[] getRates()
  {
	  return this.rates;
  }
  public double getTaxableIncome()
  {
	  return this.taxableIncome;
  }
  
  public double getTax()
  {
	  for(int row = 0;row < this.brackets.length;row++)
	  {
		  for(int column = 0;column < this.brackets[row].length;column++)
		  {
			  if(this.taxableIncome <= this.brackets[row][column])
			  {

				  this.taxPaid = (this.rates[row]/100)*this.taxableIncome;
				  return taxPaid; 
			  }
		  }
	  }
	  return taxPaid;
  }
}

