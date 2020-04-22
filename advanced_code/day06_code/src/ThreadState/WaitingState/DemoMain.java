
/*

    Waiting(无限等待状态)：一个正在无限期等待另一个线程执行一个唤醒动作的线程处于这一状态。如下等待唤醒案例：
线程A先获取到锁对象，随后使用锁对象调用wait()方法进入无限等待状态并且会释放锁对象。此时线程B就会获取到锁对象，
然后使用锁对象调用notify()方法唤醒线程A并且会释放锁对象，线程A被唤醒后获取到锁对象进入可运行状态。

    线程A、B利用同一个锁对象调用wait()、notify()方法实现了线程之间的通信，是线程之间的一种协作机制。由此可见：
锁对象是线程之间进行通信的媒介，只有使用同一个锁对象的线程才能进行通信。

#.注意事项：

(1).wait()、notify()方法是Object类中的方法，并且只有锁对象调用这些方法才能实现线程间的通信。

(2).唤醒方法：
            void notify()：唤醒在此对象锁上等待的单个线程，若有多个线程在此对象锁上等待则随机唤醒一个
            void notifyAll()：唤醒在此对象锁上等待的所有线程
    可以有多个线程使用同一个锁对象调用wait()方法，相继进入无限等待状态，此时"用来唤醒的线程"使用该锁对象调用notifyAll()方法
会唤醒所有线程，使用notify()方法会随机唤醒其中一个线程。

(3).Timed Waiting、Waiting状态的区别：
    进入无限等待状态的线程必须要被其他线程唤醒才能醒来，但是使用wait(参数)方法进入计时等待状态的线程，当计时结束后会自动醒来，
而且计时未结束时也可以被其他线程唤醒。

 */

package ThreadState.WaitingState;

public class DemoMain {

    static Object obj = new Object();

    public static void main(String[] args) {

        // 线程A
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "--- 获取到锁对象，调用wait方法，进入waiting状态并释放锁对象");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "--- 从waiting状态中醒来，获取到锁对象，进入可运行状态继续执行");
                }
            }
        }, "等待线程").start();

        // 线程B
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "--- 等待3秒钟");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "--- 获取到锁对象，调用notify方法，唤醒线程A并释放锁对象");
                        obj.notify();
                    }
                }
            }
        }, "唤醒线程").start();

    }
}
