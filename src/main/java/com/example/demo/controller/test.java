package com.example.demo.controller;

import com.example.demo.entity.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {


    /*    // 定义一个任务
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Run timerTask：" + new Date());
            }
        };
        // 计时器
        Timer timer = new Timer();
        // 添加执行任务（延迟 1s 执行，每 3s 执行一次）
        timer.schedule(timerTask, 1000, 3000);
    }
*/

        //任务执行时间长影响其他任务
   /*     // 定义任务 1
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("进入 timerTask 1：" + new Date());
                try {
                    // 休眠 5 秒
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Run timerTask 1：" + new Date());
            }
        };
        // 定义任务 2
        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Run timerTask 2：" + new Date());
            }
        };
        // 计时器
        Timer timer = new Timer();
        // 添加执行任务（延迟 1s 执行，每 3s 执行一次）
        timer.schedule(timerTask, 1000, 3000);
        timer.schedule(timerTask2, 1000, 3000);
*/
        //任务异常影响其他任务
        // 定义任务 1
    /*    TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("进入 timerTask 1：" + new Date());
                // 模拟异常
                int num = 8 / 0;
                System.out.println("Run timerTask 1：" + new Date());
            }
        };
        // 定义任务 2
        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Run timerTask 2：" + new Date());
            }
        };
        // 计时器
        Timer timer = new Timer();
        // 添加执行任务（延迟 1s 执行，每 3s 执行一次）
        timer.schedule(timerTask, 1000, 3000);
        timer.schedule(timerTask2, 1000, 3000);
*/
    // Timer 类实现定时任务的优点是方便，因为它是 JDK 自定的定时任务，但缺点是任务如果执行时间太长或者是任务执行异常，会影响其他任务调度，所以在生产环境下建议谨慎使用。

    /*    // 创建任务队列
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(10); // 10 为线程数量
        // 执行任务
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Run Schedule：" + new Date());
        }, 1, 3, TimeUnit.SECONDS); // 1s 后开始执行，每 3s 执行一次
 */

       // 任务超时执行测试
// 创建任务队列
       /* ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(10);
        // 执行任务 1
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("进入 Schedule：" + new Date());
            try {
                // 休眠 5 秒
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Run Schedule：" + new Date());
        }, 1, 3, TimeUnit.SECONDS); // 1s 后开始执行，每 3s 执行一次
        // 执行任务 2
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Run Schedule2：" + new Date());
        }, 1, 3, TimeUnit.SECONDS); // 1s 后开始执行，每 3s 执行一次

*/
        //任务异常测试
      /*  // 创建任务队列
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(10);
        // 执行任务 1
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("进入 Schedule：" + new Date());
            // 模拟异常
            int num = 8 / 0;
            System.out.println("Run Schedule：" + new Date());
        }, 1, 3, TimeUnit.SECONDS); // 1s 后开始执行，每 3s 执行一次
        // 执行任务 2
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Run Schedule2：" + new Date());
        }, 1, 3, TimeUnit.SECONDS); // 1s 后开始执行，每 3s 执行一次
*/

       // ScheduledExecutorService 小结
      //  在单机生产环境下建议使用 ScheduledExecutorService 来执行定时任务，它是 JDK 1.5 之后自带的 API，因此使用起来也比较方便，并且使用 ScheduledExecutorService 来执行任务，不会造成任务间的相互影响。





    }

}
