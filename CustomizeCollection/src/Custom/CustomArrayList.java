package Custom;

import java.util.ArrayList;

public class CustomArrayList {
	int size = 5;

	class Product {
		int pid;
		String pname;
		char pavail;
		double pprice;
		float prating;

		public Product(int pid, String pname, char pavail, double pprice, float prating) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pavail = pavail;
			this.pprice = pprice;
			this.prating = prating;
		}

	}

	public static void main(String[] args) {
		int pid[] = { 15464, 78452, 14526, 6358, 78569 };
		String pname[] = { "Samsung f3", "iphone14", "Hp Laptop", "SonyDSLR", "oneplus nord" };
		char pavail[] = { 'Y', 'Y', 'N', 'Y', 'N' };
		double pprice[] = { 99925, 150000, 78000, 90000, 55000 };
		float prating[] = { 1.6f, 1.7f, 1.5f, 1.3f, 1.4f };
		CustomArrayList ca = new CustomArrayList();
		ca.addElements(pid, pname, pavail, pprice, prating);

	}

	public void addElements(int[] pid, String[] pname, char[] pavail, double[] pprice, float[] prating) {

		ArrayList<Product> al = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			al.add(new Product(pid[i], pname[i], pavail[i], pprice[i], prating[i]));
		}
		displayElements(al);
	}

	public void displayElements(ArrayList<Product> al) {
		System.out.println(
				"product id " + "\t product name " + "\t product availibility " + "\t product price " + "\t product rating ");
		System.out.println("--------------------------------------------------------------------------------------");

		for (int i = 0; i < size; i++) {
			Product pr = al.get(i);
			System.out.println(pr.pid + "\t\t " + pr.pname + "\t " + pr.pavail + "\t\t\t " + pr.pprice +"\t " + pr.prating + "\t ");
		}

	}

}
