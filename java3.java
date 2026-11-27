import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1 - добавить задачу");
            System.out.println("2 - удалить первую задачу");
            System.out.println("3 - удалить задачу по номеру");
            System.out.println("4 - показать все задачи");
            System.out.println("5 - выход");


            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Введите текст задачи: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Задача успешно добавлена!");
                    break;

                case "2":
                    if (tasks.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        tasks.remove(0);
                        System.out.println("Первая задача удалена.");
                    }
                    break;

                case "3":
                    if (tasks.isEmpty()) {
                        System.out.println("Список пуст, удалять нечего.");
                        break;
                    }
                    System.out.print("Введите номер задачи для удаления: ");
                    try {
                        int taskNumber = Integer.parseInt(scanner.nextLine());

                        int index = taskNumber - 1;

                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index);
                            System.out.println("Задача №" + taskNumber + " удалена.");
                        } else {
                            System.out.println("Неверный номер");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: введите корректное число.");
                    }
                    break;

                case "4":
                    if (tasks.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        System.out.println("\nВаши задачи:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case "5":
                    System.out.println("Помянем!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }
    }
}

