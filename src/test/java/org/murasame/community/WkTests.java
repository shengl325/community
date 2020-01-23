package org.murasame.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "f:/work/wkhtmltopdf/bin/wkhtmltoimage --quality 75  " +
                "http://www.nowcoder" +
                ".com " +
                "f:/work/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }

}
