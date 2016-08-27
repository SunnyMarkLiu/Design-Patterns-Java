/**
 * Author: markliu
 * Time  : 16-8-27 下午9:35
 */
public class ClientTest {

	public static void main(String[] args) {
		Chart lineChart = ChartFactory.getChart("line");
		Chart pieChart = ChartFactory.getChart("pie");
		lineChart.display();
		pieChart.display();
	}
}
