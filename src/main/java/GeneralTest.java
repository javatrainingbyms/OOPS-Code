
public interface GeneralTest {
	public void testSave();
	public void testUpdate();
	public void deleteTest();
	public void findById();
	public static void show() {
		System.out.println("its from static method...");
	}
	public default void testCommon() {
		System.out.println("its a common test...!");
	}
	//..
	//..
}
