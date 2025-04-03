package com.ttt.Grid;

public class Grid {
    static String a = "┌──────────┬──────────┬──────────┐";
    static String b = "│          │          │          │";
    static String c = "│          │          │          │";
    static String d = "│          │          │          │";
    static String e = "│          │          │          │";
    static String f = "├──────────┼──────────┼──────────┤";
    static String g = "│          │          │          │";
    static String h = "│          │          │          │";
    static String j = "│          │          │          │";
    static String k = "│          │          │          │";
    static String m = "├──────────┼──────────┼──────────┤";
    static String n = "│          │          │          │";
    static String p = "│          │          │          │";
    static String q = "│          │          │          │";
    static String r = "│          │          │          │";
    static String s = "└──────────┴──────────┴──────────┘";

    static String b1 = "  \\  /  ";
    static String b2 = "   \\/   ";
    static String b3 = "   /\\   ";
    static String b4 = "  /  \\  ";

    static String a1 = "+──────+";
    static String a2 = "│      │";
    static String a3 = "│      │";
    static String a4 = "+──────+";

    public static void printGrid() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        System.out.println(n);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }

    public static void placePlayer(String loc, String player) {
        if (loc.equals("1")) {
            if (player.equals("x")) {
                b = b.substring(0, 2) + b1 + b.substring(10, 34);
                c = c.substring(0, 2) + b2 + c.substring(10, 34);
                d = d.substring(0, 2) + b3 + d.substring(10, 34);
                e = e.substring(0, 2) + b4 + e.substring(10, 34);
            } else {
                b = b.substring(0, 2) + a1 + b.substring(10, 34);
                c = c.substring(0, 2) + a2 + c.substring(10, 34);
                d = d.substring(0, 2) + a3 + d.substring(10, 34);
                e = e.substring(0, 2) + a4 + e.substring(10, 34);
            }
        } else if (loc.equals("2")) {
            if (player.equals("x")) {
                b = b.substring(0, 13) + b1 + b.substring(21, 34);
                c = c.substring(0, 13) + b2 + c.substring(21, 34);
                d = d.substring(0, 13) + b3 + d.substring(21, 34);
                e = e.substring(0, 13) + b4 + e.substring(21, 34);
            } else {
                b = b.substring(0, 13) + a1 + b.substring(21, 34);
                c = c.substring(0, 13) + a2 + c.substring(21, 34);
                d = d.substring(0, 13) + a3 + d.substring(21, 34);
                e = e.substring(0, 13) + a4 + e.substring(21, 34);
            }
        } else if (loc.equals("3")) {
            if (player.equals("x")) {
                b = b.substring(0, 24) + b1 + b.substring(32, 34);
                c = c.substring(0, 24) + b2 + c.substring(32, 34);
                d = d.substring(0, 24) + b3 + d.substring(32, 34);
                e = e.substring(0, 24) + b4 + e.substring(32, 34);
            } else {
                b = b.substring(0, 24) + a1 + b.substring(32, 34);
                c = c.substring(0, 24) + a2 + c.substring(32, 34);
                d = d.substring(0, 24) + a3 + d.substring(32, 34);
                e = e.substring(0, 24) + a4 + e.substring(32, 34);
            }
        }
    }

}
