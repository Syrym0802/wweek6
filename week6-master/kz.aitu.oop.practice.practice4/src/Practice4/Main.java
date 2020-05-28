package Practice4;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

class Main {
    private static Scanner sc = new Scanner(System.in);
    private static FishTypes tp;
    private static AccessoryTypes ac;
    private static Fishes myfi;
    private static Accessories myac;

    public static void mainPage(){
        System.out.println(" 1 - to see fishes");
        System.out.println("2 - to see accesories");
        System.out.println("3 - to make operations with fishes");
        System.out.println("4 - to make operations with accesories");
        System.out.println("5 - to see total price");
        System.out.println("6 - to see main page");
        System.out.println("Other to exit");
    }

    public static void fi(){
        System.out.println("1 - see fish catalog");
        System.out.println("2 - see your fishes");
        System.out.println("3 - add fish from catalod");
        System.out.println("4 - remove fish from yours");
        System.out.println("5 - to see total price");
        System.out.println("Other to back");
    }

    public static void operationsFish(int op){

        if (op == 1){
            tp.view();
        } else if(op == 2){
            myfi.see();
        } else if (op == 3){
            System.out.println("Enter fish id from catalog");
            int id = sc.nextInt();
            myfi.add(tp.getFish(id));
        } else if(op == 4){
            System.out.println("Enter fish id no matter which");
            int id = sc.nextInt();
            myfi.del(tp.getFish(id));
        } else if (op == 5){
            System.out.println("Total cost: " + myfi.getTotalCost());
        }
        System.out.println();
    }

    public static void aci(){
        System.out.println("1 - see accesories catalog");
        System.out.println("2 - see accessories fishes");
        System.out.println("3 - add accessory from catalod");
        System.out.println("4 - remove accessory from yours");
        System.out.println("5 - to see total price");
        System.out.println("Other to back");
    }


    public static void operationsAccessories(int op){

        if (op == 1){
            ac.view();

        } else if(op == 2){
            myac.see();
        } else if (op == 3){
            System.out.println("Enter accessory id from catalog");
            int id = sc.nextInt();
            myac.add(ac.getAccessory(id));
        } else if(op == 4){
            System.out.println("Enter fish id no matter which");
            int id = sc.nextInt();
            myac.del(ac.getAccessory(id));
        } else if (op == 5){
            System.out.println("Total cost: " + myac.getTotalCost());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/week6" , "root" , "123456");


            tp = new FishTypes();
            ac = new AccessoryTypes();
            myfi = new Fishes();
            myac = new Accessories();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(Queries.select("fishes"));

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int cost = rs.getInt("cost");
                int weight = rs.getInt("weight");
                String color = rs.getString("colour");
                tp.addNew(id , name , cost , weight , color);
            }

            ResultSet rs1 = st.executeQuery(Queries.select("accessories"));
            while(rs1.next()){
                int id = rs1.getInt("id");
                String name = rs1.getString("name");
                int cost = rs1.getInt("cost");
                int volume = rs1.getInt("volume");
                String color = rs1.getString("colour");

                ac.addNew(id , name , cost , volume , color);
            }

            tp.view();


            mainPage();
            while(true){
                int d = sc.nextInt();
                if (d == 1){
                    tp.view();
                } else if (d == 2){
                    ac.view();
                } else if (d == 3){
                    int b = 0;
                    while(true){
                        fi();
                        b = sc.nextInt();
                        if (b <= 0 || b > 5) {
                            mainPage();
                            break;
                        }
                        operationsFish(b);
                    }
                } else if (d == 4){
                    int b = 0;
                    while(true) {
                        aci();
                        b = sc.nextInt();
                        if (b <= 0 || b > 5) {
                            mainPage();
                            break;
                        }
                        operationsAccessories(b);
                    }
                } else if(d == 5){
                    System.out.println(myfi.getTotalCost() + myac.getTotalCost());
                } else if (d == 6){
                    mainPage();
                } else break;
            }

            st.close();
        } catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Thank you for attention");
        }
    }
}