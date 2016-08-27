/**
 * Chart 工厂
 * Author: markliu
 * Time  : 16-8-27 下午9:33
 */
public class ChartFactory {

	public static Chart getChart(String type) {
		Chart chart;
		if (type.equalsIgnoreCase("line")) {
			chart = new LineChart();
		} else {
			chart = new PieChart();
		}
		return chart;
	}
}
