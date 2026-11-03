// مراجعة لمادة OOP 

import java.util.Date;
import java.util.Locale;
// import هو استدعاء مكتبة جاهزة من جافا، مكتبة Date و Locale
// util هي مكتبة جاهزة من جافا، مكتبة Date و Locale

public class Hello // اسم الكلاس لازم يكون نفس اسم الملف 
// public تعني ان الكلاس متاح للجميع
// private تعني ان الكلاس متاح فقط داخل نفس الحزمة
{
    public static void main(String[] args) // args هو اسم المصفوفة، يمكن تغييره، لكن هذا الاسم متعارف عليه
    // static تعني ان الميثود متاحة للجميع بدون الحاجة لانشاء كائن من الكلاس
    // void تعني ان الميثود لا ترجع قيمة
    // main هو اسم الميثود الرئيسي في البرنامج
    {
        Date date = new Date(); //Date هو نوع بيانات جاهز من جافا، يمثل التاريخ والوقت الحالي
        Boolean hasValue = null; // null في الجافا معناها مافي شي، لذلك الطباعة تكون false

        System.out.println("Hello\nWorld\nMy name is Khuloud!"); // \n لسطر جديد
        System.out.printf("%S%n%S%n", "Welcome to", "Java Programming!"); //  افضل طريقةprintf لاستخدامها
        System.out.printf("Hello %s%n", "World"); // طريقه مربكه شوي

        System.out.printf("%b%n", hasValue); // null في الجافا معناها مافي شي، لذلك الطباعة تكون false
        System.out.printf("%B%n", false); // false معناها خطأ
        System.out.printf("%B%n", 5.3 > 0); // true معناها صح
        System.out.printf(Locale.US, "%,d%n", 10000); // 10,000
        System.out.printf(Locale.ITALY, "%,d%n", 10000); // 10.000
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);

        // printf characters:
        // %s String نص
        // %n Newline سطر جديد
        // %f Float عدد عشري
        // %t Time/Date وقت او تاريخ
        // %b اختصار ل Boolean Formatting يعني يكون  true او false فقط

        // مكتبات في جافا:
        // java.lang: مكتبة جاهزة من جافا، تحتوي على الكلاسات
        // java.util: مكتبة جاهزة من جافا، تحتوي على الكلاسات
        // java.io: مكتبة جاهزة من جافا، تحتوي على الكلاسات
        // java.net: مكتبة جاهزة من جافا، تحتوي على الكلاسات

        System.out.println("Hello\nWorld\nMy name is Khuloud!"); // ثلاثة سطور 
       
        // if statement: if الشرط صحيح ينفذ الكود، اذا الشرط خطأ يتخطى الكود
        int grade = 75;

        if(grade >= 60)
            System.out.println("Passed");
        else
            System.out.println("Failed");

    }
}
