

public class Date implements Comparable {
	int month;
	int day;
	int year;

Date(int m,int d, int y) {
	this.month = m;
	this.day= d;
	this.year = y;
	
	}

public int compareTo(Object date) {

	Date update = (Date) date;

	if( this.year > update.year) {
	return 1;
	} 

	else if (this.year < update.year) {
	return -1;
	}

	else if (this.month > update.month) {
		return 1;
	}


	else if (this.month < update.month) {
	return -1;
	
	}

	else if (this.day > update.day) {
	return 1;
	}

	else if (this.day < update.day) {
	return -1;
	
	}

	else {
	return 0; 
	}

}

// prints the date by month,date, and year
public String toString() {
	
	return "" + this.month + "/" + this.day + "/" + this.year;
	}
}