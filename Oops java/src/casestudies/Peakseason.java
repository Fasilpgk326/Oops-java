package casestudies;

class Peakseason extends Season
{
    public void peak(int p, int t, double ta, int peakc) 
	{
		
	 int totals=(int) (p*t*ta);
	 int tse=totals*peakc;
	 System.out.printf("Total tarrif:%d",tse);
		
	}

}
