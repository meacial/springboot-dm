package com.meacial.tools;

import com.meacial.utils.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * java调用cli,实现命令行工具
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 3:33
 * @see {https://www.douban.com/note/580427929/}
 * @see {http://blog.csdn.net/q1059081877q/article/details/48050735}
 * @see {http://www.ibm.com/developerworks/cn/java/j-lo-commonscli/}
 *
 *
 * </pre>
 * 使用管道命令执行带密码执行sudo命令

String cmds=“echo 'password' | sudo -S /usr/bin/pdf2htmlEX -h ”；

这个-S是读取前面的echo的输出为password

我的这个命令在java中老是不成功

Process p = Runtime.getRuntime().exec(cmds);

原因：不会被再次解析，管道符失效

正确的办法：

Linux下：

String[] command = { "/bin/sh", "-c", cmds };

Process ps = Runtime.getRuntime().exec(command );

windows下：

String[] command = { "cmd", "/c", cmds };

Process ps = Runtime.getRuntime().exec(command );
 */
final
public class WinCliTool {

    public static void main(String[] args) throws IOException, InterruptedException {
        taskkillWithPort(8080);
    }


    private static void ping(String host) throws IOException {
        Process p = Runtime.getRuntime().exec(host);
        printResultAndDistroyProcess(p,true);
    }

    private static final void netstat(int port) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec(new String[]{"cmd", "/c", "netstat -ano|findstr " + port + "|findstr LISTENING"});
        printResultAndDistroyProcess(p,true);
    }

    private static final void taskkill(int pid) throws IOException {
        Process p = Runtime.getRuntime().exec(new String[]{"cmd","/c","taskkill -PID " + pid + " -F"});
        // Process p = Runtime.getRuntime().exec("taskkill -PID " + pid + " -F");
        printResultAndDistroyProcess(p, true);
    }
    private static final void taskkillWithPort(int port) throws IOException {
        Process p = Runtime.getRuntime().exec(new String[]{"cmd", "/c", "netstat -ano|findstr " + port + "|findstr LISTENING"});
        Object pid = get(p, 5, true); // 第5列为pid
        System.out.println(pid);
        taskkill(Integer.parseInt(String.valueOf(pid)));
    }





    private final static String DEFAULT_CHARSET = "GBK";


    private static final Object get(Process p,int index,boolean isTest) {
        List<String[]> list = printResultAndDistroyProcess(p,isTest);
        if (list.isEmpty() == false) {
            return list.get(0)[index];
        }
        return "";
    }

    private static final List<String[]> printResultAndDistroyProcess(Process p,boolean isTest) {
        List<String[]> list = new ArrayList<String[]>();
        try {
            InputStream is = p.getInputStream();
            BufferedReader br = null;
            br = new BufferedReader(new InputStreamReader(is, DEFAULT_CHARSET));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (isTest) System.out.println(line);
                list.add(StringUtils.splitByWhite(line));
            }
            p.waitFor();
            br.close();
            is.close();
            p.destroy();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
