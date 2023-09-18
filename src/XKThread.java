/**
 * ClassName: XKThread
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author AM
 * @Create 2023/9/16 16:51
 * @Version 1.0
 */
public class XKThread extends Thread {
    @Override
    public void run() {
        System.out.println("run run run is " + this.isAlive() );
    }
    public static void main(String[] args) {
        XKThread xk = new XKThread();
        System.out.println("begin ——— " + xk.isAlive());
        xk.start();
        System.out.println("end ————— " + xk.isAlive());
    }
}