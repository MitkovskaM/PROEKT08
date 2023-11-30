package zadaca13;
import java.util.Scanner;
public class zadacasize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Vnesi broevi:");
int size= scanner.nextInt();
int[] n= new int[size];
for (int i=0; i<size; i++) {
	n[i]=scanner.nextInt(); }
int min=n[0];
for (int i=1; i<size; i++) {
	if(n[i]<min) {
		min=n[i];	
	}
}
System.out.print(min);
	}

}
