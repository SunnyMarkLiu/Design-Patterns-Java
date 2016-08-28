import shallow_clone.Attachment;
import shallow_clone.WeeklyLog;

/**
 * Author: markliu
 * Time  : 16-8-28 下午1:21
 */
public class ClientTest {

	public static void main(String[] args) {
		deepCloneTest();
	}

	public static void deepCloneTest() {
		deep_clone.WeeklyLog weeklyLog = new deep_clone.WeeklyLog();
		deep_clone.Attachment attachment = new deep_clone.Attachment();
		weeklyLog.setAttachment(attachment);

		// 调用克隆方法克隆新的对象
		deep_clone.WeeklyLog newWeeklyLog = weeklyLog.deepClone();

		// false
		System.out.println("newWeeklyLog == weeklyLog ? " + (newWeeklyLog == weeklyLog));
		// true
		System.out.println("newAttachment == attachment ? " +
				(newWeeklyLog.getAttachment() == weeklyLog.getAttachment()));
	}

	public static void shallowCloneTest() {
		WeeklyLog weeklyLog = new WeeklyLog();
		Attachment attachment = new Attachment();
		weeklyLog.setAttachment(attachment);

		// 调用克隆方法克隆新的对象
		WeeklyLog newWeeklyLog = weeklyLog.shallowClone();

		// false
		System.out.println("newWeeklyLog == weeklyLog ? " + (newWeeklyLog == weeklyLog));
		// true
		System.out.println("newAttachment == attachment ? " +
				(newWeeklyLog.getAttachment() == weeklyLog.getAttachment()));
	}
}
