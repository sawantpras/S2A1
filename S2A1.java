public class S2A1 { 				//class declaration
	static int num=5;
	public static void main (String[] arg){
    drawCross(num);  // method call by passing value
}

private static void drawCross(int num) {
int startCur = 0;  				// variable declarations
int endCur = num-1; 
for (int i = 0; i < num; i++) {  	// nested for loop
	for (int j = 0; j < num; j++) 
	{ 
		if (startCur == endCur && j == i)  // condition checking
		System.out.print('X'); 
		else if (startCur == j || endCur == j) 
		System.out.print('X'); 
	else if (startCur > j || endCur > j)
		System.out.print('_'); 
		else 
		System.out.print(' '); 
	} 
	startCur++; 
	endCur--; 
	System.out.println(); 
	} 
}
}