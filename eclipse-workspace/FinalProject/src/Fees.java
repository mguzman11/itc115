
public class Fees extends Library{

	public Fees(int daysPastDue) {
		if (daysPastDue>0) {
				Fees= .5*daysPastDue;
			}
			
			else {
				Fees=0;
			}
		}
}