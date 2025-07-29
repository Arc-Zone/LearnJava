import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private static  final  Scanner sc = new Scanner(System.in);
    private static final  ArrayList<String> list = new ArrayList<>();
    public  static void Menu(){ 
        System.out.println("======TodoList======");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Get Task ");
        System.out.println("4. Exit");   
    }

    public static void main(String[]  args){
        int choice = 0;
        do{
            Menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    AddTask();
                break;
                case 2:
                    DeleteTask();
                break;
                case 3:
                    GetTask();
                break;
                case 4 :
                System.out.println("end of programme");
                break;
                default:
                System.out.println("Choisisser une option viable");
                    break;
            }
        }while(choice != 4);
        sc.close();
    }

        public static void AddTask (){
            System.out.print("Task :");
            String task = sc.nextLine();
            list.add(task);
            if(!list.isEmpty()){
                System.out.println("Tache Ajouté" );
            }
        }

        public static void DeleteTask(){
            GetTask();
            System.out.println("what do u want delete ?");
            String idDeletetask = sc.nextLine().trim();
            int idx = Integer.parseInt(idDeletetask) - 1;
            list.remove(idx);
            System.out.println("Task Deleted");
        }

        public static void GetTask (){
            if(!list.isEmpty()){
                for(int i = 0 ; i < list.size(); i++){
                        System.out.println( "\u001B[32m" + (i + 1) + " - " + list.get(i) +"\u001B[0m");
                }
                
                }
            } 
        }
        