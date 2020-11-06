package testCoupon;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GetSql {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException, AWTException {

        Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        String a = (String)t.getTransferData(DataFlavor.stringFlavor);
        TrayIconDemo.getInstance().message("调用");
//    File z = new File("C:\\Users\\Lenovo\\Desktop\\sql日志.txt");
//    BufferedReader y = new BufferedReader(new FileReader(z));
//    String x;
//    StringBuffer a = new StringBuffer();
//    while ((x = y.readLine()) != null) {
//      a.append(x+"\n");
//    }
        TrayIconDemo.getInstance().message("22");
        String b = null;
        b = a.substring(a.lastIndexOf("method SQL:") + 13, a.length() - 1);
        b = b.substring(0, b.indexOf("\n") - 1);
        String c = null;
        c = a.substring(a.lastIndexOf("parameter:{") + 11, a.length() - 2);
        String[] d = c.split(", ");

        Map<String, String> e = new HashMap<>();
        for (int i = 0; i < d.length; i++) {
            String[] f = d[i].split("=");
            e.put(f[0], f.length > 1 ? f[1] : "");
        }
        for (Iterator<Entry<String, String>> it = e.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> item = it.next();
            if ("".equals(item.getValue()) || "null".equals(item.getValue())) {
                it.remove();
            }
        }
        String f = b;
        for (Iterator<Entry<String, String>> it = e.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> item = it.next();
            f = f.replaceAll(":" + item.getKey(), "\""+item.getValue()+"\"");
        }
        System.out.println(f);

        StringSelection ss = new StringSelection(f);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

}
