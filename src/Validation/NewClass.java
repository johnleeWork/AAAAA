/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author truon
 */
public class NewClass {

    public static boolean check(String dateOfBirth) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            if (!dateOfBirth.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
                return false;
            } else if (!format.parse(dateOfBirth).before(Calendar.getInstance().getTime())) {
                return false;
            }
        } catch (Exception e) {
        }
        return true;
    }

    public static void main(String[] args) throws ParseException {

       // String date_s = "2011-01-18 00:00:00.0";
        //String a ="\^[a-zA-Z]+@[a-zA-Z0-9]*$\";
        // *** note that it's "yyyy-MM-dd hh:mm:ss" not "yyyy-mm-dd hh:mm:ss"  
//        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date date = dt.parse(date_s);
String a="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
String b="^[a-zA-Z]+@[a-zA-Z0-9]*$";
        String c="a@gma.com".charAt(0)+"";
        //System.out.println("");
        System.out.println(c.matches("[^0-9]"));
        //f
        System.out.println("1a@f.com".matches(a));
        //t

        // *** same for the format String below
//        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(dt1.format(date));

    }

}
