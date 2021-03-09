import java.text.DecimalFormat;

public class Decimal {
public static void main(String[] args) {
	double d=63.298239;
	DecimalFormat df=new DecimalFormat("0.00");
	System.out.println(df.format(d));
}
}
